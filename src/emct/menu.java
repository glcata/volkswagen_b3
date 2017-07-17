/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emct;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.UnsupportedLookAndFeelException;
import java.awt.event.ItemEvent;
import java.util.HashMap;
import javax.swing.JComboBox;

/**
 *
 * @author mihai-catalin.glavan
 */
public class menu extends javax.swing.JFrame {

    /**
     * Creates new form menu
     *
     *
     */
    public menu() {

        //this.bundle = langCheck("English");
        this.bundle = lang.getSelectedItem().toString().contains("English") ? langCheck("English") : langCheck("Romania");
        initComponents();
        super.setSize(950, 650);
        super.setResizable(false);
        super.setLocationRelativeTo(null);

        icon = new ImageIcon(getClass().getResource("/emct/images/vw_ico.png")).getImage();
        super.setIconImage(icon);

        try {
            String checkFlag = lang.getSelectedItem().toString().contains("English") ? "en.png" : "ro.png";
            ImageIcon img = new ImageIcon(getClass().getResource("/emct/images/" + checkFlag));
            Image imgSet = img.getImage();
            Image newimg = imgSet.getScaledInstance(40, 20, java.awt.Image.SCALE_SMOOTH);
            img = new ImageIcon(newimg);
            flag.setIcon((Icon) (img));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        north = new javax.swing.JPanel();
        default_panel = new default_panel(false);
        flag = new javax.swing.JLabel();
        south = new javax.swing.JPanel();
        exit = new javax.swing.JButton();
        trB = new javax.swing.JButton();
        emctB = new javax.swing.JButton();
        ecuB = new javax.swing.JButton();
        buttons = new javax.swing.JPanel();
        dim = new java.awt.Dimension(220, 50);
        setFont = new Font("Calibri", Font.BOLD, 15);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VOLKSWAGEN B3");

        north.setLayout(new javax.swing.BoxLayout(north, javax.swing.BoxLayout.LINE_AXIS));
        north.add(flag);

        lang.setFont(setFont);
        lang.addItemListener(this::langItemPerformed);
        north.add(lang);

        getContentPane().add(north, java.awt.BorderLayout.NORTH);

        default_panel.setLayout(new GridBagLayout());
        buttons.setLayout(new GridLayout(0, 1));
        buttons.setOpaque(false);

        trB.setText(bundle.getString("key_m1"));
        trB.setPreferredSize(dim);
        trB.setFont(setFont);
        trB.setBackground(Color.ORANGE);
        trB.addActionListener(this::trActionPerformed);

        emctB.setText(bundle.getString("key_m2"));
        emctB.setPreferredSize(dim);
        emctB.setFont(setFont);
        emctB.setBackground(Color.GRAY);
        emctB.addActionListener(this::emctActionPerformed);

        ecuB.setText(bundle.getString("key_m3"));
        ecuB.setPreferredSize(dim);
        ecuB.setFont(setFont);
        ecuB.setBackground(Color.ORANGE);
        ecuB.addActionListener(this::ecuActionPerformed);

        buttons.add(trB);
        buttons.add(emctB);
        buttons.add(ecuB);

        default_panel.add(buttons);
        getContentPane().add(default_panel, java.awt.BorderLayout.CENTER);

        south.setLayout(new java.awt.GridLayout(1, 0));

        exit.setText("EXIT");
        exit.addActionListener(this::exitActionPerformed);
        exit.setFont(setFont);
        exit.setBackground(Color.GRAY);

        south.add(exit);

        getContentPane().add(south, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>

    private void trActionPerformed(java.awt.event.ActionEvent evt) {
        new trouble_shooter(bundle).setVisible(true);
    }

    private void emctActionPerformed(java.awt.event.ActionEvent evt) {
        String setString = lang.getSelectedItem().toString();
        if (setString.equals("English")) {
            new emct.en.forms.emct(null).setVisible(true);
        } else {
            new emct.ro.forms.emct(null).setVisible(true);
        }
    }

    private void ecuActionPerformed(java.awt.event.ActionEvent evt) {
        new ecu(bundle).setVisible(true);
    }

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void langItemPerformed(java.awt.event.ItemEvent evt) {
        if (evt.getStateChange() == ItemEvent.SELECTED && count != 2) {
            count++;
            super.dispose();
            Runnable object = count != 2 ? () -> {
                new menu().setVisible(true);
            } : () -> {
                count = 0;
            };
            object.run();
            System.out.println(count);
        }
    }

    private ResourceBundle langCheck(String lang) {

        ResourceBundle result;

        final Locale RO = new Locale("ro", "Romania");
        final Locale EN = new Locale("en", "English");
        final HashMap<String, ResourceBundle> langHash = new HashMap<>();

        langHash.put("English", ResourceBundle.getBundle("emct/language_en", EN));
        langHash.put("Romania", ResourceBundle.getBundle("emct/language_ro", RO));
        langHash.put("default", ResourceBundle.getBundle("emct/language_en", EN));

        result = langHash.get(lang);

        return result;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
            java.awt.EventQueue.invokeLater(() -> {
                final Locale EN = new Locale("en", "English");
                final Locale RO = new Locale("ro", "Romania");
                ResourceBundle bundle1 = ResourceBundle.getBundle("emct/language_en", EN);
                lang = new JComboBox<>();
                lang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"English", "Romania"}));
                new menu().setVisible(true);
            });
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify
    private int count = 0;
    private javax.swing.JButton exit;
    private javax.swing.JButton trB;
    private javax.swing.JButton emctB;
    private javax.swing.JButton ecuB;
    private javax.swing.JLabel flag;
    private static javax.swing.JComboBox<String> lang;
    private javax.swing.JPanel north;
    private javax.swing.JPanel south;
    private javax.swing.JPanel buttons;
    private default_panel default_panel;
    private Dimension dim;
    private Font setFont;
    private ResourceBundle bundle;
    private Image icon;

    // End of variables declaration
}
