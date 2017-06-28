/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emct.ro.frames.g_control_system;

import emct.forms.default_images;
import java.awt.Point;

/**
 *
 * @author Catalin Glavan
 */
public class fuel_pump_relay extends javax.swing.JPanel {

    /**
     * Creates new form idle_speed
     */
    public fuel_pump_relay(Point setPoint) {
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

        fig38 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        fig37 = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable11 = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(226, 224, 211));

        fig38.setBackground(java.awt.Color.orange);
        fig38.setText("FIG 38");
        fig38.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fig38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fig38ActionPerformed(evt);
            }
        });

        jLabel14.setText("• Verifica tensiunea intre borna de baza a releului si pamant. ");

        jLabel12.setText("• Asigura-te ca motorul este oprit.");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel1.setText("NOTA: Asigura-te ca alimentarea cu tensiune a bateriei este corect conectata. In caz contrar, releul ar putea fi deteriorat. ");

        jLabel2.setText("• Asigura-te ca motorul este oprit.");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(15, 89, 193));
        jLabel4.setText("Operatia de verificare - ");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(15, 89, 193));
        jLabel3.setText("Releul pompei de combustibil");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(15, 89, 193));
        jLabel6.setText("Verificarea tensiunii de alimentare - ");

        jLabel13.setText("• Deconecteaza releul.");

        fig37.setBackground(java.awt.Color.orange);
        fig37.setText("FIG 37");
        fig37.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fig37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fig37ActionPerformed(evt);
            }
        });

        jScrollPane10.setBorder(javax.swing.BorderFactory.createTitledBorder("Date Tehnice"));

        jTable10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTable10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"6 si pamant", "Motor Oprit", "Voltajul Bateriei"},
                {"2 si pamant", "Motor Pornit", "Voltajul Bateriei"}
            },
            new String [] {
                "Terminale", "Conditie", "Voltaj"
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

        jLabel5.setText("• Deconecteaza releul.");

        jLabel16.setText("• Verifica tensiunea intre bornele releului. ");

        jLabel17.setText("• Conecteaza alimentarea cu tensiune a bateriei la terminalele specificate ale releului.");

        jLabel18.setText("• Verifica tensiunea intre bornele releului. ");

        jScrollPane11.setBorder(javax.swing.BorderFactory.createTitledBorder("Date Tehnice"));

        jTable11.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTable11.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"30 si 87", "Voltajul Bateriei deconectat", "\u221E"},
                {"30 si 87", "Voltajul Bateriei conectat", "Zero"},
                {"Battery + la terminalul 86", "", ""},
                {"Battery - la terminalul 85", "", ""}
            },
            new String [] {
                "Terminale", "Conditie", "Rezistenta"
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
        jTable11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane11.setViewportView(jTable11);

        jLabel19.setText("• Porneste Motorul.");

        jLabel20.setText("• Verifica tensiunea intre borna de baza a releului si pamant. ");

        jLabel21.setText("• Daca voltajul nu este cel specificat: Verifica, cablurile.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jSeparator1)
                .addGap(3, 3, 3))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fig37))
                                    .addComponent(jLabel3)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel18)))
                                    .addComponent(jLabel1))))
                        .addGap(194, 194, 194))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane11)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fig38))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fig37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(fig38))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fig37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fig37ActionPerformed
        if (evt.getSource() == fig37) {
            new default_images("FIG 37", "/emct/images/figures/fig37.jpg", point);
        }
    }//GEN-LAST:event_fig37ActionPerformed

    private void fig38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fig38ActionPerformed
        if (evt.getSource() == fig38) {
            new default_images("FIG 38", "/emct/images/figures/fig38.jpg", point);
        }
    }//GEN-LAST:event_fig38ActionPerformed

    private Point point;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fig37;
    private javax.swing.JButton fig38;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable10;
    private javax.swing.JTable jTable11;
    // End of variables declaration//GEN-END:variables
}
