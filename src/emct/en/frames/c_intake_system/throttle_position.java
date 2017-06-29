/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emct.en.frames.c_intake_system;

import emct.en.forms.default_images;
import java.awt.Point;

/**
 *
 * @author Catalin Glavan
 */
public class throttle_position extends javax.swing.JPanel {

    /**
     * Creates new form injectors
     */
    public throttle_position(Point setPoint) {
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

        jLabel84 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        fig17 = new javax.swing.JButton();
        fig16 = new javax.swing.JButton();
        jLabel83 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel81 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        fig16_1 = new javax.swing.JButton();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(226, 224, 211));

        jLabel84.setText("• Check resistance between harness multi-plug terminal and earth. ");

        jScrollPane8.setBorder(javax.swing.BorderFactory.createTitledBorder("Technical Data"));

        jTable8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"2 & 3", "Throttle closed ", "0.3-1,7 V approx. "},
                {"2 & 3", "Throttle fully open", "3-5 V approx. "}
            },
            new String [] {
                "Terminals", "Condition", "Voltage"
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
        jTable8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane8.setViewportView(jTable8);

        fig17.setBackground(java.awt.Color.orange);
        fig17.setText("FIG 17");
        fig17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fig17.setFocusable(false);
        fig17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fig17ActionPerformed(evt);
            }
        });

        fig16.setBackground(java.awt.Color.orange);
        fig16.setText("FIG 16");
        fig16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fig16.setFocusable(false);
        fig16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fig16ActionPerformed(evt);
            }
        });

        jLabel83.setText("• Disconnect TP sensor multi-plug. ");

        jLabel81.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(15, 89, 193));
        jLabel81.setText("Checking earth connection -");

        jLabel80.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(15, 89, 193));
        jLabel80.setText("Throttle position (TP) sensor");

        jLabel82.setText("• Ensure ignition switched OFF. ");

        fig16_1.setBackground(java.awt.Color.orange);
        fig16_1.setText("FIG 16");
        fig16_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fig16_1.setFocusable(false);
        fig16_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fig16_1ActionPerformed(evt);
            }
        });

        jLabel85.setText("• If resistance not as specified:Check wiring. ");

        jLabel86.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(15, 89, 193));
        jLabel86.setText("Checking -");

        jScrollPane9.setBorder(javax.swing.BorderFactory.createTitledBorder("Technical Data"));

        jTable9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"3 & earth", "Zero"}
            },
            new String [] {
                "Terminals", "Resistance"
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
        jTable9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane9.setViewportView(jTable9);

        jLabel87.setText(" • Ensure ignition switched OFF. ");

        jLabel88.setText("• Disconnect TP sensor multi-plug. ");

        jLabel89.setText("• Switch ignition ON. ");

        jLabel90.setText("• Check voltage between harness multi-plug terminals. ");

        jLabel91.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(15, 89, 193));
        jLabel91.setText("Checking earth connection -");

        jScrollPane10.setBorder(javax.swing.BorderFactory.createTitledBorder("Technical Data"));

        jTable10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTable10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1 & 3", "5 V approx. "}
            },
            new String [] {
                "Terminals", "Voltage"
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
        jTable10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane10.setViewportView(jTable10);

        jLabel92.setText("• Ensure ignition switched OFF.");

        jLabel93.setText("• Do not disconnect multi-plug.Access TP sensor multi-plug terminals.");

        jLabel94.setText("• Switch ignition ON.");

        jLabel95.setText("• Check voltage between multi-plug terminals.");

        jLabel96.setText("• Operate throttle valve while checking voltage between terminals 2 and 3.");

        jLabel97.setText("• Voltage change should be smooth.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 907, Short.MAX_VALUE)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator6)
                            .addComponent(jScrollPane9)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(jLabel91)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fig16_1))
                                    .addComponent(jLabel80)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel81)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fig16))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel89)
                                    .addComponent(jLabel87)
                                    .addComponent(jLabel88)
                                    .addComponent(jLabel90)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel86)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fig17))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel97)
                                    .addComponent(jLabel96)
                                    .addComponent(jLabel94)
                                    .addComponent(jLabel95)
                                    .addComponent(jLabel93)
                                    .addComponent(jLabel92))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel85)
                    .addComponent(jLabel84)
                    .addComponent(jLabel83)
                    .addComponent(jLabel82))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel80)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel81)
                    .addComponent(fig16))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel82)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel83)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel84)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel85)
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel91)
                    .addComponent(fig16_1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel87)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel88)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel89)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel90)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel86)
                    .addComponent(fig17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel92)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel93)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel94)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel95)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel96)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel97)
                .addGap(18, 18, 18)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fig16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fig16ActionPerformed
        if (evt.getSource() == fig16) {
            new default_images("FIG 16", "/emct/images/figures/fig16.jpg", point);
        }
    }//GEN-LAST:event_fig16ActionPerformed

    private void fig16_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fig16_1ActionPerformed
        if (evt.getSource() == fig16_1) {
            new default_images("FIG 16", "/emct/images/figures/fig16.jpg", point);
        }
    }//GEN-LAST:event_fig16_1ActionPerformed

    private void fig17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fig17ActionPerformed
        if (evt.getSource() == fig17) {
            new default_images("FIG 17", "/emct/images/figures/fig17.jpg", point);
        }
    }//GEN-LAST:event_fig17ActionPerformed

    private Point point;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fig16;
    private javax.swing.JButton fig16_1;
    private javax.swing.JButton fig17;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTable jTable10;
    private javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    // End of variables declaration//GEN-END:variables
}
