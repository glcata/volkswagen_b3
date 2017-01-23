/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emct.frames.f_emission_control;

import emct.forms.default_images;
import java.awt.Point;

/**
 *
 * @author Catalin Glavan
 */
public class heated_oxygen extends javax.swing.JPanel {

    /**
     * Creates new form injectors
     */
    public heated_oxygen(Point setPoint) {
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
        jLabel86 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel88 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        jLabel89 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        fig34 = new javax.swing.JButton();
        fig33 = new javax.swing.JButton();

        setBackground(new java.awt.Color(226, 224, 211));

        jLabel91.setText("• Check voltage between H02S terminals");

        jLabel90.setText("• Disconnect H02S multi-plug.");

        jLabel86.setText("• Start engine.");

        jLabel88.setText("• Allow to idle.");

        jLabel81.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(15, 89, 193));
        jLabel81.setText("Checking operation");

        jLabel85.setText("• Ensure engine is at normal operating temperature.");

        jLabel80.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(15, 89, 193));
        jLabel80.setText("Heated oxygen sensor (H02S) ");

        jLabel87.setText("• Increase engine speed to over 2500 rpm for 1 minute.");

        jScrollPane10.setBorder(javax.swing.BorderFactory.createTitledBorder("Technical Data"));

        jTable10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTable10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"3 & 4", "0-1 V (fluctuating)"}
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

        jLabel89.setText("• Ensure engine is at normal operating temperature.");

        jLabel92.setText("• Ensure ignition switched OFF.");

        jLabel93.setText("• Connect CO meter to sample pipe.");

        jLabel94.setText("• Disconnect H02S multi-plug.");

        jLabel95.setText("• Clamp fuel pressure regulator vacuum hose.");

        jLabel96.setText("• Start engine.");

        jLabel97.setText("• Allow to idle.");

        jLabel98.setText("• Check that CO level increases.");

        jLabel99.setText("• Reconnect H02S multi-plug.");

        jLabel100.setText("• Check that CO level decreases to specified level.");

        jLabel101.setText("• Remove clamp fromfuel pressure regulator vacuum hose.");

        jLabel102.setText("• Switch ignition OFF.");

        jLabel82.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(15, 89, 193));
        jLabel82.setText("Checking signal -");

        fig34.setBackground(java.awt.Color.orange);
        fig34.setText("FIG 34");
        fig34.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fig34.setFocusable(false);
        fig34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fig34ActionPerformed(evt);
            }
        });

        fig33.setBackground(java.awt.Color.orange);
        fig33.setText("FIG 33");
        fig33.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fig33.setFocusable(false);
        fig33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fig33ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel80)
                                    .addComponent(jLabel81)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel82)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fig34))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel95)
                                    .addComponent(jLabel89)
                                    .addComponent(jLabel93)
                                    .addComponent(jLabel92)
                                    .addComponent(jLabel96)
                                    .addComponent(jLabel101)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel100)
                                        .addComponent(jLabel97, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel99, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel98, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel102)
                                    .addComponent(jLabel94)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel90)
                                    .addComponent(jLabel85)
                                    .addComponent(jLabel87)
                                    .addComponent(jLabel86)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel91)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fig33))
                                    .addComponent(jLabel88))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator6)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 816, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel80)
                .addGap(18, 18, 18)
                .addComponent(jLabel81)
                .addGap(18, 18, 18)
                .addComponent(jLabel89)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel98)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel99)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel100)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel101)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel102)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel82)
                    .addComponent(fig34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel85)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel86)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel87)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel88)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel90)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel91)
                    .addComponent(fig33))
                .addGap(18, 18, 18)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fig34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fig34ActionPerformed
        if (evt.getSource() == fig34) {
            new default_images("FIG 34", "/emct/images/figures/fig34.jpg", point);
        }
    }//GEN-LAST:event_fig34ActionPerformed

    private void fig33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fig33ActionPerformed
        if (evt.getSource() == fig33) {
            new default_images("FIG 33", "/emct/images/figures/fig33.jpg", point);
        }
    }//GEN-LAST:event_fig33ActionPerformed

    private Point point;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fig33;
    private javax.swing.JButton fig34;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
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
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTable jTable10;
    // End of variables declaration//GEN-END:variables
}
