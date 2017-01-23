/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emct.frames.d_ignition_system;

import emct.forms.default_images;
import java.awt.Point;

/**
 *
 * @author Catalin Glavan
 */
public class high_tension extends javax.swing.JPanel {

    /**
     * Creates new form injectors
     */
    public high_tension(Point setPoint) {
        this.point = setPoint;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel91 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        fig22 = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel92 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(226, 224, 211));

        jLabel91.setText("• Using insulated pliers,hold test spark plug 6 mm from suitable earth. ");

        jLabel90.setText("• Connect test spark plug to high-tension lead. ");

        fig22.setBackground(java.awt.Color.orange);
        fig22.setText("FIG 22");
        fig22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fig22.setFocusable(false);
        fig22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fig22ActionPerformed(evt);
            }
        });

        jLabel92.setText("• Briefly crank engine. ");

        jLabel81.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(15, 89, 193));
        jLabel81.setText("Checking -");

        jLabel93.setText("• Check for strong blue spark. ");

        jLabel80.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(15, 89, 193));
        jLabel80.setText("High-tension spark");

        jLabel97.setText("• Repeat test for each high-tension lead. ");

        jLabel108.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel108.setText("NOTE: Disconnect injector harness multi-plug before cranking tests, to avoid damage to catalytic converter(s).");

        jLabel109.setText("• Ensure ignition switched OFF.");

        jLabel110.setText("• Disconnect one high-tension lead from spark plug.");

        jLabel98.setText("• If no spark is visible:Carry out high-tension circuit component checks.Refer to General Test  Procedures . ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel80)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel81)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fig22))
                                    .addComponent(jLabel108)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel110)
                                    .addComponent(jLabel109)
                                    .addComponent(jLabel90)
                                    .addComponent(jLabel91)
                                    .addComponent(jLabel92)
                                    .addComponent(jLabel93)
                                    .addComponent(jLabel97)
                                    .addComponent(jLabel98))))
                        .addGap(0, 58, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator6)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel80)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel108)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel81)
                    .addComponent(fig22))
                .addGap(34, 34, 34)
                .addComponent(jLabel109)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel110)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel90)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel91)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel92)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel93)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel97)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel98)
                .addGap(18, 18, 18)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fig22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fig22ActionPerformed
        if (evt.getSource() == fig22) {
            new default_images("FIG 22", "/emct/images/figures/fig22.jpg", point);
        }
    }//GEN-LAST:event_fig22ActionPerformed

    private Point point;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fig22;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JSeparator jSeparator6;
    // End of variables declaration//GEN-END:variables
}
