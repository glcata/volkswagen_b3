/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emct.en.frames.a_service_adjustments;

import emct.default_images;
import java.awt.Point;

/**
 *
 * @author Catalin Glavan
 */
public class throttle extends javax.swing.JPanel {

    /**
     * Creates new form throttle_position
     */
    public throttle(Point setPoint) {
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

        jLabel52 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        fig4_2 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel60 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        fig4 = new javax.swing.JButton();
        fig4_1 = new javax.swing.JButton();
        jLabel56 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(226, 224, 211));

        jLabel52.setText("• Thro ttle initial position set by manufacturer.");

        jLabel36.setText("anti-clockwise until clearance exists between stop screw and throttle lever. ");

        jLabel35.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(15, 89, 193));
        jLabel35.setText("Adjustment -");

        fig4_2.setBackground(java.awt.Color.orange);
        fig4_2.setText("FIG 4");
        fig4_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fig4_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fig4_2ActionPerformed(evt);
            }
        });

        jLabel60.setText(" • Check idle speed and throttle position (TP) sensor adjustment. ");

        jLabel58.setText("• Turn stop screw clockwise further 180°. ");

        jLabel55.setText("• Turn throttle lever stop screw");

        fig4.setBackground(java.awt.Color.orange);
        fig4.setText("FIG 4");
        fig4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fig4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fig4ActionPerformed(evt);
            }
        });

        fig4_1.setBackground(java.awt.Color.orange);
        fig4_1.setText("FIG 4");
        fig4_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fig4_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fig4_1ActionPerformed(evt);
            }
        });

        jLabel56.setText("• Ensure throttle valve is closed.");

        jLabel34.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(15, 89, 193));
        jLabel34.setText("Throttle initial position");

        jLabel53.setText("• If adjustment is inadvertently altered, adjust as follows:");

        jLabel54.setText("• Ensure accelerator cable has adequate free play.");

        jLabel61.setText(" • Check that throttle valve opens fully when accelerator pedal is fully depressed. ");

        jLabel57.setText("• Turn stop screw clockwise until it just contacts throttle lever. ");

        jLabel59.setText("• Adjust accelerator cable,if necessary. ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel61)
                    .addComponent(jLabel60)
                    .addComponent(jLabel59)
                    .addComponent(jLabel58)
                    .addComponent(jLabel57)
                    .addComponent(jLabel56)
                    .addComponent(jLabel53)
                    .addComponent(jLabel52)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fig4))
                    .addComponent(jLabel34)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel55)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fig4_1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fig4_2))
                    .addComponent(jLabel54))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator3)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel34)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(fig4))
                .addGap(26, 26, 26)
                .addComponent(jLabel52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel54)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(fig4_1)
                    .addComponent(jLabel36)
                    .addComponent(fig4_2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel56)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel57)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel58)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel59)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel60)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel61)
                .addGap(20, 20, 20)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fig4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fig4ActionPerformed
        if (evt.getSource() == fig4) {
            new default_images("FIG 4", "/emct/images/figures/fig4.jpg", point);
        }
    }//GEN-LAST:event_fig4ActionPerformed

    private void fig4_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fig4_1ActionPerformed
        if (evt.getSource() == fig4_1) {
            new default_images("FIG 4", "/emct/images/figures/fig4.jpg", point);
        } 
    }//GEN-LAST:event_fig4_1ActionPerformed

    private void fig4_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fig4_2ActionPerformed
        if (evt.getSource() == fig4_2) {
            new default_images("FIG 4", "/emct/images/figures/fig4.jpg", point);
        } 
    }//GEN-LAST:event_fig4_2ActionPerformed

    private Point point;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fig4;
    private javax.swing.JButton fig4_1;
    private javax.swing.JButton fig4_2;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
