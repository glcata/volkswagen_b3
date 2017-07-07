/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emct.en.frames.c_intake_system;

import emct.default_images;
import java.awt.Point;

/**
 *
 * @author Catalin Glavan
 */
public class intake_air extends javax.swing.JPanel {

    /**
     * Creates new form injectors
     */
    public intake_air(Point setPoint) {
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

        jLabel96 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        fig18 = new javax.swing.JButton();
        jLabel86 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel92 = new javax.swing.JLabel();
        fig18_3 = new javax.swing.JButton();
        jLabel88 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        fig19_2 = new javax.swing.JButton();
        fig19_3 = new javax.swing.JButton();
        jLabel95 = new javax.swing.JLabel();
        fig18_2 = new javax.swing.JButton();
        jLabel85 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        jLabel80 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        fig19 = new javax.swing.JButton();
        jLabel108 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        fig18_1 = new javax.swing.JButton();
        fig19_1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(226, 224, 211));

        jLabel96.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(15, 89, 193));
        jLabel96.setText("&");

        jLabel91.setText("• Disconnect VAF sensor multi-plug");

        jLabel90.setText("• Ensure ignition switched OFF.");

        jLabel100.setText(" NOTE:Incorporated in volume air flow (VAF) sensor. ");

        fig18.setBackground(java.awt.Color.orange);
        fig18.setText("FIG 18");
        fig18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fig18.setFocusable(false);
        fig18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fig18ActionPerformed(evt);
            }
        });

        jLabel86.setText("• Disconnect VAF sensor multi-plug");

        jLabel92.setText("• Switch ignition ON.");

        fig18_3.setBackground(java.awt.Color.orange);
        fig18_3.setText("FIG 18");
        fig18_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fig18_3.setFocusable(false);
        fig18_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fig18_3ActionPerformed(evt);
            }
        });

        jLabel88.setText("• Check resistance between VAF sensor terminals");

        jLabel81.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(15, 89, 193));
        jLabel81.setText("Checking resistance -");

        jLabel93.setText("• Check voltage between harness multi-plug terminals");

        fig19_2.setBackground(java.awt.Color.orange);
        fig19_2.setText("FIG 19");
        fig19_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fig19_2.setFocusable(false);
        fig19_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fig19_2ActionPerformed(evt);
            }
        });

        fig19_3.setBackground(java.awt.Color.orange);
        fig19_3.setText("FIG 19");
        fig19_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fig19_3.setFocusable(false);
        fig19_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fig19_3ActionPerformed(evt);
            }
        });

        jLabel95.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(15, 89, 193));
        jLabel95.setText("Checking supply voltage - ");

        fig18_2.setBackground(java.awt.Color.orange);
        fig18_2.setText("FIG 18");
        fig18_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fig18_2.setFocusable(false);
        fig18_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fig18_2ActionPerformed(evt);
            }
        });

        jLabel85.setText("• Ensure ignition switched OFF.");

        jScrollPane9.setBorder(javax.swing.BorderFactory.createTitledBorder("Technical Data"));

        jTable9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1 & 4", "5 V approx."}
            },
            new String [] {
                "Terminals", "Voltage"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane9.setViewportView(jTable9);

        jLabel80.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(15, 89, 193));
        jLabel80.setText("Intake air temperature (IAT ) sensor");

        jLabel87.setText("• Check ambient air temperature.");

        fig19.setBackground(java.awt.Color.orange);
        fig19.setText("FIG 19");
        fig19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fig19.setFocusable(false);
        fig19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fig19ActionPerformed(evt);
            }
        });

        jLabel108.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(15, 89, 193));
        jLabel108.setText("&");

        jScrollPane10.setBorder(javax.swing.BorderFactory.createTitledBorder("Technical Data"));

        jTable10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTable10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1 & 4 ", "0\u2103", "5000-6500 \u2126"},
                {"1 & 4", "10\u2103 ", "3250-4500 \u2126 "},
                {"1 & 4", "20\u2103", "2200-3000 \u2126"},
                {"1 & 4", "30\u2103 ", "1500-2000 \u2126"},
                {"1 & 4", "40\u2103 ", "1000-1400 \u2126"},
                {"1 & 4", "50\u2103 ", "725-925 \u2126"},
                {"1 & 4", "60\u2103", "535-675 \u2126"},
                {"1 & 4", "70\u2103", "400-500 \u2126"},
                {"1 & 4", "80\u2103 ", "275-375 \u2126"}
            },
            new String [] {
                "Terminals", "Temperature", "Resistance"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane10.setViewportView(jTable10);

        fig18_1.setBackground(java.awt.Color.orange);
        fig18_1.setText("FIG 18");
        fig18_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fig18_1.setFocusable(false);
        fig18_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fig18_1ActionPerformed(evt);
            }
        });

        fig19_1.setBackground(java.awt.Color.orange);
        fig19_1.setText("FIG 19");
        fig19_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fig19_1.setFocusable(false);
        fig19_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fig19_1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel80)
                    .addComponent(jLabel100)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel81)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fig18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel108)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fig19)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10)
                    .addComponent(jSeparator6)
                    .addComponent(jScrollPane9)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel90)
                                    .addComponent(jLabel92)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel91)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fig18_3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel93)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fig19_3))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel88)
                                            .addComponent(jLabel85, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel87, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel86)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(fig18_1)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fig19_1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel95)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fig18_2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel96)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fig19_2)))))
                        .addGap(460, 460, 460)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel80)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel100)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel81)
                    .addComponent(fig18)
                    .addComponent(jLabel108)
                    .addComponent(fig19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel85)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel86)
                    .addComponent(fig18_1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel87)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel88)
                    .addComponent(fig19_1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel95)
                    .addComponent(fig18_2)
                    .addComponent(jLabel96)
                    .addComponent(fig19_2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel90)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel91)
                    .addComponent(fig18_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel92)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel93)
                    .addComponent(fig19_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fig18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fig18ActionPerformed
        if (evt.getSource() == fig18) {
            new default_images("FIG 18", "/emct/images/figures/fig18.jpg", point);
        }
    }//GEN-LAST:event_fig18ActionPerformed

    private void fig19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fig19ActionPerformed
        if (evt.getSource() == fig19) {
            new default_images("FIG 19", "/emct/images/figures/fig19.jpg", point);
        }
    }//GEN-LAST:event_fig19ActionPerformed

    private void fig18_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fig18_1ActionPerformed
        if (evt.getSource() == fig18_1) {
            new default_images("FIG 18", "/emct/images/figures/fig18.jpg", point);
        }
    }//GEN-LAST:event_fig18_1ActionPerformed

    private void fig19_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fig19_1ActionPerformed
        if (evt.getSource() == fig19_1) {
            new default_images("FIG 19", "/emct/images/figures/fig19.jpg", point);
        }
    }//GEN-LAST:event_fig19_1ActionPerformed

    private void fig18_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fig18_2ActionPerformed
        if (evt.getSource() == fig18_2) {
            new default_images("FIG 18", "/emct/images/figures/fig18.jpg", point);
        }
    }//GEN-LAST:event_fig18_2ActionPerformed

    private void fig19_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fig19_2ActionPerformed
        if (evt.getSource() == fig19_2) {
            new default_images("FIG 19", "/emct/images/figures/fig19.jpg", point);
        }
    }//GEN-LAST:event_fig19_2ActionPerformed

    private void fig19_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fig19_3ActionPerformed
        if (evt.getSource() == fig19_3) {
            new default_images("FIG 19", "/emct/images/figures/fig19.jpg", point);
        }
    }//GEN-LAST:event_fig19_3ActionPerformed

    private void fig18_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fig18_3ActionPerformed
        if (evt.getSource() == fig18_3) {
            new default_images("FIG 18", "/emct/images/figures/fig18.jpg", point);
        }
    }//GEN-LAST:event_fig18_3ActionPerformed

    private Point point;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fig18;
    private javax.swing.JButton fig18_1;
    private javax.swing.JButton fig18_2;
    private javax.swing.JButton fig18_3;
    private javax.swing.JButton fig19;
    private javax.swing.JButton fig19_1;
    private javax.swing.JButton fig19_2;
    private javax.swing.JButton fig19_3;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTable jTable10;
    private javax.swing.JTable jTable9;
    // End of variables declaration//GEN-END:variables
}
