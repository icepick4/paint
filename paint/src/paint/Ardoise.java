/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package paint;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Component;
import java.awt.image.BufferedImage;
import java.awt.Robot;
import java.awt.Graphics2D;
import java.awt.AWTException;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import paint.models.Tool;

/**
 *
 * @author Rémi JARA
 */
public class Ardoise extends javax.swing.JFrame implements IDrawer{
    private Slate slate;
    private TableModelInspector model;
    private String path;
    private Inspecteur inspecteurView;
    private String string;
    /**
     * Creates new form Ardoise
     */
    public Ardoise() {
        this.initComponents();
    }

    public static JCheckBoxMenuItem getInspecteur(){
        return Ardoise.inspecteur;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        controlPanel = new javax.swing.JPanel();
        colorPanel = new javax.swing.JPanel();
        CHOOSER = new javax.swing.JToggleButton();
        ROUND = new javax.swing.JToggleButton();
        SQUARE = new javax.swing.JToggleButton();
        STRING = new javax.swing.JToggleButton();
        propertiesPanel = new javax.swing.JPanel();
        width = new javax.swing.JSpinner();
        checkBoxLisser = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        basePanel = new javax.swing.JPanel();
        statusBar = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        nouveauMenuItem = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        ouvrirMenuItem = new javax.swing.JMenuItem();
        enregistrerMenuItem = new javax.swing.JMenuItem();
        enregistrer_sousMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        quitterMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        inspecteur = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Paint");
        setPreferredSize(new java.awt.Dimension(600, 600));

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new java.awt.BorderLayout());
        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        colorPanel.setBackground(new java.awt.Color(255, 0, 0));
        colorPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        colorPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colorPanelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout colorPanelLayout = new javax.swing.GroupLayout(colorPanel);
        colorPanel.setLayout(colorPanelLayout);
        colorPanelLayout.setHorizontalGroup(
            colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 123, Short.MAX_VALUE)
        );
        colorPanelLayout.setVerticalGroup(
            colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
        );

        CHOOSER.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint/assets/aaa.png"))); // NOI18N
        CHOOSER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHOOSERActionPerformed(evt);
            }
        });

        ROUND.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint/assets/aab.png"))); // NOI18N
        ROUND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ROUNDActionPerformed(evt);
            }
        });

        SQUARE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint/assets/aac.png"))); // NOI18N
        SQUARE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SQUAREActionPerformed(evt);
            }
        });
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(CHOOSER);
        buttonGroup.add(ROUND);
        buttonGroup.add(SQUARE);
        buttonGroup.add(STRING);

        STRING.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint/assets/t.png"))); // NOI18N
        STRING.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STRINGActionPerformed(evt);
            }
        });

        propertiesPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Properties"));

        width.setModel(new javax.swing.SpinnerNumberModel(5, 1, 50, 1));

        checkBoxLisser.setText("Lisser");

        jLabel1.setText("Px");

        javax.swing.GroupLayout propertiesPanelLayout = new javax.swing.GroupLayout(propertiesPanel);
        propertiesPanel.setLayout(propertiesPanelLayout);
        propertiesPanelLayout.setHorizontalGroup(
            propertiesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, propertiesPanelLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(propertiesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(checkBoxLisser, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(width))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        propertiesPanelLayout.setVerticalGroup(
            propertiesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(propertiesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(propertiesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(width, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkBoxLisser)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelLayout.createSequentialGroup()
                        .addComponent(propertiesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelLayout.createSequentialGroup()
                        .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, controlPanelLayout.createSequentialGroup()
                                .addComponent(CHOOSER, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ROUND, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SQUARE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(STRING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(colorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))))
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(colorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SQUARE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(STRING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ROUND, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CHOOSER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addComponent(propertiesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        getContentPane().add(controlPanel, java.awt.BorderLayout.EAST);

        basePanel.setBackground(new java.awt.Color(102, 102, 102));
        basePanel.setPreferredSize(null);
        jScrollPane1.setViewportView(basePanel);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);
        getContentPane().add(statusBar, java.awt.BorderLayout.SOUTH);

        this.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        zoomPanel = new javax.swing.JPanel();
        zoomLabel = new javax.swing.JLabel();
        zoomSlider = new javax.swing.JSlider();

        jMenu1.setText("File");

        nouveauMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        nouveauMenuItem.setText("Nouveau");
        nouveauMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nouveauMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(nouveauMenuItem);
        jMenu1.add(jSeparator2);

        ouvrirMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ouvrirMenuItem.setText("Ouvrir");
        ouvrirMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ouvrirMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(ouvrirMenuItem);

        enregistrerMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        enregistrerMenuItem.setText("Enregistrer");
        enregistrerMenuItem.setEnabled(false);
        enregistrerMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enregistrerMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(enregistrerMenuItem);

        enregistrer_sousMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        enregistrer_sousMenuItem.setText("Enregistrer sous");
        enregistrer_sousMenuItem.setEnabled(false);
        enregistrer_sousMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enregistrer_sousMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(enregistrer_sousMenuItem);
        jMenu1.add(jSeparator1);

        quitterMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        quitterMenuItem.setText("Quitter");
        quitterMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitterMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(quitterMenuItem);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        inspecteur.setText("Inspecteur");
        inspecteur.setEnabled(false);
        inspecteur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inspecteurActionPerformed(evt);
            }
        });
        jMenu2.add(inspecteur);

        jMenuBar1.add(jMenu2);

        zoomLabel.setText("Zoom:");
        zoomLabel.setEnabled(false);

        zoomSlider.setMinimum(1);
        zoomSlider.setPaintLabels(true);
        zoomSlider.setValue(1);
        zoomSlider.setEnabled(false);
        zoomSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                zoomSliderStateChanged(evt);
            }
        });

        javax.swing.GroupLayout zoomPanelLayout = new javax.swing.GroupLayout(zoomPanel);
        zoomPanel.setLayout(zoomPanelLayout);
        zoomPanelLayout.setHorizontalGroup(
            zoomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(zoomPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(zoomLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(zoomSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        zoomPanelLayout.setVerticalGroup(
            zoomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(zoomPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(zoomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(zoomSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(zoomLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        statusBar.add(zoomPanel, java.awt.BorderLayout.LINE_END);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quitterMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitterMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_quitterMenuItemActionPerformed

    private void nouveauMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nouveauMenuItemActionPerformed
        if(this.closeSlate()){
            //open newdialog.java
            NewDialog dialog = new NewDialog(this, true);
            Dimension dimension = dialog.showDialog();
            //créer un objet slate avec les dimensions
            //si la dimension est diférente de null
            if (dimension != null) {
                this.newSlate(dimension, null);
            }
        }
    }//GEN-LAST:event_nouveauMenuItemActionPerformed

    private void colorPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorPanelMouseClicked
        Color background = JColorChooser.showDialog(null, "Choisissez votre couleur", this.colorPanel.getBackground());
        if (background != null) {
            this.colorPanel.setBackground(background);
        }
    }//GEN-LAST:event_colorPanelMouseClicked

    private void CHOOSERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHOOSERActionPerformed
        //for all components in the panel disable them
        if (CHOOSER.isSelected()) {
            for (Component component : propertiesPanel.getComponents()) {
                component.setEnabled(false);
            }
        }
        else{
            for (Component component : propertiesPanel.getComponents()) {
                component.setEnabled(true);
            }
        }
    }//GEN-LAST:event_CHOOSERActionPerformed

    private void ROUNDActionPerformed(java.awt.event.ActionEvent evt) {                                        
        //for all components in the panel disable them
        if (CHOOSER.isSelected()) {
            for (Component component : propertiesPanel.getComponents()) {
                component.setEnabled(false);
            }
        }
        else{
            for (Component component : propertiesPanel.getComponents()) {
                component.setEnabled(true);
            }
        }
    }

    private void SQUAREActionPerformed(java.awt.event.ActionEvent evt) {                                        
        //for all components in the panel disable them is chooser selected
        if (CHOOSER.isSelected()) {
            for (Component component : propertiesPanel.getComponents()) {
                component.setEnabled(false);
            }
        }
        else{
            for (Component component : propertiesPanel.getComponents()) {
                component.setEnabled(true);
            }
        }
    }

    private void STRINGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STRINGActionPerformed
        //for all components in the panel disable them is chooser selected
        if (CHOOSER.isSelected()) {
            for (Component component : propertiesPanel.getComponents()) {
                component.setEnabled(false);
            }
        }
        else{
            for (Component component : propertiesPanel.getComponents()) {
                component.setEnabled(true);
            }
        }
        if(STRING.isSelected()){
            String m = JOptionPane.showInputDialog("Entrez votre texte");
            if (m != null) {
                this.string = m;
            }
        }
    }//GEN-LAST:event_STRINGActionPerformed

    private boolean enregistrer_sousMenuItemActionPerformed (java.awt.event.ActionEvent evt) {                                                    
        //create a jfile chooser to save a file, take the path choosen by the user
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        //filter the files, only jpeg, jpg, and png
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPEG & PNG Images", "jpg", "jpeg", "png");
        fileChooser.setFileFilter(filter);
        int result = fileChooser.showSaveDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            //take the path
            String path = fileChooser.getSelectedFile().getAbsolutePath();
            this.path = path;
            saveImage(path);
            this.enregistrerMenuItem.setEnabled(true);
            return true;
        }
        return false;
    }                                                   

    private boolean enregistrerMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enregistrerMenuItemActionPerformed
        //if the path is null, launch enregistrersous
        if (this.path == null) {
            if(!this.enregistrer_sousMenuItemActionPerformed(null)){
                return false;
            }
        }
        else{
            saveImage(path);
        }
        return true;
    }//GEN-LAST:event_enregistrerMenuItemActionPerformed

    private void inspecteurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inspecteurActionPerformed
        //if checked, open inspecteur JFrame
        if (inspecteur.isSelected()) {
            Inspecteur inspecteurFrame = new Inspecteur();
            inspecteurFrame.setVisible(true);
            inspecteurFrame.setVisible(model);
            this.inspecteurView = inspecteurFrame;
        }
        //else close the inspector
        else{
            this.inspecteurView.dispose();
        }
    }//GEN-LAST:event_inspecteurActionPerformed

    private void ouvrirMenuItemActionPerformed(java.awt.event.ActionEvent evt) {                                               
        if(!this.closeSlate()){
            return;
        }
        //create a jfile chooser to open a file, take the path choosen by the user
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPEG & PNG Images", "jpg", "jpeg", "png");
        fileChooser.setFileFilter(filter);
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            //take the path
            String path = fileChooser.getSelectedFile().getAbsolutePath();
            this.path = path;
            //create var of the image choosen
            BufferedImage image = null;
            try {
                image = ImageIO.read(new File(path));
            } catch (IOException ex) {
                ex.getMessage();
            }
            //get size of the image
            Dimension dimension = new Dimension(image.getWidth(), image.getHeight());
            //create a slate with the dimension
            this.newSlate(dimension, image);
        }
    }

    private void formWindowClosing(java.awt.event.WindowEvent evt) {                                   
        this.closeWindow();
    }

    /**
     * Lorsque l'utilisateur se sert du {@link JSlider} pour modifier le zoom de l'image
     * @param evt Correspond à l'évènement reçu
     */
    private void zoomSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_zoomSliderStateChanged
        if(this.slate != null)
            this.slate.zoom(zoomSlider.getValue() / 10 + 1);
    }//GEN-LAST:event_zoomSliderStateChanged

    private void saveImage(String path){
        //if the path doesnt end with .png or .jpg, add it
        if (!path.endsWith(".png") && !path.endsWith(".jpg") && !path.endsWith(".jpeg")) {
            path += ".png";
        }
        BufferedImage imagebuf=null;
        try {
            imagebuf = new Robot().createScreenCapture(this.slate.getBounds());
        } catch (AWTException e1) {
            e1.printStackTrace();
        }  
         Graphics2D graphics2D = imagebuf.createGraphics();
         this.slate.paint(graphics2D);
         try {
            ImageIO.write(imagebuf,"jpeg", new File(path));
        } catch (Exception e) {
            System.out.println("error on save");
        }
    }

    private void newSlate(Dimension dimension, BufferedImage image){
        //remove the slate if it exists
        if (this.slate != null) {
            this.slate.removeMouseListener(this.slate);
            this.slate.removeMouseMotionListener(this.slate);
            this.slate.setVisible(false);
        }
        
        Slate slate = new Slate(dimension, this, image);
        this.slate = slate;
        TableModelInspector model = new TableModelInspector(this.slate);
        this.model = model;
        this.slate.setModel(this.model);
        basePanel.setPreferredSize(dimension);
        //ajouter le slate au jpanel
        basePanel.add(slate);
        //mettre à jour la fenêtre
        slate.addMouseListener(slate);
        slate.addMouseMotionListener(slate);
        basePanel.revalidate();
        enregistrerMenuItem.setEnabled(true);
        enregistrer_sousMenuItem.setEnabled(true);
        zoomLabel.setEnabled(true);
        zoomSlider.setEnabled(true);
        inspecteur.setEnabled(true);
        
        //if images != null, set title to the image name
        if (image != null) {
            //get image name in the path
            String name = path.substring(path.lastIndexOf("\\") + 1);
            this.setTitle("Paint - "+ name);
        }
    }

    private void closeWindow(){
        //if slate is null, close the window
        if (this.slate == null) {
            System.exit(0);
        }
        //check if points list is empty, if not, ask the user if he wants to save the image
        if (!this.model.getPaints().isEmpty()) {
            int result = JOptionPane.showConfirmDialog(null, "Voulez-vous enregistrer l'image avant de quitter ?", "Enregistrer", JOptionPane.YES_NO_CANCEL_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                this.enregistrerMenuItem.doClick();
                System.exit(0);
            }
            else if (result == JOptionPane.NO_OPTION) {
                this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                this.dispose();
            }
            else{
                this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
                return;
            }
        }
        else{
            System.exit(0);
        }
    }

    private boolean closeSlate(){
        //if slate is null, close the window
        if (this.slate == null) {
            return true;
        }
        //check if points list is empty, if not, ask the user if he wants to save the image
        if (!this.model.getPaints().isEmpty()) {
            int result = JOptionPane.showConfirmDialog(null, "Voulez-vous enregistrer l'image avant d'en ouvrir une nouvelle ?", "Ouvrir", JOptionPane.YES_NO_CANCEL_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                System.out.print("j'enregistre");
                if(!this.enregistrerMenuItemActionPerformed(null)){
                    return false;
                }
            }
            else if (result == JOptionPane.NO_OPTION) {
                return true;
            }
            else{
                return false;
            }
        }
        return true;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ardoise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ardoise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ardoise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ardoise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ardoise().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton CHOOSER;
    private javax.swing.JToggleButton ROUND;
    private javax.swing.JToggleButton SQUARE;
    private javax.swing.JToggleButton STRING;
    private javax.swing.JPanel basePanel;
    private javax.swing.JCheckBox checkBoxLisser;
    private javax.swing.JPanel colorPanel;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JMenuItem enregistrerMenuItem;
    private javax.swing.JMenuItem enregistrer_sousMenuItem;
    private static javax.swing.JCheckBoxMenuItem inspecteur;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel zoomLabel;
    private javax.swing.JPanel zoomPanel;
    private javax.swing.JSlider zoomSlider;
    private javax.swing.JMenuItem nouveauMenuItem;
    private javax.swing.JMenuItem ouvrirMenuItem;
    private javax.swing.JPanel propertiesPanel;
    private javax.swing.JMenuItem quitterMenuItem;
    private javax.swing.JPanel statusBar;
    private javax.swing.JSpinner width;
    // End of variables declaration//GEN-END:variables

    @Override
    public Color getSlateColor() {
        return colorPanel.getBackground();
    }

    @Override
    public int getSlateWidth() {
        return (int) width.getValue();
    }

    @Override
    public Tool getSlateTool() {
        //get the selected tool
        Tool tool = null;
        if (CHOOSER.isSelected()) {
            tool = Tool.CHOOSER;
        } else if (ROUND.isSelected()) {
            tool = Tool.ROUND;
        } else if (SQUARE.isSelected()) {
            tool = Tool.SQUARE;
        }
        else if (STRING.isSelected()) {
            tool = Tool.STRING;
        }
        return tool;
    }

    @Override
    public boolean isSlateSmooth() {
        //checkbox lisser
        return checkBoxLisser.isSelected();
    }

    @Override
    public void newColorChoosen(Color color) {
        //return the color in the color chooser
        colorPanel.setBackground(color);
    }

    @Override
    public void newMousePosition(Point point) {
        //return the mouse position from the slate
        System.out.println(point);
    }

    @Override
    public String getString(){
        return string;
    }
}
