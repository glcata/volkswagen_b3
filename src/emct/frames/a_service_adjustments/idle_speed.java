/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emct.frames.a_service_adjustments;

import emct.forms.default_images;
import java.awt.Point;

/**
 *
 * @author Catalin Glavan
 */
public class idle_speed extends javax.swing.JPanel {

    /**
     * Creates new form idle_speed
     * @param setPoint
     */
    public idle_speed(Point setPoint) {
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

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        fig1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fig2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fig2_2 = new javax.swing.JButton();
        fig1_1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(226, 224, 211));

        jScrollPane3.setWheelScrollingEnabled(false);

        jTable3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"All models", "770-870 rpm"}
            },
            new String [] {
                "Technical Data", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        fig1.setBackground(java.awt.Color.orange);
        fig1.setText("FIG 1");
        fig1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fig1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fig1ActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(15, 89, 193));
        jLabel7.setText("&");

        jLabel14.setText("• Allow to idle for 2 minutes.");

        jLabel12.setText("• Start engine.");

        jLabel1.setText("• Idle speed electronically controlled.");

        fig2.setBackground(java.awt.Color.orange);
        fig2.setText("FIG 2");
        fig2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fig2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fig2ActionPerformed(evt);
            }
        });

        jLabel2.setText("• No adjustment possible.");

        jLabel5.setText("• If idle speed not as specified: Check for air leaks in intake system. Carry out component and electrical tests.");

        jLabel9.setText("• Ensure ignition switched OFF.");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(15, 89, 193));
        jLabel4.setText("Adjustment - except Passat");

        jLabel8.setText("• Can only be adjusted using suitable diagnostic equipment.");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(15, 89, 193));
        jLabel3.setText("Idle speed");

        fig2_2.setBackground(java.awt.Color.orange);
        fig2_2.setText("FIG 2");
        fig2_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fig2_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fig2_2ActionPerformed(evt);
            }
        });

        fig1_1.setBackground(java.awt.Color.orange);
        fig1_1.setText("FIG 1");
        fig1_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fig1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fig1_1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(15, 89, 193));
        jLabel6.setText("Adjustment  -  Passat  -");

        jLabel11.setText("• Plug crankcase breather hose.");

        jLabel10.setText("• Disconnect crankcase breather hose from pressure regulating valve.");

        jScrollPane1.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setWheelScrollingEnabled(false);

        jTable1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"All models", "770-870 rpm"}
            },
            new String [] {
                "Technical Data", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoscrolls(false);
        jScrollPane1.setViewportView(jTable1);

        jLabel15.setText("• Adjust idle speed with idle speed screw.");

        jLabel13.setText("• Initiate basic setting using suitable diagnostic equipment.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 664, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1)
                    .addContainerGap())
                .addGroup(layout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel5)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(fig1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(fig2))
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fig2_2))
                                    .addComponent(jLabel10)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fig1_1))
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel9))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jSeparator1)))
                    .addGap(3, 3, 3))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(jLabel3)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel4)
                    .addGap(72, 72, 72)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(46, 46, 46)
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel5)
                    .addGap(60, 60, 60)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(fig1)
                        .addComponent(fig2))
                    .addGap(43, 43, 43)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel8)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel9)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel10)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(fig1_1))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel12)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel13)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel14)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(fig2_2))
                    .addGap(18, 18, 18)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fig1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fig1ActionPerformed
        if (evt.getSource() == fig1) {
            new default_images("FIG 1", "/emct/images/figures/fig1.jpg", point);
        }
    }//GEN-LAST:event_fig1ActionPerformed

    private void fig2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fig2ActionPerformed
        if (evt.getSource() == fig2) {
            new default_images("FIG 2", "/emct/images/figures/fig2.jpg", point);
        }
    }//GEN-LAST:event_fig2ActionPerformed

    private void fig1_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fig1_1ActionPerformed
        if (evt.getSource() == fig1_1) {
            new default_images("FIG 1", "/emct/images/figures/fig1.jpg", point);
        }
    }//GEN-LAST:event_fig1_1ActionPerformed

    private void fig2_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fig2_2ActionPerformed
        if (evt.getSource() == fig2_2) {
            new default_images("FIG 2", "/emct/images/figures/fig2.jpg", point);
        }
    }//GEN-LAST:event_fig2_2ActionPerformed

    private Point point;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fig1;
    private javax.swing.JButton fig1_1;
    private javax.swing.JButton fig2;
    private javax.swing.JButton fig2_2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}
