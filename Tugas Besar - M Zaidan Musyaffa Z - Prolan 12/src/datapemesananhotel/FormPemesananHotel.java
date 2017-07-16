/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datapemesananhotel;

import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author ZAIDAN
 */
public class FormPemesananHotel extends javax.swing.JFrame {
    public DefaultTableModel dtm = new DefaultTableModel();
    private JLabel jLabel66;
    private JTextField tfKodeBarang_;
    private JTextField tfNamaBarang_;
    private JTextField tfMerekk;
    private JTextField tfTypee;
    private JLabel jLabel77;
    private JLabel jLabel88;
    private JLabel jLabel99;
    private JLabel jLabel100;
    private JButton jbSimpann;
    private JButton jbResett;
    private JButton jbBatall;
    private JComboBox<Object> jCariMenu_;
    private JTextField tfCarii;
    private JButton jbCarii;
    private JButton jbTambahh;
    private JButton jbHapuss;
    private JButton jbUbahh;
    private JScrollPane jScrollPane22;
    private JTable jTable22;
    private JTextField umur_;
    private JComboBox Metode;
    
     public FormPemesananHotel () {
        initComponents();
        tampilTabel();
        disabled();

        //menghilangkan fungsi edit doubleclick pada tabel
        jTable1.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getClickCount() > 1) {
                    jTable2.getCellEditor().stopCellEditing();
                }
            }
        });

     }

