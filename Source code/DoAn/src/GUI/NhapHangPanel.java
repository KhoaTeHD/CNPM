/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import BUS.QuanLyChiTietPhieuNhapBUS;
import BUS.QuanLyLoaiSanPhamBUS;
import BUS.QuanLyNhaCungCapBUS;
import BUS.QuanLyPhieuNhapBUS;
import BUS.QuanLySanPhamBUS;
import BUS.WritePDF;
import DTO.ChiTietPhieuNhap;
import DTO.NhaCungCap;
import DTO.NhanVien;
import DTO.PhieuNhap;
import DTO.SanPham;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dangk
 */
public class NhapHangPanel extends javax.swing.JPanel {
    
    private DefaultTableModel mdtb1;
    private QuanLyChiTietPhieuNhapBUS qlctpnBUS = new QuanLyChiTietPhieuNhapBUS();
    private QuanLySanPhamBUS qlspBUS = new QuanLySanPhamBUS();
    private QuanLyLoaiSanPhamBUS qllspBUS = new QuanLyLoaiSanPhamBUS();
    private QuanLyPhieuNhapBUS qlpnBUS = new QuanLyPhieuNhapBUS();
    private QuanLyNhaCungCapBUS qlnccBUS = new QuanLyNhaCungCapBUS();
    private ArrayList<ChiTietPhieuNhap> dsctpn = new ArrayList<>();
    NhaCungCap nhacungcap;
    NhanVien nhanVien;
    /**
     * Creates new form SanPhamPanel
     */
    public NhapHangPanel() {
        initComponents();
        mdtb1 = (DefaultTableModel) tbSanPham.getModel();
        setDataToTable(qlspBUS.getDssp());
        
        tbSanPham.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent me) {
                int rowIndex = tbSanPham.getSelectedRow();
                String masp =(String) tbSanPham.getValueAt(rowIndex, 0);
                showInfo(masp,1);
            }
        });
        
        if (LoginFrame.nhanVienLogin != null) {
            nhanVien = LoginFrame.nhanVienLogin;
            tfNhanVien.setText(nhanVien.getTenNV() + " (" + nhanVien.getMaNV() + ")");
        }
        tfMaPhieuNhap.setText(qlpnBUS.getNextID());
        tfNgayLap.setText(LocalDate.now().toString());
        
        
        new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if (tfNhanVien.getText().equals("")
                        || tfNhaCC.getText().equals("")
                        || tfTongTien.getText().equals("")
                        || tfTongTien.getText().equals("0")) {
                    btnNhapHang.setEnabled(false);
                } else {
                    btnNhapHang.setEnabled(true);
                }
            }
        }, 0, 1000);
        
        tfTimKiem.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void changedUpdate(DocumentEvent e) {
                txSearchOnChange();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                txSearchOnChange();
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                txSearchOnChange();
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

        jPanel8 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        tfTimKiem = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lbImage = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        tfMaSP = new javax.swing.JTextField();
        tfLoaiSP = new javax.swing.JTextField();
        tfTenSP = new javax.swing.JTextField();
        tfDonGia = new javax.swing.JTextField();
        tfSoLuong = new javax.swing.JTextField();
        spSanPham = new javax.swing.JScrollPane();
        tbSanPham = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        tfMaPhieuNhap = new javax.swing.JTextField();
        tfTongTien = new javax.swing.JTextField();
        tfNhaCC = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        tfNhanVien = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        tfNgayLap = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        btnXoa = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbCTPN = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        btnHuy = new javax.swing.JButton();
        btnNhapHang = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1110, 800));
        setPreferredSize(new java.awt.Dimension(1110, 800));
        setLayout(null);

        jPanel8.setLayout(new java.awt.BorderLayout());

        tfTimKiem.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "T??m ki???m"));
        tfTimKiem.setPreferredSize(new java.awt.Dimension(250, 35));
        jPanel2.add(tfTimKiem);

        jPanel8.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel1.setPreferredSize(new java.awt.Dimension(555, 289));
        jPanel1.setLayout(new java.awt.BorderLayout());

        lbImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbImage.setPreferredSize(new java.awt.Dimension(250, 250));
        jPanel1.add(lbImage, java.awt.BorderLayout.LINE_START);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(0, 255, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giaodienchuan/images/icons8-add-property-30.png"))); // NOI18N
        jButton1.setText("Th??m");
        jButton1.setFocusable(false);
        jButton1.setMinimumSize(new java.awt.Dimension(73, 39));
        jButton1.setPreferredSize(new java.awt.Dimension(73, 39));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, java.awt.BorderLayout.PAGE_END);

        tfMaSP.setEditable(false);
        tfMaSP.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tfMaSP.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "M?? s???n ph???m"));
        tfMaSP.setPreferredSize(new java.awt.Dimension(140, 40));
        jPanel3.add(tfMaSP);

        tfLoaiSP.setEditable(false);
        tfLoaiSP.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tfLoaiSP.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Lo???i s???n ph???m"));
        tfLoaiSP.setPreferredSize(new java.awt.Dimension(140, 40));
        jPanel3.add(tfLoaiSP);

        tfTenSP.setEditable(false);
        tfTenSP.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tfTenSP.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "T??n s???n ph???m"));
        tfTenSP.setPreferredSize(new java.awt.Dimension(140, 40));
        jPanel3.add(tfTenSP);

        tfDonGia.setEditable(false);
        tfDonGia.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tfDonGia.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "????n gi??"));
        tfDonGia.setPreferredSize(new java.awt.Dimension(140, 40));
        jPanel3.add(tfDonGia);

        tfSoLuong.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tfSoLuong.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "S??? l?????ng"));
        tfSoLuong.setPreferredSize(new java.awt.Dimension(90, 40));
        jPanel3.add(tfSoLuong);

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel8.add(jPanel1, java.awt.BorderLayout.PAGE_END);

        spSanPham.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        spSanPham.setPreferredSize(new java.awt.Dimension(469, 363));

        tbSanPham.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tbSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "M??", "Lo???i", "T??n", "????n gi??", "S??? l?????ng"
            }
        ));
        tbSanPham.setFillsViewportHeight(true);
        tbSanPham.setRowHeight(40);
        tbSanPham.setShowGrid(true);
        spSanPham.setViewportView(tbSanPham);
        if (tbSanPham.getColumnModel().getColumnCount() > 0) {
            tbSanPham.getColumnModel().getColumn(0).setMaxWidth(70);
            tbSanPham.getColumnModel().getColumn(1).setMaxWidth(70);
            tbSanPham.getColumnModel().getColumn(2).setMaxWidth(250);
            tbSanPham.getColumnModel().getColumn(3).setMaxWidth(100);
            tbSanPham.getColumnModel().getColumn(4).setMaxWidth(70);
        }

        jPanel8.add(spSanPham, java.awt.BorderLayout.CENTER);
        spSanPham.getVerticalScrollBar().setUnitIncrement(8);

        add(jPanel8);
        jPanel8.setBounds(0, 0, 555, 800);

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));

        jPanel4.setPreferredSize(new java.awt.Dimension(545, 180));

        tfMaPhieuNhap.setEditable(false);
        tfMaPhieuNhap.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tfMaPhieuNhap.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "M?? phi???u nh???p"));
        tfMaPhieuNhap.setPreferredSize(new java.awt.Dimension(250, 40));
        jPanel4.add(tfMaPhieuNhap);

        tfTongTien.setEditable(false);
        tfTongTien.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tfTongTien.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "T???ng ti???n ( ngh??n VND )"));
        tfTongTien.setPreferredSize(new java.awt.Dimension(255, 40));
        jPanel4.add(tfTongTien);

        tfNhaCC.setEditable(false);
        tfNhaCC.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tfNhaCC.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Nh?? cung c???p"));
        tfNhaCC.setPreferredSize(new java.awt.Dimension(211, 40));
        jPanel4.add(tfNhaCC);

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giaodienchuan/images/icons8_more_20px.png"))); // NOI18N
        jButton2.setFocusable(false);
        jButton2.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2);

        tfNhanVien.setEditable(false);
        tfNhanVien.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tfNhanVien.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Nh??n vi??n"));
        tfNhanVien.setPreferredSize(new java.awt.Dimension(210, 40));
        jPanel4.add(tfNhanVien);

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giaodienchuan/images/icons8_more_20px.png"))); // NOI18N
        jButton3.setEnabled(false);
        jButton3.setFocusable(false);
        jButton3.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3);

        tfNgayLap.setEditable(false);
        tfNgayLap.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tfNgayLap.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Ng??y l???p"));
        tfNgayLap.setPreferredSize(new java.awt.Dimension(250, 40));
        jPanel4.add(tfNgayLap);

        jPanel10.add(jPanel4);

        jPanel5.setPreferredSize(new java.awt.Dimension(545, 550));
        jPanel5.setLayout(new java.awt.BorderLayout());

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
        jPanel6.add(btnXoa);

        jPanel5.add(jPanel6, java.awt.BorderLayout.PAGE_END);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setPreferredSize(new java.awt.Dimension(452, 370));

        tbCTPN.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tbCTPN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "M??", "T??n", "SL", "????n gi??", "Th??nh ti???n"
            }
        ));
        tbCTPN.setFillsViewportHeight(true);
        tbCTPN.setRowHeight(40);
        tbCTPN.setShowGrid(true);
        jScrollPane2.setViewportView(tbCTPN);
        if (tbCTPN.getColumnModel().getColumnCount() > 0) {
            tbCTPN.getColumnModel().getColumn(0).setMaxWidth(35);
            tbCTPN.getColumnModel().getColumn(1).setMaxWidth(50);
            tbCTPN.getColumnModel().getColumn(2).setMaxWidth(200);
            tbCTPN.getColumnModel().getColumn(3).setMaxWidth(50);
            tbCTPN.getColumnModel().getColumn(4).setMaxWidth(90);
            tbCTPN.getColumnModel().getColumn(5).setMaxWidth(110);
        }

        jPanel5.add(jScrollPane2, java.awt.BorderLayout.CENTER);
        spSanPham.getVerticalScrollBar().setUnitIncrement(8);

        jPanel10.add(jPanel5);

        jPanel7.setPreferredSize(new java.awt.Dimension(545, 50));
        jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        btnHuy.setBackground(new java.awt.Color(255, 255, 255));
        btnHuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giaodienchuan/images/icons8_cancel_30px_1.png"))); // NOI18N
        btnHuy.setText("H???y");
        btnHuy.setFocusable(false);
        btnHuy.setPreferredSize(new java.awt.Dimension(90, 35));
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });
        jPanel7.add(btnHuy);

        btnNhapHang.setBackground(new java.awt.Color(255, 255, 255));
        btnNhapHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giaodienchuan/images/icons8_us_dollar_30px.png"))); // NOI18N
        btnNhapHang.setText("Nh???p h??ng");
        btnNhapHang.setFocusable(false);
        btnNhapHang.setPreferredSize(new java.awt.Dimension(140, 35));
        btnNhapHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapHangActionPerformed(evt);
            }
        });
        jPanel7.add(btnNhapHang);

        jPanel10.add(jPanel7);

        add(jPanel10);
        jPanel10.setBounds(555, 0, 555, 800);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ChonNhaCungCap cncc = new ChonNhaCungCap(tfNhaCC);
            cncc.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    String mancc = tfNhaCC.getText();
                    nhacungcap = qlnccBUS.getNhaCungCap(mancc);
                    if (nhacungcap != null) {
                        tfNhaCC.setText(nhacungcap.getTenNCC() + " (" + nhacungcap.getMaNCC() + ")");
                    }
                }
        });    // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int i = tbCTPN.getSelectedRow();
        if (i >= 0 && i < dsctpn.size()) {
            dsctpn.remove(i);
            setDataToTablePN(dsctpn, tbCTPN);
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        tfNhaCC.setText("");
        tfTongTien.setText("");
        dsctpn.clear();
        setDataToTablePN(dsctpn, tbCTPN);
    }//GEN-LAST:event_btnHuyActionPerformed

    private void btnNhapHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapHangActionPerformed
        PhieuNhap pn = new PhieuNhap(
                tfMaPhieuNhap.getText(),
                nhacungcap.getMaNCC(),
                nhanVien.getMaNV(),
                LocalDate.parse(tfNgayLap.getText()),
                Float.parseFloat(tfTongTien.getText()));
        qlpnBUS.add(pn);

        for (ChiTietPhieuNhap ct : dsctpn) {
            qlctpnBUS.add(ct);
        }
        
        int reply = JOptionPane.showConfirmDialog(getRootPane(),
                        "Nh???p h??ng th??nh c??ng, b???n c?? mu???n IN PHI???U NH???P?", "Th??nh c??ng",
                        JOptionPane.YES_NO_OPTION);
        if(reply == JOptionPane.OK_OPTION) {
            new WritePDF().writePhieuNhap(tfMaPhieuNhap.getText());
        }
        
        tfMaPhieuNhap.setText(qlpnBUS.getNextID()); // l???y m?? cho phi???u nh???p m???i
        tfNhaCC.setText("");
        tfTongTien.setText("");
        dsctpn.clear();
        setDataToTablePN(dsctpn, tbCTPN);


    }//GEN-LAST:event_btnNhapHangActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
                String masp = tfMaSP.getText();
                int soluong = Integer.parseInt(tfSoLuong.getText());
                if (soluong > 0) {
                    addChiTiet(masp, soluong);
                } else {
                    JOptionPane.showMessageDialog(tfSoLuong, "S??? l?????ng ph???i l?? s??? d????ng!");
                    tfSoLuong.requestFocus();
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(tfSoLuong, "S??? l?????ng ph???i l?? s??? nguy??n!");
                tfSoLuong.requestFocus();
        }    
    }//GEN-LAST:event_jButton1ActionPerformed

    public void setDataToTablePN(ArrayList<ChiTietPhieuNhap> arr, JTable t) {
        DefaultTableModel mdtb = (DefaultTableModel) t.getModel();
        mdtb.setRowCount(0); // x??a table hi???n c??
        float tongtien = 0;
        int stt = 1;
        for (ChiTietPhieuNhap ctpn : arr) {
            String masp = ctpn.getMaSP();
            SanPham sp = qlspBUS.getSanPham(masp);
            String tensp = sp.getTenSP();
            int soluong = ctpn.getSoLuong();
            float dongia = ctpn.getDonGia();
            float thanhtien = soluong * dongia;

            mdtb.addRow(new String[]{
                String.valueOf(stt),
                masp,
                tensp,
                String.valueOf(soluong),
                PriceFormatter.format(dongia),
                PriceFormatter.format(thanhtien)
            });
            stt++;
            tongtien += thanhtien;
        }

        // check khuy???n m??i
        mdtb.addRow(new String[]{"", "", "", "", "", ""});
        mdtb.addRow(new String[]{"", "", "", "", "T???ng ti???n", PriceFormatter.format(tongtien)});
        tfTongTien.setText(String.valueOf(tongtien));
    }
    
    public void txSearchOnChange() {
        setDataToTable(qlspBUS.search(tfTimKiem.getText(), "T???t c???", -1, -1, -1, -1, 0));
    }
    
    private void setDataToTable(ArrayList<SanPham> data) {
        mdtb1.setRowCount(0); // x??a table hi???n c??
        for (SanPham sp : data) {
                mdtb1.addRow(new String[]{
                                sp.getMaSP(),
                                sp.getMaLSP(),
                                sp.getTenSP(),
                                PriceFormatter.format(sp.getDonGia()),
                                String.valueOf(sp.getSoLuong()),});
        }
    }

    public void showInfo(String masp, int soluong) {
        // https://stackoverflow.com/questions/16343098/resize-a-picture-to-fit-a-jlabel
        if (masp != null) 
            // show h??nh
            for (SanPham sp : qlspBUS.getDssp()) {
                if (sp.getMaSP().equals(masp)) {
                    int w = lbImage.getWidth();
                    int h = lbImage.getHeight();
                    ImageIcon img = new ImageIcon(getClass().getResource("/giaodienchuan/images/Product Images/" + sp.getFileNameHinhAnh()));
                    Image imgScaled = img.getImage().getScaledInstance(w, h, Image.SCALE_DEFAULT);
                    lbImage.setIcon(new ImageIcon(imgScaled));

                    // show info
                    String loai = qllspBUS.getLoaiSanPham(sp.getMaLSP()).getTenLSP();
                    tfMaSP.setText(sp.getMaSP());
                    tfTenSP.setText(sp.getTenSP());
                    tfLoaiSP.setText(loai + " - " + sp.getMaLSP());
                    tfDonGia.setText(PriceFormatter.format(sp.getDonGia()));
                    tfSoLuong.setText(String.valueOf(soluong));
                    return;
                }
            }
    }
    
    public void addChiTiet(String masp, int soluong) {
        SanPham sp = qlspBUS.getSanPham(masp);

        Boolean daCo = false; // check xem trong danh s??ch chi ti???t h??a ????n ???? c?? s???n ph???m n??y ch??a
        for (ChiTietPhieuNhap ctpn : dsctpn) {
            if (ctpn.getMaSP().equals(sp.getMaSP())) {
                int tongSoLuong = soluong + ctpn.getSoLuong();
                ctpn.setSoLuong(tongSoLuong); // c?? r???i th?? thay ?????i s??? l?????ng
                daCo = true;
            }
        }

        if (!daCo) { // n???u ch??a c?? th?? th??m m???i
            ChiTietPhieuNhap ctpn = new ChiTietPhieuNhap(qlpnBUS.getNextID(), masp, soluong, sp.getDonGia());
            dsctpn.add(ctpn);
        }

        // c???p nh???t l???i table
        setDataToTablePN(dsctpn, tbCTPN);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnNhapHang;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbImage;
    private javax.swing.JScrollPane spSanPham;
    private javax.swing.JTable tbCTPN;
    private javax.swing.JTable tbSanPham;
    private javax.swing.JTextField tfDonGia;
    private javax.swing.JTextField tfLoaiSP;
    private javax.swing.JTextField tfMaPhieuNhap;
    private javax.swing.JTextField tfMaSP;
    private javax.swing.JTextField tfNgayLap;
    private javax.swing.JTextField tfNhaCC;
    private javax.swing.JTextField tfNhanVien;
    private javax.swing.JTextField tfSoLuong;
    private javax.swing.JTextField tfTenSP;
    private javax.swing.JTextField tfTimKiem;
    private javax.swing.JTextField tfTongTien;
    // End of variables declaration//GEN-END:variables
}
