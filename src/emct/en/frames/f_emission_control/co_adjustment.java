/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emct.en.frames.f_emission_control;

import emct.en.forms.default_images;
import java.awt.Point;

/**
 *
 * @author Catalin Glavan
 */
public class co_adjustment extends javax.swing.JPanel {

    /**
     * Creates new form injectors
     */
    public co_adjustment(Point setPoint) {
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
        fig33 = new javax.swing.JButton();

        setBackground(new java.awt.Color(226, 224, 211));

        jLabel90.setText("• Resistance change should be smooth.");

        jLabel86.setText("• Disconnect CO adjustment resistor multi-plug .");

        jLabel88.setText("• Check resistance between CO adjustment resistor terminals.");

        jLabel81.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(15, 89, 193));
        jLabel81.setText("Checking resistance - ");

        jLabel85.setText("• Ensure ignition switched OFF.");

        jLabel80.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(15, 89, 193));
        jLabel80.setText("CO adjustment  resistor - Passat ");

        jLabel87.setText("• Turn CO adjustment resistor from stop to stop.");

        jScrollPane10.setBorder(null);

        jTable10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTable10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Resistance", "0-2000 \u2126"}
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
        jTable10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane10.setViewportView(jTable10);

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
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel90)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel88)
                        .addComponent(jLabel85, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel87, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel86, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel80)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel81)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fig33)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator6)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel80)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel81)
                    .addComponent(fig33))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel85)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel86)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel87)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel88)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel90)
                .addGap(18, 18, 18)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(229, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fig33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fig33ActionPerformed
        if (evt.getSource() == fig33) {
            new default_images("FIG 33", "/emct/images/figures/fig33.jpg", point);
        }
    }//GEN-LAST:event_fig33ActionPerformed

    private Point point;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fig33;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTable jTable10;
    // End of variables declaration//GEN-END:variables
}