public void tampilTabel() {
        String columns[] = {"NAMA", "UMUR", "NO.TELPON", "CHECK IN", "CHECK OUT", "MET. PEMBAYARAN"};
        dtm.setColumnIdentifiers(columns);

        String line;
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("pemesananhotel.txt"));
            while ((line = reader.readLine()) != null) {
                dtm.addRow(line.split("\t"));
            }
            jTable2.setModel(dtm);
            reader.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR");
            e.printStackTrace();
        }
}

    public static void cetakKeFile(String pNamaFile, StringBuffer pDataTabel) throws IOException {
        BufferedWriter output = new BufferedWriter(new FileWriter(pNamaFile));
        output.write(pDataTabel.toString());
        output.flush();
        output.close();
    }

    private void saveTable() throws IOException {
        StringBuffer sbTableData = new StringBuffer();

        for (int row = 0; row < jTable2.getRowCount(); row++) {
            for (int column = 0; column < jTable2.getColumnCount(); column++) {
                sbTableData.append(jTable2.getValueAt(row, column)).append("\t");
            }

            sbTableData.append(System.getProperty("line.separator"));

        }
        cetakKeFile("pemesananhotel.txt", sbTableData);
        ClearTextField();
    }
    
    public void ClearTextField() { //method ini digunakan untuk membersihkan jTextField
        nama.setText(null);
        umur.setText(null);
        notelp.setText(null);
        checkin.setText(null);
        checkout.setText(null);
        metpem.setSelectedIndex(0);
        
    }

    public void disabled() {
        nama.setEnabled(false);
        umur.setEnabled(false);
        notelp.setEnabled(false);
        checkin.setEnabled(false);
        checkout.setEnabled(false);
        metpem.setEnabled(false);
        jbSimpan_.setEnabled(false);
        jbReset_.setEnabled(false);
        jbBatal.setEnabled(false);
    }

    public void enabled() {
        nama.setEnabled(true);
        umur.setEnabled(true);
        notelp.setEnabled(true);
        checkin.setEnabled(true);
        checkout.setEnabled(true);
        metpem.setEnabled(true);
        jbSimpan_.setEnabled(true);
        jbReset_.setEnabled(true);
        jbBatal.setEnabled(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbBatal = new javax.swing.JButton();
        umur = new javax.swing.JTextField();
        jCari_Menu = new javax.swing.JComboBox<>();
        nama = new javax.swing.JTextField();
        notelp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        checkin = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jbCari_ = new javax.swing.JButton();
        jbHapus_ = new javax.swing.JButton();
        jbTambah = new javax.swing.JButton();
        jbReset_ = new javax.swing.JButton();
        jbSimpan_ = new javax.swing.JButton();
        jbUbah = new javax.swing.JButton();
        tfCari_ = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        checkout = new javax.swing.JTextField();
        metpem = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbBatal.setBackground(new java.awt.Color(255, 0, 0));
        jbBatal.setFont(new java.awt.Font("DokChampa", 1, 10)); // NOI18N
        jbBatal.setText("BATAL");
        jbBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBatalActionPerformed(evt);
            }
        });
        getContentPane().add(jbBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 80, -1));
        getContentPane().add(umur, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 200, -1));

        jCari_Menu.setFont(new java.awt.Font("DokChampa", 1, 10)); // NOI18N
        jCari_Menu.setForeground(new java.awt.Color(0, 0, 255));
        jCari_Menu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NAMA", "UMUR" }));
        jCari_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCari_MenuActionPerformed(evt);
            }
        });
        getContentPane().add(jCari_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 71, 19));

        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });
        getContentPane().add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 60, 200, -1));
        getContentPane().add(notelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 200, -1));

        jLabel6.setBackground(new java.awt.Color(102, 255, 102));
        jLabel6.setFont(new java.awt.Font("Maiandra GD", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 255));
        jLabel6.setText("- DATA PEMESANAN HOTEL -");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 330, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 255));
        jLabel7.setText("NAMA LENGKAP");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 120, -1));
        getContentPane().add(checkin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 200, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 255));
        jLabel8.setText("UMUR");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 83, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 255));
        jLabel9.setText("NO. TELEPON");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 110, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 255));
        jLabel10.setText("CHECK IN");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 83, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NAMA LENGKAP", "UMUR", "NO. TELEPON", "CHECK IN", "CHECK OUT", "METODE PEMBAYARAN"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 750, 92));

        jbCari_.setFont(new java.awt.Font("DokChampa", 1, 10)); // NOI18N
        jbCari_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/datapemesananhotel/search.png"))); // NOI18N
        jbCari_.setBorderPainted(false);
        jbCari_.setContentAreaFilled(false);
        jbCari_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCari_ActionPerformed(evt);
            }
        });
        getContentPane().add(jbCari_, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 90, 50));

        jbHapus_.setBackground(new java.awt.Color(255, 0, 0));
        jbHapus_.setFont(new java.awt.Font("DokChampa", 1, 10)); // NOI18N
        jbHapus_.setText("HAPUS");
        jbHapus_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbHapus_ActionPerformed(evt);
            }
        });
        getContentPane().add(jbHapus_, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 80, -1));

        jbTambah.setBackground(new java.awt.Color(51, 255, 204));
        jbTambah.setFont(new java.awt.Font("DokChampa", 1, 10)); // NOI18N
        jbTambah.setText("TAMBAH");
        jbTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTambahActionPerformed(evt);
            }
        });
        getContentPane().add(jbTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 80, -1));

        jbReset_.setFont(new java.awt.Font("DokChampa", 1, 10)); // NOI18N
        jbReset_.setText("RESET");
        jbReset_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbReset_ActionPerformed(evt);
            }
        });
        getContentPane().add(jbReset_, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 80, -1));

        jbSimpan_.setBackground(new java.awt.Color(255, 255, 0));
        jbSimpan_.setFont(new java.awt.Font("DokChampa", 1, 10)); // NOI18N
        jbSimpan_.setText("SIMPAN");
        jbSimpan_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSimpan_ActionPerformed(evt);
            }
        });
        getContentPane().add(jbSimpan_, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 80, -1));

        jbUbah.setBackground(new java.awt.Color(0, 153, 51));
        jbUbah.setFont(new java.awt.Font("DokChampa", 1, 10)); // NOI18N
        jbUbah.setText("MULAI");
        jbUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbUbahActionPerformed(evt);
            }
        });
        getContentPane().add(jbUbah, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 80, -1));

        tfCari_.setFont(new java.awt.Font("DokChampa", 1, 10)); // NOI18N
        tfCari_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCari_ActionPerformed(evt);
            }
        });
        getContentPane().add(tfCari_, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 90, -1));

        jLabel1.setBackground(new java.awt.Color(204, 0, 204));
        jLabel1.setFont(new java.awt.Font("DokChampa", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Copyright  © 2017 Muhammad Zaidan Musyaffa");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 550, 24));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("CHECK OUT");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 181, -1, -1));
        getContentPane().add(checkout, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 200, -1));

        metpem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CASH", "CHEQUE", "CREDIT" }));
        getContentPane().add(metpem, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 80, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/datapemesananhotel/LOGO HOTEL1.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 255));
        jLabel3.setText("METODE PEMBAYARAN");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 180, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/datapemesananhotel/welcome.gif"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 390, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/datapemesananhotel/FreeVector-Seaside-Hotel-Vector.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBatalActionPerformed
        disabled();
        jbTambah.setEnabled(true);
        jbUbah.setEnabled(true);
        jbHapus_.setEnabled(true);
    }//GEN-LAST:event_jbBatalActionPerformed

    private void jbCari_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCari_ActionPerformed
        DefaultTableModel dtm1 = new DefaultTableModel();

        String columns[] = {"NAMA", "UMUR", "NO.TELPON", "CHECK IN", "CHECK OUT", "MET. PEMBAYARAN"};
        dtm1.setColumnIdentifiers(columns);

        String line;
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("pemesananhotel.txt"));
            int i;
            while ((line = reader.readLine()) != null) {
                String asd[] = {};
                asd = line.split("\t");
                //System.out.println(asd[1]);
                String searchOption = jCari_Menu.getSelectedItem().toString();
                String searchValue = tfCari_.getText().toLowerCase();
                if (searchOption.equalsIgnoreCase("NAMA") && !searchValue.isEmpty()) {
                    if (asd[0].toLowerCase().contains(searchValue)) {
                        dtm1.addRow(line.split("\t"));
                    }
                } else if (searchOption.equalsIgnoreCase("UMUR") && !searchValue.isEmpty()) {
                    if (asd[1].toLowerCase().equals(searchValue)) {
                        dtm1.addRow(line.split("\t"));
                    }
                } else {
                    dtm1.addRow(line.split("\t"));
                }

            }
            jTable2.setModel(dtm1);
            if (dtm1.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Data tidak ditemukan !", "", JOptionPane.INFORMATION_MESSAGE);
                tfCari_.setText(null);
                //tampilData();

                jTable2.setModel(dtm);

            }

            reader.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR");
            e.printStackTrace();
        }
    
    }//GEN-LAST:event_jbCari_ActionPerformed

    private void jbSimpan_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSimpan_ActionPerformed
        if (jbSimpan_.isEnabled()) {
            try {
                String a = nama.getText().trim().toUpperCase();
                String b = umur.getText().trim();
                String c = notelp.getText().trim();
                String d = checkin.getText().trim();
                String e = checkout.getText().trim();
                String f = metpem.getSelectedItem().toString();
                Object[] o = {a, b, c, d, e, f};

                if (a.equals("") || b.equals("") || c.equals("") || d.equals("") || e.equals("") || f.equals("")){
                    JOptionPane.showMessageDialog(null, "Data belum diisi !", "WARNING!", JOptionPane.WARNING_MESSAGE);
                } else {
                    dtm.addRow(o);
                    saveTable();
                }
                JOptionPane.showMessageDialog(null, "Data telah disimpan ^_^ ", "BERHASIL", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
            }

            jTable2.setModel(dtm);
        } else if (jbUbah.isEnabled()) {
            try {
                String a = nama.getText().trim().toUpperCase();
                String b = umur.getText().trim();
                String c = notelp.getText().trim();
                String d = checkin.getText().trim();
                String e = checkout.getText().trim();
                String f = metpem.getSelectedItem().toString();

                if (a.equals("") || b.equals("") || c.equals("") || d.equals("")|| e.equals("") || f.equals ("")){
                    JOptionPane.showMessageDialog(null, "Terjadi kesalahan !", "WARNING!", JOptionPane.WARNING_MESSAGE);
                } else {
                    int konfirmasi = JOptionPane.showConfirmDialog(null, "Ingin mengubah data ?", "Confirm", JOptionPane.YES_NO_OPTION);
                    if (konfirmasi == JOptionPane.YES_OPTION) {
                        int baris = jTable2.getSelectedRow();
                        jTable2.getModel().setValueAt(a, baris, 0);
                        jTable2.getModel().setValueAt(b, baris, 1);
                        jTable2.getModel().setValueAt(c, baris, 2);
                        jTable2.getModel().setValueAt(d, baris, 3);
                        jTable2.getModel().setValueAt(e, baris, 4);
                        jTable2.getModel().setValueAt(f, baris, 5);
                        
                        ClearTextField();
                        saveTable();
                    }

                }
                JOptionPane.showMessageDialog(null, "Data telah diubah", "BERHASIL", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
            }
        }

    }                                      


    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {                                     
        if (jbUbah.isEnabled() && jbBatal.isEnabled()) {
            try {
                int row = jTable2.getSelectedRow();
                nama.setText(jTable2.getModel().getValueAt(row, 0).toString());
                umur.setText(jTable2.getModel().getValueAt(row, 1).toString());
                notelp.setText(jTable2.getModel().getValueAt(row, 2).toString());
                checkin.setText(jTable2.getModel().getValueAt(row, 3).toString());
                checkout.setText(jTable2.getModel().getValueAt(row, 4).toString());
                metpem.setSelectedItem(jTable2.getModel().getValueAt(row, 5).toString());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Terjadi kesalahan !", "WARNING!", JOptionPane.WARNING_MESSAGE);
            }
        }

    
    }//GEN-LAST:event_jbSimpan_ActionPerformed

    private void jbReset_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbReset_ActionPerformed
        ClearTextField();
    }//GEN-LAST:event_jbReset_ActionPerformed

    private void jbHapus_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHapus_ActionPerformed
        try {
            int konfirmasi = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin menghapus data ?", "Confirm", JOptionPane.YES_NO_OPTION);
            if (konfirmasi == JOptionPane.YES_OPTION) {
                int x = jTable2.getSelectedRow();
                dtm.removeRow(x);
                JOptionPane.showMessageDialog(null, "Data telah di hapus ", "BERHASIL", JOptionPane.INFORMATION_MESSAGE);
            }
            saveTable();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jbHapus_ActionPerformed

    private void jbUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbUbahActionPerformed
        enabled();
        jbTambah.setEnabled(false);
        jbHapus_.setEnabled(false);
    }//GEN-LAST:event_jbUbahActionPerformed

    private void jbTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTambahActionPerformed
        enabled();
        jbUbah.setEnabled(false);
        jbHapus_.setEnabled(false);
    }//GEN-LAST:event_jbTambahActionPerformed

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void jCari_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCari_MenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCari_MenuActionPerformed

    private void tfCari_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCari_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCari_ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormPemesananHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPemesananHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPemesananHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPemesananHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPemesananHotel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField checkin;
    private javax.swing.JTextField checkout;
    private javax.swing.JComboBox<String> jCari_Menu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton jbBatal;
    private javax.swing.JButton jbCari_;
    private javax.swing.JButton jbHapus_;
    private javax.swing.JButton jbReset_;
    private javax.swing.JButton jbSimpan_;
    private javax.swing.JButton jbTambah;
    private javax.swing.JButton jbUbah;
    private javax.swing.JComboBox<String> metpem;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField notelp;
    private javax.swing.JTextField tfCari_;
    private javax.swing.JTextField umur;
    // End of variables declaration//GEN-END:variables
}
