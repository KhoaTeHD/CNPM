/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import BUS.DocExcel;
import BUS.QuanLyNhanVienBUS;
import BUS.XuatExcel;
import DTO.NhanVien;
import java.awt.Color;
import java.awt.Font;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dangk
 */
public class NhanVienPanel extends javax.swing.JPanel {
    
    private DefaultTableModel mdtb1;    
    QuanLyNhanVienBUS qlnv = new QuanLyNhanVienBUS();
    
    /**
     * Creates new form SanPhamPanel
     */
    public NhanVienPanel() {
        initComponents();
        
        mdtb1 = (DefaultTableModel) tbNhanVien.getModel();
        setDataToTable(qlnv.getDsnv());    
        
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXuatExcel = new javax.swing.JButton();
        btnNhapExcel = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        cbTypeSearch = new javax.swing.JComboBox<>();
        tfTim = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbNhanVien = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1110, 800));
        setPreferredSize(new java.awt.Dimension(1110, 800));
        setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(46, 134, 222));
        jPanel2.setPreferredSize(new java.awt.Dimension(1120, 55));

        btnThem.setBackground(new java.awt.Color(255, 255, 255));
        btnThem.setForeground(new java.awt.Color(0, 255, 0));
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giaodienchuan/images/icons8-add-property-30.png"))); // NOI18N
        btnThem.setText("Th??m");
        btnThem.setFocusable(false);
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel2.add(btnThem);

        btnXoa.setBackground(new java.awt.Color(255, 255, 255));
        btnXoa.setForeground(new java.awt.Color(255, 0, 0));
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giaodienchuan/images/icons8-delete-bin-30.png"))); // NOI18N
        btnXoa.setText("X??a");
        btnXoa.setFocusable(false);
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel2.add(btnXoa);

        btnSua.setBackground(new java.awt.Color(255, 255, 255));
        btnSua.setForeground(new java.awt.Color(0, 0, 255));
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giaodienchuan/images/icons8-support-30.png"))); // NOI18N
        btnSua.setText("S???a");
        btnSua.setFocusable(false);
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel2.add(btnSua);

        btnXuatExcel.setBackground(new java.awt.Color(255, 255, 255));
        btnXuatExcel.setForeground(new java.awt.Color(0, 255, 0));
        btnXuatExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giaodienchuan/images/icons8-microsoft-excel-30.png"))); // NOI18N
        btnXuatExcel.setText("Xu???t Excel");
        btnXuatExcel.setFocusable(false);
        btnXuatExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatExcelActionPerformed(evt);
            }
        });
        jPanel2.add(btnXuatExcel);

        btnNhapExcel.setBackground(new java.awt.Color(255, 255, 255));
        btnNhapExcel.setForeground(new java.awt.Color(0, 255, 0));
        btnNhapExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giaodienchuan/images/icons8-microsoft-excel-30.png"))); // NOI18N
        btnNhapExcel.setText("Nh???p Excel");
        btnNhapExcel.setFocusable(false);
        btnNhapExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapExcelActionPerformed(evt);
            }
        });
        jPanel2.add(btnNhapExcel);

        add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel1.setLayout(new java.awt.BorderLayout());

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

        jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_START);

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
        tbNhanVien.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 16));
        tbNhanVien.setShowGrid(true);
        jScrollPane1.setViewportView(tbNhanVien);
        if (tbNhanVien.getColumnModel().getColumnCount() > 0) {
            tbNhanVien.getColumnModel().getColumn(0).setMaxWidth(80);
            tbNhanVien.getColumnModel().getColumn(1).setMaxWidth(200);
            tbNhanVien.getColumnModel().getColumn(2).setMaxWidth(300);
            tbNhanVien.getColumnModel().getColumn(3).setMaxWidth(150);
            tbNhanVien.getColumnModel().getColumn(4).setMaxWidth(300);
            tbNhanVien.getColumnModel().getColumn(5).setMaxWidth(150);
        }

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(8);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void cbTypeSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTypeSearchActionPerformed
        tfTim.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),cbTypeSearch.getSelectedItem().toString()));
        tfTim.requestFocus();
        if (!tfTim.getText().equals("")) {
            tfSearchOnChange();
        }
    }//GEN-LAST:event_cbTypeSearchActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        ThemSuaNhanVienForm themnv = new ThemSuaNhanVienForm("Th??m", "");
        themnv.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                qlnv.readDB();
                setDataToTable(qlnv.getDsnv());  // refresh
            }
        });
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        try {
            String manv = (String) tbNhanVien.getValueAt(tbNhanVien.getSelectedRow(), 1);
            if (manv != null) {
                ThemSuaNhanVienForm suanv = new ThemSuaNhanVienForm("S???a", manv);

                // https://stackoverflow.com/questions/4154780/jframe-catch-dispose-event
                suanv.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                        qlnv.readDB();
                        setDataToTable(qlnv.getDsnv());  // refresh
                    }
                });
            } 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ch??a ch???n nh??n vi??n n??o ????? s???a");
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        try {
            String manv = (String) tbNhanVien.getValueAt(tbNhanVien.getSelectedRow(), 1);
            if (manv != null) {
                QuanLyNhanVienBUS qlnvBUS = new QuanLyNhanVienBUS();
                if (JOptionPane.showConfirmDialog(null, "B???n c?? ch???c mu???n x??a nh??n vi??n " + manv + " ?",
                        "Ch?? ??", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
                    qlnvBUS.delete(manv);
                    qlnv.readDB();
                    setDataToTable(qlnv.getDsnv());  // refresh
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ch??a ch???n nh??n vi??n n??o ????? x??a");
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnXuatExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatExcelActionPerformed
        new XuatExcel().xuatFileExcelNhanVien();
    }//GEN-LAST:event_btnXuatExcelActionPerformed

    private void btnNhapExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapExcelActionPerformed
        new DocExcel().docFileExcelNhanVien();
    }//GEN-LAST:event_btnNhapExcelActionPerformed

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
    private javax.swing.JButton btnNhapExcel;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXuatExcel;
    private javax.swing.JComboBox<String> cbTypeSearch;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbNhanVien;
    private javax.swing.JTextField tfTim;
    // End of variables declaration//GEN-END:variables
}
