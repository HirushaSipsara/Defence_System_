/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.util.ArrayList;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.util.List;


interface Vehicle {
    void updateSliderValue(int value);
    void areaCheck(boolean x);
    public void sendmsg();
    public void receivedmsg(String msg);
}

public class MainController extends javax.swing.JFrame{
    private List<Vehicle> vehiclelist = new ArrayList<>();
    private static MainController mainController;

    private MainController(){
        initComponents();
        setVisible(true);
    }
    
    public static MainController getInstant(){
        if(mainController==null){
            mainController=new MainController();
        }
        return mainController;
    }

    // Method to add Vehicles
    public void addVehicle(Vehicle obj) {
        vehiclelist.add(obj);
    }

    // Method to notify Vehicle about slider value change
    private void notifySlider(int value) {
        for (Vehicle observer : vehiclelist) {
            observer.updateSliderValue(value);
        }
    }
    
    public void recivemsg(String msg){
        jTextRecive.setText(jTextRecive.getText()+msg);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jCheckBoxArea = new javax.swing.JCheckBox();
        jSliderMain = new javax.swing.JSlider();
        jSliderMain.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                notifySlider(jSliderMain.getValue());
            }
        });
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextRecive = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextSend = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MainControler");
        setBackground(new java.awt.Color(255, 102, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(10, 10));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCheckBox2.setForeground(new java.awt.Color(0, 51, 51));
        jCheckBox2.setText("Send Private");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 32, -1, -1));

        jLabel1.setForeground(new java.awt.Color(153, 255, 153));
        jLabel1.setText("Position");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 157, -1, -1));

        jButton2.setBackground(new java.awt.Color(85, 107, 47));
        jButton2.setText("Send");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 348, -1, -1));

        jLabel2.setForeground(new java.awt.Color(153, 255, 153));
        jLabel2.setText("Ammo Amount");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 73, -1, -1));

        jLabel3.setForeground(new java.awt.Color(153, 255, 153));
        jLabel3.setText("Fuel Amount");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 129, -1, -1));

        jLabel4.setForeground(new java.awt.Color(153, 255, 153));
        jLabel4.setText("Solder Count");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 101, -1, -1));

        jComboBox1.setBackground(new java.awt.Color(255, 51, 0));
        jComboBox1.setForeground(new java.awt.Color(47, 79, 79));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Helecoptor", "Tank", "Submarine" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 29, 112, -1));

        jCheckBoxArea.setForeground(new java.awt.Color(0, 51, 51));
        jCheckBoxArea.setText("Area Clear");
        jCheckBoxArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxAreaActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 32, -1, -1));

        jSliderMain.setMajorTickSpacing(20);
        jSliderMain.setMinorTickSpacing(10);
        jSliderMain.setPaintLabels(true);
        jSliderMain.setPaintTicks(true);
        jSliderMain.setValue(0);
        getContentPane().add(jSliderMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 134, 459, 60));

        jTextRecive.setBackground(new java.awt.Color(176, 196, 222));
        jTextRecive.setColumns(20);
        jTextRecive.setRows(5);
        jScrollPane4.setViewportView(jTextRecive);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 213, 207, 117));

        jButton1.setBackground(new java.awt.Color(85, 107, 47));
        jButton1.setText("Collect Information");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 29, -1, -1));

        jTextSend.setBackground(new java.awt.Color(176, 196, 222));
        jTextSend.setColumns(20);
        jTextSend.setRows(5);
        jScrollPane5.setViewportView(jTextSend);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 213, 212, 117));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 348, 410, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Wallpaper Texture Surface Military Color HD Background.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        for (Vehicle obj : vehiclelist) {
            obj.receivedmsg("Controller Room :- " + jTextField1.getText());
        }
        jTextSend.setText(jTextSend.getText() + "\n" + jTextField1.getText());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCheckBoxAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxAreaActionPerformed
        for (Vehicle obj : vehiclelist) {
            obj.areaCheck(jCheckBoxArea.isSelected());
        }
    }//GEN-LAST:event_jCheckBoxAreaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBoxArea;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    public transient javax.swing.JSlider jSliderMain;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextArea jTextRecive;
    private javax.swing.JTextArea jTextSend;
    // End of variables declaration//GEN-END:variables

    
}
