/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package paint;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Component;

import javax.swing.ButtonGroup;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import paint.models.Tool;

/**
 *
 * @author remi
 */
public class Ardoise extends javax.swing.JFrame implements IDrawer{

    /**
     * Creates new form Ardoise
     */
    public Ardoise() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jColorChooser1 = new javax.swing.JColorChooser();
        mainPanel = new javax.swing.JPanel();
        controlPanel = new javax.swing.JPanel();
        colorPanel = new javax.swing.JPanel();
        CHOOSER = new javax.swing.JToggleButton();
        ROUND = new javax.swing.JToggleButton();
        SQUARE = new javax.swing.JToggleButton();
        propertiesPanel = new javax.swing.JPanel();
        width = new javax.swing.JSpinner();
        checkBoxLisser = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
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

        jFrame1.setTitle("Choisissez votre couleur");

        jColorChooser1.setColor(new java.awt.Color(0, 0, 0));
        jColorChooser1.getSelectionModel().addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                jColorChooser1ActionPerformed(e);
            }
        });

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jFrame1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jFrame1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

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

        propertiesPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Properties"));

        width.setModel(new javax.swing.SpinnerNumberModel(1, 1, 50, 1));
        width.setValue(1);

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
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelLayout.createSequentialGroup()
                        .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(controlPanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(CHOOSER, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ROUND, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SQUARE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(colorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelLayout.createSequentialGroup()
                        .addComponent(propertiesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(colorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SQUARE, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(ROUND, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CHOOSER))
                .addGap(18, 18, 18)
                .addComponent(propertiesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        getContentPane().add(controlPanel, java.awt.BorderLayout.EAST);

        jPanel1.setPreferredSize(new java.awt.Dimension(50, 50));
        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

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
        ouvrirMenuItem.setEnabled(false);
        jMenu1.add(ouvrirMenuItem);

        enregistrerMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        enregistrerMenuItem.setText("Enregistrer");
        enregistrerMenuItem.setEnabled(false);
        jMenu1.add(enregistrerMenuItem);

        enregistrer_sousMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        enregistrer_sousMenuItem.setText("Enregistrer sous");
        enregistrer_sousMenuItem.setEnabled(false);
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
        jMenu2.setEnabled(false);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quitterMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitterMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_quitterMenuItemActionPerformed

    private void nouveauMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nouveauMenuItemActionPerformed
        //open newdialog.java
        NewDialog dialog = new NewDialog(this, true);
        Dimension dimension = dialog.showDialog();
        //créer un objet slate avec les dimensions
        //si la dimension est diférente de null
        if (dimension != null) {
            Slate slate = new Slate(dimension, this);
            jPanel1.setPreferredSize(dimension);
            //ajouter le slate au jpanel
            jPanel1.add(slate);
            //mettre à jour la fenêtre
            slate.addMouseListener(slate);
            slate.addMouseMotionListener(slate);
            jPanel1.revalidate();
        }
    }//GEN-LAST:event_nouveauMenuItemActionPerformed

    private void colorPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorPanelMouseClicked
        jFrame1.pack();
        jFrame1.setLocationRelativeTo(null);
        jFrame1.setVisible(true);
        
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

    private void ROUNDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHOOSERActionPerformed
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

    private void SQUAREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHOOSERActionPerformed
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

    private void jColorChooser1ActionPerformed(ChangeEvent evt) {                                                
        //set the font color
        this.colorPanel.setBackground(jColorChooser1.getColor());
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
    private javax.swing.JCheckBox checkBoxLisser;
    private javax.swing.JPanel colorPanel;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JMenuItem enregistrerMenuItem;
    private javax.swing.JMenuItem enregistrer_sousMenuItem;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuItem nouveauMenuItem;
    private javax.swing.JMenuItem ouvrirMenuItem;
    private javax.swing.JPanel propertiesPanel;
    private javax.swing.JMenuItem quitterMenuItem;
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
}
