/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emct.ro.frames.b_fuel_system;

import emct.ro.forms.default_images;
import java.awt.Point;

/**
 *
 * @author Catalin Glavan
 */
public class injectors extends javax.swing.JPanel {

    /**
     * Creates new form injectors
     */
    public injectors(Point setPoint) {
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
        jLabel99 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        fig11_1 = new javax.swing.JButton();
        jLabel91 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jLabel101 = new javax.swing.JLabel();
        fig8_2 = new javax.swing.JButton();
        jLabel89 = new javax.swing.JLabel();
        fig11 = new javax.swing.JButton();
        fig8 = new javax.swing.JButton();
        jLabel86 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel92 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        fig8_4 = new javax.swing.JButton();
        jLabel88 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        fig10 = new javax.swing.JButton();
        fig10_1 = new javax.swing.JButton();
        fig9 = new javax.swing.JButton();
        jLabel95 = new javax.swing.JLabel();
        fig8_5 = new javax.swing.JButton();
        fig8_6 = new javax.swing.JButton();
        jLabel85 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        jLabel80 = new javax.swing.JLabel();
        fig8_7 = new javax.swing.JButton();
        jLabel104 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jLabel97 = new javax.swing.JLabel();
        fig8_1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(226, 224, 211));

        jLabel96.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(15, 89, 193));
        jLabel96.setText("&");

        jLabel99.setText("Verificarea si Curatarea injectoarelor: Mergeti la Proceduri generale de test.");

        jLabel94.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(15, 89, 193));
        jLabel94.setText("Verificarea Rezistentei .individual -");

        fig11_1.setBackground(java.awt.Color.orange);
        fig11_1.setText("FIG 11");
        fig11_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fig11_1.setFocusable(false);
        fig11_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fig11_1ActionPerformed(evt);
            }
        });

        jLabel91.setText("• Deconecteaza cablul cu multi-mufa pentru injector.");

        jLabel90.setText("• Asigura-te ca motorul este oprit.");

        jLabel84.setText("• Verifica rezistenta intre bornele injectoarelor.");

        jLabel100.setText("NOTA: Injectoarele au o multi-mufa comuna. ");

        jScrollPane8.setBorder(null);

        jTable8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Rezistenta", "3.7 - 5 \u2126"}
            },
            new String [] {
                "Date Tehnice", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
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
        jTable8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane8.setViewportView(jTable8);

        jLabel101.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(15, 89, 193));
        jLabel101.setText("&");

        fig8_2.setBackground(java.awt.Color.orange);
        fig8_2.setText("FIG 8");
        fig8_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fig8_2.setFocusable(false);
        fig8_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fig8_2ActionPerformed(evt);
            }
        });

        jLabel89.setText("• Repeta testul pentru fiecare injector in parte.");

        fig11.setBackground(java.awt.Color.orange);
        fig11.setText("FIG 11");
        fig11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fig11.setFocusable(false);
        fig11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fig11ActionPerformed(evt);
            }
        });

        fig8.setBackground(java.awt.Color.orange);
        fig8.setText("FIG 8");
        fig8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fig8.setFocusable(false);
        fig8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fig8ActionPerformed(evt);
            }
        });

        jLabel86.setText("• Deconecteaza sina de alimentare cu injectoare.");

        jLabel98.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(15, 89, 193));
        jLabel98.setText("Verificarea semnalului -");

        jLabel83.setText("• Deconecteaza cablul cu multi-mufa pentru injector.");

        jLabel103.setText("• Deconecteaza cablul cu multi-mufa pentru injector.");

        jLabel102.setText("• Asigura-te ca motorul este oprit.");

        jLabel106.setText("• Verifica daca lampa LEO da flash-uri.");

        jLabel92.setText("• Da cheie motorului de cateva ori.");

        jLabel105.setText("• Da cheie motorului de cateva ori.");

        fig8_4.setBackground(java.awt.Color.orange);
        fig8_4.setText("FIG 8");
        fig8_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fig8_4.setFocusable(false);
        fig8_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fig8_4ActionPerformed(evt);
            }
        });

        jLabel88.setText("• Verifica rezistenta intre bornele injectoarelor. ");

        jLabel81.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(15, 89, 193));
        jLabel81.setText("Verificarea Rezistentei - combinata - ");

        jLabel93.setText("• Verifica tensiunea intre borna multi-fisa si pamant. ");

        fig10.setBackground(java.awt.Color.orange);
        fig10.setText("FIG 10");
        fig10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fig10.setFocusable(false);
        fig10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fig10ActionPerformed(evt);
            }
        });

        fig10_1.setBackground(java.awt.Color.orange);
        fig10_1.setText("FIG 10");
        fig10_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fig10_1.setFocusable(false);
        fig10_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fig10_1ActionPerformed(evt);
            }
        });

        fig9.setBackground(java.awt.Color.orange);
        fig9.setText("FIG 9");
        fig9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fig9.setFocusable(false);
        fig9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fig9ActionPerformed(evt);
            }
        });

        jLabel95.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(15, 89, 193));
        jLabel95.setText("Verificarea voltajului de rezerva -");

        fig8_5.setBackground(java.awt.Color.orange);
        fig8_5.setText("FIG 8");
        fig8_5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fig8_5.setFocusable(false);
        fig8_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fig8_5ActionPerformed(evt);
            }
        });

        fig8_6.setBackground(java.awt.Color.orange);
        fig8_6.setText("FIG 8");
        fig8_6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fig8_6.setFocusable(false);
        fig8_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fig8_6ActionPerformed(evt);
            }
        });

        jLabel85.setText("• Asigura-te ca motorul este oprit.");

        jLabel107.setText("• Daca lampa LEO nu da flash-uri: Verifica, cablurile.");

        jScrollPane9.setBorder(javax.swing.BorderFactory.createTitledBorder("Date Tehnice"));
        jScrollPane9.setToolTipText("");

        jTable9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1 (Fir rosu) & Pamant ", "Voltajul Bateriei"}
            },
            new String [] {
                "Terminale", "Voltaj"
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
        jLabel80.setText("Injectoarele");

        fig8_7.setBackground(java.awt.Color.orange);
        fig8_7.setText("FIG 8");
        fig8_7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fig8_7.setFocusable(false);
        fig8_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fig8_7ActionPerformed(evt);
            }
        });

        jLabel104.setText("• Conecteaza lampa de test LEO intre terminalele multi-mufa.");

        jLabel87.setText("•Acceseaza injectoarele.");

        jLabel82.setText("• Asigura-te ca motorul este oprit.");

        jScrollPane7.setBorder(null);

        jTable7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Rezistenta", "15 - 20 \u2126"}
            },
            new String [] {
                "Date Tehnice", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
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
        jTable7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane7.setViewportView(jTable7);

        jLabel97.setText("• Data tensiunea nu este ca si cea specificata: Verifica, cablurile si releul pompei de carburant.");

        fig8_1.setBackground(java.awt.Color.orange);
        fig8_1.setText("FIG 8");
        fig8_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fig8_1.setFocusable(false);
        fig8_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fig8_1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel89)
                    .addComponent(jLabel83)
                    .addComponent(jLabel88))
                .addContainerGap(505, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel94)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(fig9))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(305, 305, 305)
                                    .addComponent(fig8_1))
                                .addComponent(jLabel82)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel84)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(fig8_2))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel99)
                                .addComponent(jLabel100)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel81)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(fig8))
                                .addComponent(jLabel80)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel95)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(fig8_5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel96)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(fig10))
                                .addComponent(jLabel85)
                                .addComponent(jLabel87)
                                .addComponent(jLabel86)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel90)
                                .addComponent(jLabel92)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel91)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(fig8_4))
                                .addComponent(jLabel97)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel93)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(fig10_1))
                                .addComponent(jLabel102)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel103)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(fig8_7))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel104)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(fig11_1))
                                .addComponent(jLabel106)
                                .addComponent(jLabel107)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel98)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(fig8_6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel101))
                                        .addComponent(jLabel105))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(fig11))))
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 821, Short.MAX_VALUE)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane8))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jLabel83)
                .addGap(273, 273, 273)
                .addComponent(jLabel88)
                .addGap(18, 18, 18)
                .addComponent(jLabel89)
                .addContainerGap(542, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(jLabel80)
                    .addGap(10, 10, 10)
                    .addComponent(jLabel99)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel100)
                    .addGap(3, 3, 3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel81)
                        .addComponent(fig8))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel82)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(fig8_1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel84)
                        .addComponent(fig8_2))
                    .addGap(50, 50, 50)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel94)
                        .addComponent(fig9))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel85)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel86)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel87)
                    .addGap(92, 92, 92)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel95)
                        .addComponent(fig8_5)
                        .addComponent(jLabel96)
                        .addComponent(fig10))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel90)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel91)
                        .addComponent(fig8_4))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel92)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel93)
                        .addComponent(fig10_1))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel97)
                    .addGap(21, 21, 21)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel98)
                        .addComponent(fig8_6)
                        .addComponent(jLabel101)
                        .addComponent(fig11))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel102)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel103)
                        .addComponent(fig8_7))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel104)
                        .addComponent(fig11_1))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel105)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel106)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel107)
                    .addGap(18, 18, 18)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fig8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fig8ActionPerformed
        if (evt.getSource() == fig8) {
            new default_images("FIG 8", "/emct/images/figures/fig8.jpg", point);
        }
    }//GEN-LAST:event_fig8ActionPerformed

    private void fig8_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fig8_1ActionPerformed
        if (evt.getSource() == fig8_1) {
            new default_images("FIG 8", "/emct/images/figures/fig8.jpg", point);
        }
    }//GEN-LAST:event_fig8_1ActionPerformed

    private void fig8_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fig8_2ActionPerformed
        if (evt.getSource() == fig8_2) {
            new default_images("FIG 8", "/emct/images/figures/fig8.jpg", point);
        }
    }//GEN-LAST:event_fig8_2ActionPerformed

    private void fig9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fig9ActionPerformed
        if (evt.getSource() == fig9) {
            new default_images("FIG 9", "/emct/images/figures/fig9.jpg", point);
        }
    }//GEN-LAST:event_fig9ActionPerformed

    private void fig8_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fig8_5ActionPerformed
        if (evt.getSource() == fig8_5) {
            new default_images("FIG 8", "/emct/images/figures/fig8.jpg", point);
        }
    }//GEN-LAST:event_fig8_5ActionPerformed

    private void fig10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fig10ActionPerformed
        if (evt.getSource() == fig10) {
            new default_images("FIG 10", "/emct/images/figures/fig10.jpg", point);
        }
    }//GEN-LAST:event_fig10ActionPerformed

    private void fig8_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fig8_4ActionPerformed
        if (evt.getSource() == fig8_4) {
            new default_images("FIG 8", "/emct/images/figures/fig8.jpg", point);
        }
    }//GEN-LAST:event_fig8_4ActionPerformed

    private void fig10_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fig10_1ActionPerformed
        if (evt.getSource() == fig10_1) {
            new default_images("FIG 10", "/emct/images/figures/fig10.jpg", point);
        }
    }//GEN-LAST:event_fig10_1ActionPerformed

    private void fig8_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fig8_6ActionPerformed
        if (evt.getSource() == fig8_6) {
            new default_images("FIG 8", "/emct/images/figures/fig8.jpg", point);
        }
    }//GEN-LAST:event_fig8_6ActionPerformed

    private void fig11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fig11ActionPerformed
        if (evt.getSource() == fig11) {
            new default_images("FIG 11", "/emct/images/figures/fig11.jpg", point);
        }
    }//GEN-LAST:event_fig11ActionPerformed

    private void fig8_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fig8_7ActionPerformed
        if (evt.getSource() == fig8_7) {
            new default_images("FIG 8", "/emct/images/figures/fig8.jpg", point);
        }
    }//GEN-LAST:event_fig8_7ActionPerformed

    private void fig11_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fig11_1ActionPerformed
        if (evt.getSource() == fig11_1) {
            new default_images("FIG 11", "/emct/images/figures/fig11.jpg", point);
        }
    }//GEN-LAST:event_fig11_1ActionPerformed

    private Point point;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fig10;
    private javax.swing.JButton fig10_1;
    private javax.swing.JButton fig11;
    private javax.swing.JButton fig11_1;
    private javax.swing.JButton fig8;
    private javax.swing.JButton fig8_1;
    private javax.swing.JButton fig8_2;
    private javax.swing.JButton fig8_4;
    private javax.swing.JButton fig8_5;
    private javax.swing.JButton fig8_6;
    private javax.swing.JButton fig8_7;
    private javax.swing.JButton fig9;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
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
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    // End of variables declaration//GEN-END:variables
}
