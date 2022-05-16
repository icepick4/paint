/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paint;


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseListener;
import java.awt.Color;

import paint.models.Paint;
import paint.models.Tool;


/**
 *
 * @author Rémi JARA
 */
public class Slate extends javax.swing.JPanel implements MouseMotionListener, MouseListener{
    private Dimension dimension;
    private IDrawer drawer;
    private BufferedImage image;
    private TableModelInspector model;
    private float factor;
    
    public Slate(Dimension dimension, IDrawer drawer, BufferedImage image) {
        this.drawer = drawer;
        this.dimension = dimension;
        this.factor = 1.0f;
        //set sizes
        setSize(dimension);
        setPreferredSize(dimension);
        setMinimumSize(dimension);
        setMaximumSize(dimension);
        //if image is not null, draw it on the panel
        this.image = image;
        this.repaint();
    }

    public void setModel(TableModelInspector model) {
        this.model = model;
    }

    /**
     * Dé/Zoom le panneau. En réalité c'est ces proportions qui changent et la position et tailles des {@link Paint} changent aussi
     * @param factor Correspond au facteur de zoom (1.0 étant la taille original, 2.0 la taille est doublée, ...)
     */
    public void zoom(float factor){
        this.factor = factor;
        // On crée la nouvelle dimension à partir de la dimension de base multiplié par le factor
        Dimension newDimension = new Dimension((int) (this.dimension.width * factor), (int) (this.dimension.height * factor));
        // On modifie la taille du panneau
        setSize(newDimension);
        setPreferredSize(newDimension);
        setMinimumSize(newDimension);
        setMaximumSize(newDimension);
        
        // Et on valide sa modification de taille (car dynamiquement, nous sommes obligés de forcer son redimensionnement)
        revalidate();
        
        // Puis on repeint tout le panneau (cela tien compte du fait qu'en ayant augmenté la taille du panneau, les Paint ne sont plus placé au même endroit et ne font plus la même taille)
        repaint();
    }

    public void drawImage(BufferedImage image) {
        //draw the image on the panel
        Graphics g = this.getGraphics();
        g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
        g.dispose();
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        //if image is not null, draw it on the panel
        if(this.image != null) {
            g2d.drawImage(this.image, 0, 0, getWidth(), getHeight(), null);
        }        
        if(this.image == null) {
            g2d.setColor(Color.WHITE);
            g2d.fillRect(0, 0, getWidth(), getHeight());
        }
        
        //draw all points in the list
        for (Paint point : this.model.getPaints()) {
            int x = (int) ((point.getX() - point.getWidth() / 2) * this.factor);
            int y = (int) ((point.getY() - point.getWidth() / 2) * this.factor);
            
            // Bien entendu si l'on modifie le zoom du panneau, alors la taille d'un point change aussi. C'est pourquoi on calcule la taille relative au zoom à partir de la taille absolue d'un point
            int size = (int) (point.getWidth() * this.factor);
            //if smooth, activate anti aliasing
            if (point.isSmooth()) {
                g2d.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
            }
            else{
                g2d.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_OFF);
            }
            //draw a circle at each point
            g2d.setColor(point.getColor());
            //if tool is ROUND then draw a circle, if tool is SQUARE then draw a square
            if (point.getTool() == Tool.ROUND) {
                g2d.fillOval(x, y, size, size);
            }
            else{
                g2d.fillRect(x, y, size, size);
            }
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        int x = (int) (e.getX() / Slate.this.factor);
        int y = (int) (e.getY() / Slate.this.factor);
        
        //add it to the list
        //if the tool is not chooser then add it to the list
        if (this.drawer.getSlateTool() != Tool.CHOOSER && this.drawer.getSlateTool() != null) {
            //create an object Paint smooth is the value of the checkbox smooth
            
            Paint point = new Paint(x,y, this.drawer.getSlateWidth(), this.drawer.isSlateSmooth(), this.drawer.getSlateColor(), this.drawer.getSlateTool());
            this.model.getPaints().add(point);
            //update the jtable
            this.model.fireTableDataChanged();
        }
        this.repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        boolean found = false;
        //if tool is the chooser, change the color
        if (this.drawer.getSlateTool() == Tool.CHOOSER) {
            //search the color if image is not null
            if (this.image != null) {
                int x = e.getX();
                int y = e.getY();
                //get the color at this position
                Color color = new Color(this.image.getRGB(x, y));
                //if the color is found, change the color
                if (this.image.getRGB(x, y) != Color.WHITE.getRGB()) {
                    this.drawer.newColorChoosen(color);
                }
                found = true;
            }
            //search the point clicked in paints list
            for (Paint point : this.model.getPaints()) {
                if (point.getX() <= e.getX() && point.getX() + point.getWidth() >= e.getX() && point.getY() <= e.getY() && point.getY() + point.getWidth() >= e.getY()) {
                    //if the point is found, change the color
                    this.drawer.newColorChoosen(point.getColor());
                    found = true;
                }
            }
            if(!found){
                this.drawer.newColorChoosen(Color.WHITE);
            }
        }
        else{
            //set x and y in the middle of the point depending on the width
            int x = (int) (e.getX() / Slate.this.factor);
            int y = (int) (e.getY() / Slate.this.factor);
            //add a point to the list
            Paint point = new Paint(x,y, this.drawer.getSlateWidth(), this.drawer.isSlateSmooth(), this.drawer.getSlateColor(), this.drawer.getSlateTool());
            this.model.getPaints().add(point);
            //update the jtable
            this.model.fireTableDataChanged();
        }
        this.repaint();
    }

    @Override   
    public void mouseMoved(MouseEvent e) {
    }
    @Override
    public void mousePressed(MouseEvent e) {
    }
    @Override
    public void mouseReleased(MouseEvent e) {
    }
    @Override
    public void mouseEntered(MouseEvent e) {
    }
    @Override
    public void mouseExited(MouseEvent e) {
    }
}
