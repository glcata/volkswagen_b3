/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emct.ro.frames.d_ignition_system;

import emct.default_images;
import java.awt.Point;

/**
 *
 * @author Catalin Glavan
 */
public class ignition_timing extends javax.swing.JPanel {

    /**
     * Creates new form injectors
     */
    public ignition_timing(Point setPoint) {
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
        fig23 = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel92 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        fig23_1 = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        jLabel80 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        fig24 = new javax.swing.JButton();
        fig24_1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(226, 224, 211));

        jLabel91.setText("• Exceptand Passat 90-93 : Initiaza setarile de baza folosind echipamentul specific. ");

        jLabel90.setText("• Porneste motorul. permite-i cateva momente sa ruleze la relanti.");

        fig23.setBackground(java.awt.Color.orange);
        fig23.setText("FIG 23");
        fig23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fig23.setFocusable(false);
        fig23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fig23ActionPerformed(evt);
            }
        });

        jLabel92.setText("• Creste rotatiile pe minut la valoarea specificata.");

        jLabel81.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(15, 89, 193));
        jLabel81.setText("Verificari si ajustari - ");

        jLabel93.setText("• Verifica timpul de aprindere de baza.");

        fig23_1.setBackground(java.awt.Color.orange);
        fig23_1.setText("FIG 23");
        fig23_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fig23_1.setFocusable(false);
        fig23_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fig23_1ActionPerformed(evt);
            }
        });

        jScrollPane9.setBorder(null);

        jTable9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Timpii aprinderii de baza - BTDC ", "6±1' / 2250 rpm "},
                {"Ordinea arderii", "1-3-4-2"}
            },
            new String [] {
                "Date Tehnice", ""
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

        jLabel80.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(15, 89, 193));
        jLabel80.setText("Timpii de aprindere si ordinea de ardere");

        jLabel97.setText("• Ajusteaza rotind de distribuitor.");

        jLabel108.setText("• Asigura-te ca, cablurile de inalta tensiune sunt conectate corect.");

        jLabel109.setText("• Asigura-te ca motorul este la temperatura normala de functionare. ");

        jLabel110.setText("• Passat 90-93 : Deconecteaza multi-mufa senzorului pentru temperatura lichidului de racire a motorului ( ECT ). ");

        jLabel82.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(15, 89, 193));
        jLabel82.setText("&");

        fig24.setBackground(java.awt.Color.orange);
        fig24.setText("FIG 24");
        fig24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fig24.setFocusable(false);
        fig24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fig24ActionPerformed(evt);
            }
        });

        fig24_1.setBackground(java.awt.Color.orange);
        fig24_1.setText("FIG 24");
        fig24_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fig24_1.setFocusable(false);
        fig24_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fig24_1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel80)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel81)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fig23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel82)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fig24)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane9)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel97)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel93)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fig24_1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel92)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel108)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fig23_1))
                            .addComponent(jLabel110)
                            .addComponent(jLabel109)
                            .addComponent(jLabel90)
                            .addComponent(jLabel91))
                        .addContainerGap(92, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel80)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel81)
                    .addComponent(fig23)
                    .addComponent(jLabel82)
                    .addComponent(fig24))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel108)
                    .addComponent(fig23_1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel93)
                    .addComponent(fig24_1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel97)
                .addGap(18, 18, 18)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fig23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fig23ActionPerformed
        if (evt.getSource() == fig23) {
            new default_images("FIG 23", "/emct/images/figures/fig23.jpg", point);
        }
    }//GEN-LAST:event_fig23ActionPerformed

    private void fig24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fig24ActionPerformed
        if (evt.getSource() == fig24) {
            new default_images("FIG 24", "/emct/images/figures/fig24.jpg", point);
        }
    }//GEN-LAST:event_fig24ActionPerformed

    private void fig23_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fig23_1ActionPerformed
        if (evt.getSource() == fig23_1) {
            new default_images("FIG 23", "/emct/images/figures/fig23.jpg", point);
        }
    }//GEN-LAST:event_fig23_1ActionPerformed

    private void fig24_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fig24_1ActionPerformed
        if (evt.getSource() == fig24_1) {
            new default_images("FIG 24", "/emct/images/figures/fig24.jpg", point);
        }
    }//GEN-LAST:event_fig24_1ActionPerformed

    private Point point;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fig23;
    private javax.swing.JButton fig23_1;
    private javax.swing.JButton fig24;
    private javax.swing.JButton fig24_1;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTable jTable9;
    // End of variables declaration//GEN-END:variables
}
