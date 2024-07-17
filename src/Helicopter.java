/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

public class Helicopter extends javax.swing.JFrame implements Vehicle {
     private int value;
     private boolean areaClear;

    public Helicopter() {
        initComponents();
        setVisible(true);
    }

    @Override
    public void updateSliderValue(int value) {
        this.value = value;
        if(jCheckBox2.isSelected()){
            if (value > 25) {
                jButton1.setEnabled(true);
            } else {
                jButton1.setEnabled(false);
            }

            if (value > 50) {
                jButton2.setEnabled(true);
            } else {
                jButton2.setEnabled(false);
            }

            if (value > 75) {
                jButton3.setEnabled(true);
            } else {
                jButton3.setEnabled(false);
            }
        }
    }
    @Override
    public void areaCheck(boolean x){
        this.areaClear=x;
        if(areaClear){
            jLabel1.setText("Area Cleared");
        }
        if(!areaClear){
            jLabel1.setText("Area Not Cleared");
        }
    }
    @Override
    public void sendmsg(){
        MainController.getInstant().recivemsg("Helicopter : - "+textField1.getText()+"\n");  
    }
    @Override
    public void receivedmsg(String msg){
        jTextArea1.setText(jTextArea1.getText()+ msg+"\n");
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider2 = new javax.swing.JSlider();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jCheckBox2 = new javax.swing.JCheckBox();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        textField1 = new java.awt.TextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 102, 255));
        setLocation(new java.awt.Point(650, 50));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSlider2.setMajorTickSpacing(20);
        jSlider2.setMinorTickSpacing(10);
        jSlider2.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider2.setPaintLabels(true);
        jSlider2.setPaintTicks(true);
        jSlider2.setValue(0);
        getContentPane().add(jSlider2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 18, -1, 331));

        jButton1.setBackground(new java.awt.Color(85, 107, 47));
        jButton1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 2, 14)); // NOI18N
        jButton1.setText("Shoot");
        jButton1.setDefaultCapable(false);
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 52, 128, 42));

        jTextArea1.setBackground(new java.awt.Color(176, 196, 222));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 148, 447, 139));

        jCheckBox2.setForeground(new java.awt.Color(0, 51, 51));
        jCheckBox2.setText("Position");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 111, -1, -1));

        jButton4.setBackground(new java.awt.Color(85, 107, 47));
        jButton4.setText("Send");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 311, -1, -1));

        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Area Not Cleared");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 18, -1, -1));

        textField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField1ActionPerformed(evt);
            }
        });
        getContentPane().add(textField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 311, 377, 26));

        jLabel2.setForeground(new java.awt.Color(153, 255, 153));
        jLabel2.setText("Soldier Count");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 34, -1, -1));

        jLabel3.setForeground(new java.awt.Color(153, 255, 153));
        jLabel3.setText("Ammo Count");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 78, -1, -1));
        getContentPane().add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 29, -1, -1));
        getContentPane().add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 73, -1, -1));

        jButton2.setBackground(new java.awt.Color(85, 107, 47));
        jButton2.setFont(new java.awt.Font("Gill Sans Ultra Bold", 2, 14)); // NOI18N
        jButton2.setText("Missile Operation");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 52, 128, 42));

        jButton3.setBackground(new java.awt.Color(85, 107, 47));
        jButton3.setFont(new java.awt.Font("Gill Sans Ultra Bold", 2, 14)); // NOI18N
        jButton3.setText("Laser Operation");
        jButton3.setEnabled(false);
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 100, 128, 42));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Wallpaper Texture Surface Military Color HD Background.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if(!jCheckBox2.isSelected()){
            jButton1.setEnabled(false);
            jButton2.setEnabled(false);
            jButton3.setEnabled(false);
        }else{
            if (value > 25) {
                jButton1.setEnabled(true);
            } else {
                jButton1.setEnabled(false);
            }

            if (value > 50) {
                jButton2.setEnabled(true);
            } else {
                jButton2.setEnabled(false);
            }

            if (value > 75) {
                jButton3.setEnabled(true);
            } else {
                jButton3.setEnabled(false);
            }
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        sendmsg();
    }//GEN-LAST:event_jButton4ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextArea jTextArea1;
    private java.awt.TextField textField1;
    // End of variables declaration//GEN-END:variables

}
