/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paint;

import java.util.ArrayList;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Dimension;
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
    private ArrayList<Paint> points;
    
    public Slate(Dimension dimension, IDrawer drawer) {
        this.drawer = drawer;
        this.dimension = dimension;
        //set sizes
        super.setSize(dimension);
        super.setPreferredSize(dimension);
        //this list contains all the point of the canvas
        this.points = new ArrayList<Paint>();
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        //draw a white rectangle
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, this.dimension.width, this.dimension.height);
        //draw all points in the list
        for (Paint point : this.points) {
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
                g2d.fillOval(point.getX(), point.getY(), point.getWidth(), point.getWidth());
            }
            else{
                g2d.fillRect(point.getX(), point.getY(), point.getWidth(), point.getWidth());
            }
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        int x = e.getX() - this.drawer.getSlateWidth() / 2;
        int y = e.getY() - this.drawer.getSlateWidth() / 2;
        
        //add it to the list
        //if the tool is not chooser then add it to the list
        if (this.drawer.getSlateTool() != Tool.CHOOSER && this.drawer.getSlateTool() != null) {
            //create an object Paint smooth is the value of the checkbox smooth
            Paint point = new Paint(x,y, this.drawer.getSlateWidth(), this.drawer.isSlateSmooth(), this.drawer.getSlateColor(), this.drawer.getSlateTool());
            this.points.add(point);
        }
        this.repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        boolean found = false;
        //if tool is the chooser, change the color
        if (this.drawer.getSlateTool() == Tool.CHOOSER) {
            //search the point clicked in paints list
            for (Paint point : this.points) {
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
            int x = e.getX() - this.drawer.getSlateWidth() / 2;
            int y = e.getY() - this.drawer.getSlateWidth() / 2;
            //add a point to the list
            Paint point = new Paint(x,y, this.drawer.getSlateWidth(), this.drawer.isSlateSmooth(), this.drawer.getSlateColor(), this.drawer.getSlateTool());
            this.points.add(point);
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
