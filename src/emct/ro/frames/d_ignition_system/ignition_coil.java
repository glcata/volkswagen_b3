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
public class ignition_coil extends javax.swing.JPanel {

    /**
     * Creates new form injectors
     */
    public ignition_coil(Point setPoint) {
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
        fig25 = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel92 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        fig26 = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        jLabel80 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable11 = new javax.swing.JTable();

        setBackground(new java.awt.Color(226, 224, 211));

        jLabel91.setText("• Deschide capacul terminalelor de joasa tensiune. ");

        jLabel90.setText("• Deconecteaza cablul de inalta tensiune al bobinei de aprindere.");

        fig25.setBackground(java.awt.Color.orange);
        fig25.setText("FIG 25");
        fig25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fig25.setFocusable(false);
        fig25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fig25ActionPerformed(evt);
            }
        });

        jLabel92.setText("• Verifica rezistenta intre bornele de joasa tensiune ale bobinei de aprindere.");

        jLabel81.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(15, 89, 193));
        jLabel81.setText("Verificarea rezistentei primare - ");

        jLabel95.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(15, 89, 193));
        jLabel95.setText("Verificarea rezistentei secundare - ");

        fig26.setBackground(java.awt.Color.orange);
        fig26.setText("FIG 26");
        fig26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fig26.setFocusable(false);
        fig26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fig26ActionPerformed(evt);
            }
        });

        jScrollPane9.setBorder(javax.swing.BorderFactory.createTitledBorder("Date Tehnice"));

        jTable9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"15 si HT", "3000-4000 \u2126"}
            },
            new String [] {
                "Terminale", "Rezistenta"
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
        jLabel80.setText("Bobina de aprindere");

        jLabel108.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel108.setText("NOTA: Incorporeaza amplificatorul de aprindere.");

        jLabel109.setText("• Asigura-te ca motorul este oprit.");

        jLabel110.setText("• Deconecteaza bobina de aprindere cu multi-fisa. ");

        jLabel94.setText("• Asigura-te ca motorul este oprit.");

        jLabel96.setText("• Deconecteaza bobina de aprindere cu multi-fisa. ");

        jLabel98.setText("• Deconecteaza cablul de inalta tensiune al bobinei de aprindere.");

        jLabel99.setText("• Deschide capacul terminalelor de joasa tensiune. ");

        jLabel100.setText("• verifica rezistenta intre o borna de joasa tensiune a bobinei de aprindere si conexiunea de inalta tensiune.");

        jScrollPane11.setBorder(javax.swing.BorderFactory.createTitledBorder("Date Tehnice"));

        jTable11.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTable11.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {" 1 si 15", "0,5-0,7 \u2126"}
            },
            new String [] {
                "Terminale", "Rezistenta"
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
        jTable11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane11.setViewportView(jTable11);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane9)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel80)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel81)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fig25))
                                    .addComponent(jLabel108)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel100)
                                    .addComponent(jLabel99)
                                    .addComponent(jLabel98)
                                    .addComponent(jLabel96)
                                    .addComponent(jLabel94)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel91)
                                    .addComponent(jLabel110)
                                    .addComponent(jLabel109)
                                    .addComponent(jLabel90)
                                    .addComponent(jLabel92)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel95)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fig26)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel80)
                .addGap(18, 18, 18)
                .addComponent(jLabel108)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel81)
                    .addComponent(fig25))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel109)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel110)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel90)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel91)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel92)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel95)
                    .addComponent(fig26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel94)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel96)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel98)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel99)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel100)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fig25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fig25ActionPerformed
        if (evt.getSource() == fig25) {
            new default_images("FIG 25", "/emct/images/figures/fig25.jpg", point);
        } 
    }//GEN-LAST:event_fig25ActionPerformed

    private void fig26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fig26ActionPerformed
        if (evt.getSource() == fig26) {
            new default_images("FIG 26", "/emct/images/figures/fig26.jpg", point);
        } 
    }//GEN-LAST:event_fig26ActionPerformed


    private Point point;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fig25;
    private javax.swing.JButton fig26;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTable jTable11;
    private javax.swing.JTable jTable9;
    // End of variables declaration//GEN-END:variables
}
