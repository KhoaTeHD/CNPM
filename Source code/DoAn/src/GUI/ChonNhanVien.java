/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import BUS.QuanLyKhachHangBUS;
import BUS.QuanLyNhanVienBUS;
import DTO.KhachHang;
import DTO.NhanVien;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dangk
 */
public class ChonNhanVien extends javax.swing.JFrame {

    JTextField tf;
    private DefaultTableModel mdtb1;    
    QuanLyNhanVienBUS qlnv = new QuanLyNhanVienBUS();
    /**
     * Creates new form ChonKhuyenMai
     */
    public ChonNhanVien(JTextField tf) {
        initComponents();
        mdtb1 = (DefaultTableModel) tbNhanVien.getModel();
        setDataToTable(qlnv.getDsnv());    
        this.tf = tf;
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
        tfTim.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void changedUpdate(DocumentEvent e) {
                tfSearchOnChange();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                tfSearchOnChange();
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                tfSearchOnChange();
            }
        });
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        cbTypeSearch = new javax.swing.JComboBox<>();
        tfTim = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbNhanVien = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setPreferredSize(new java.awt.Dimension(1249, 80));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "T??m ki???m"));
        jPanel4.setPreferredSize(new java.awt.Dimension(280, 70));
        jPanel4.setLayout(null);

        cbTypeSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "T???t c???", "M?? nh??n vi??n", "T??n nh??n vi??n", "Ng??y sinh", "?????a ch???", "S??? ??i???n tho???i", " " }));
        cbTypeSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTypeSearchActionPerformed(evt);
            }
        });
        jPanel4.add(cbTypeSearch);
        cbTypeSearch.setBounds(20, 30, 100, 20);

        tfTim.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "T???t c???"));
        tfTim.setPreferredSize(new java.awt.Dimension(130, 36));
        jPanel4.add(tfTim);
        tfTim.setBounds(130, 20, 140, 36);

        jPanel3.add(jPanel4);

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giaodienchuan/images/icons8_ok_30px.png"))); // NOI18N
        jButton1.setText("Th??m");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giaodienchuan/images/icons8_cancel_30px_1.png"))); // NOI18N
        jButton2.setText("Tho??t");
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(452, 370));

        tbNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tbNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "M?? nh??n vi??n", "T??n nh??n vi??n", "Ng??y sinh", "?????a ch???", "S??? ??i???n tho???i"
            }
        ));
        tbNhanVien.setFillsViewportHeight(true);
        tbNhanVien.setRowHeight(40);
        tbNhanVien.setShowGrid(true);
        jScrollPane1.setViewportView(tbNhanVien);
        if (tbNhanVien.getColumnModel().getColumnCount() > 0) {
            tbNhanVien.getColumnModel().getColumn(0).setMaxWidth(70);
            tbNhanVien.getColumnModel().getColumn(1).setMaxWidth(130);
            tbNhanVien.getColumnModel().getColumn(2).setMaxWidth(300);
            tbNhanVien.getColumnModel().getColumn(3).setMaxWidth(150);
            tbNhanVien.getColumnModel().getColumn(4).setMaxWidth(200);
            tbNhanVien.getColumnModel().getColumn(5).setMaxWidth(150);
        }

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(8);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String manv =(String) tbNhanVien.getValueAt(tbNhanVien.getSelectedRow(), 1);
            if (manv != null) {
                tf.setText(manv);
                this.dispose();

            } else {
                JOptionPane.showMessageDialog(this, "Ch??a ch???n nh??n vi??n n??o!");
            }     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cbTypeSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTypeSearchActionPerformed
        tfTim.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),cbTypeSearch.getSelectedItem().toString()));
        tfTim.requestFocus();
        if (!tfTim.getText().equals("")) {
            tfSearchOnChange();
        }
    }//GEN-LAST:event_cbTypeSearchActionPerformed

    private void setDataToTable(ArrayList<NhanVien> data) {
        mdtb1.setRowCount(0); // x??a table hi???n c??
        int stt = 1; // l??u s??? th??? t??? d??ng hi???n t???i
        for (NhanVien nv : data) {
            mdtb1.addRow(new String[]{
                String.valueOf(stt),
                nv.getMaNV(),
                nv.getTenNV(),
                nv.getNgaySinh().toString(),
                nv.getDiaChi(),
                nv.getSDT(),
            });
            stt++;
        }
    }
    
    private void tfSearchOnChange() {
        setDataToTable(qlnv.search(tfTim.getText(), cbTypeSearch.getSelectedItem().toString()));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbTypeSearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbNhanVien;
    private javax.swing.JTextField tfTim;
    // End of variables declaration//GEN-END:variables
}
