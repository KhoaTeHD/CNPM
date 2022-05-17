/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import BUS.SwitchPanel;
import DTO.DanhMuc;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author dangk
 */
public class HomeFrame extends javax.swing.JFrame {
    

    /**
     * Creates new form HomeFrame
     */
    public HomeFrame() {
        initComponents();
        
        
        String tenNhanVien = LoginFrame.nhanVienLogin.getTenNV();
        lbDangXuat.setText(tenNhanVien);
        pnDangXuat.setToolTipText("Đăng xuất (" + tenNhanVien + " - " + LoginFrame.nhanVienLogin.getMaNV() + ")");
        lbDangXuat.setToolTipText("Đăng xuất (" + tenNhanVien + " - " + LoginFrame.nhanVienLogin.getMaNV() + ")");
        pnDangXuat.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent me) {
                    logout();
                }
        });
        lbDangXuat.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent me) {
                    logout();
                }
        });
        
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we) {
                int reply  = JOptionPane.showConfirmDialog(getRootPane(),
                        "Bạn có chắc muốn thoát chương trình Quản Lý?", "Chú ý",
                        JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION)
                  setDefaultCloseOperation(EXIT_ON_CLOSE);
                else if (reply == JOptionPane.NO_OPTION)
                  setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
            }
        });
        
        
        ImageIcon img = new ImageIcon(getClass().getResource("/new/bg2.jfif"));
        Image imgScaled = img.getImage().getScaledInstance(lbImg.getWidth(), lbImg.getHeight(), Image.SCALE_DEFAULT);
        lbImg.setIcon(new ImageIcon(imgScaled));

        
        SwitchPanel sp = new SwitchPanel(pnContent);
//        sp.setView(pnSanPham, lbSanPham);
        
        
        ArrayList<DanhMuc> menu = new ArrayList<>();
        
        menu.add( new DanhMuc("Bán hàng",pnBanHang,lbBanHang));
        menu.add( new DanhMuc("Nhập hàng",pnNhapHang,lbNhapHang));
        menu.add( new DanhMuc("Sản phẩm",pnSanPham,lbSanPham));
        menu.add( new DanhMuc("Thể loại",pnTheLoai,lbTheLoai));
        menu.add( new DanhMuc("Tác giả",pnTacGia,lbTacGia));
        menu.add( new DanhMuc("Nhà xuất bản",pnNXB,lbNXB));
        menu.add( new DanhMuc("Hóa đơn",pnHoaDon,lbHoaDon));
        menu.add( new DanhMuc("Phiếu nhập",pnPhieuNhap,lbPhieuNhap));
        menu.add( new DanhMuc("Nhân viên",pnNhanVien,lbNhanVien));
        menu.add( new DanhMuc("Khách hàng",pnKhachHang,lbKhachHang));
        menu.add( new DanhMuc("Nhà cung cấp",pnNCC,lbNCC));
        menu.add( new DanhMuc("Tài khoản",pnTaiKhoan,lbTaiKhoan));
        
        sp.setEvent(menu);
           
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnHome = new javax.swing.JPanel();
        pnContent = new javax.swing.JPanel();
        lbImg = new javax.swing.JLabel();
        spnMenu = new javax.swing.JScrollPane();
        pnMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pnBanHang = new javax.swing.JPanel();
        lbBanHang = new javax.swing.JLabel();
        pnSanPham = new javax.swing.JPanel();
        lbSanPham = new javax.swing.JLabel();
        pnNhapHang = new javax.swing.JPanel();
        lbNhapHang = new javax.swing.JLabel();
        pnTheLoai = new javax.swing.JPanel();
        lbTheLoai = new javax.swing.JLabel();
        pnNXB = new javax.swing.JPanel();
        lbNXB = new javax.swing.JLabel();
        pnHoaDon = new javax.swing.JPanel();
        lbHoaDon = new javax.swing.JLabel();
        pnPhieuNhap = new javax.swing.JPanel();
        lbPhieuNhap = new javax.swing.JLabel();
        pnNhanVien = new javax.swing.JPanel();
        lbNhanVien = new javax.swing.JLabel();
        pnKhachHang = new javax.swing.JPanel();
        lbKhachHang = new javax.swing.JLabel();
        pnNCC = new javax.swing.JPanel();
        lbNCC = new javax.swing.JLabel();
        pnTaiKhoan = new javax.swing.JPanel();
        lbTaiKhoan = new javax.swing.JLabel();
        pnTacGia = new javax.swing.JPanel();
        lbTacGia = new javax.swing.JLabel();
        pnDangXuat = new javax.swing.JPanel();
        lbDangXuat = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý cửa hàng sách");
        setIconImages(null);
        setPreferredSize(new java.awt.Dimension(1376, 840));
        setResizable(false);
        setSize(new java.awt.Dimension(1376, 840));

        pnHome.setPreferredSize(new java.awt.Dimension(1376, 840));

        pnContent.setPreferredSize(new java.awt.Dimension(1120, 0));

        javax.swing.GroupLayout pnContentLayout = new javax.swing.GroupLayout(pnContent);
        pnContent.setLayout(pnContentLayout);
        pnContentLayout.setHorizontalGroup(
            pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnContentLayout.setVerticalGroup(
            pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        spnMenu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        spnMenu.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        pnMenu.setBackground(new java.awt.Color(102, 102, 102));
        pnMenu.setAutoscrolls(true);
        pnMenu.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        pnMenu.setPreferredSize(new java.awt.Dimension(230, 1050));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Chức năng");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        pnBanHang.setBackground(new java.awt.Color(46, 134, 222));
        pnBanHang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnBanHang.setPreferredSize(new java.awt.Dimension(230, 60));

        lbBanHang.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbBanHang.setForeground(new java.awt.Color(255, 255, 255));
        lbBanHang.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbBanHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giaodienchuan/images/icons8-shop-30.png"))); // NOI18N
        lbBanHang.setText("Bán hàng");
        lbBanHang.setToolTipText("");

        javax.swing.GroupLayout pnBanHangLayout = new javax.swing.GroupLayout(pnBanHang);
        pnBanHang.setLayout(pnBanHangLayout);
        pnBanHangLayout.setHorizontalGroup(
            pnBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBanHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbBanHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnBanHangLayout.setVerticalGroup(
            pnBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBanHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbBanHang, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnSanPham.setBackground(new java.awt.Color(46, 134, 222));
        pnSanPham.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnSanPham.setPreferredSize(new java.awt.Dimension(230, 60));

        lbSanPham.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbSanPham.setForeground(new java.awt.Color(255, 255, 255));
        lbSanPham.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giaodienchuan/images/icons8-book-30.png"))); // NOI18N
        lbSanPham.setText("Sản phẩm");
        lbSanPham.setToolTipText("");

        javax.swing.GroupLayout pnSanPhamLayout = new javax.swing.GroupLayout(pnSanPham);
        pnSanPham.setLayout(pnSanPhamLayout);
        pnSanPhamLayout.setHorizontalGroup(
            pnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnSanPhamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnSanPhamLayout.setVerticalGroup(
            pnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnSanPhamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnNhapHang.setBackground(new java.awt.Color(46, 134, 222));
        pnNhapHang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnNhapHang.setPreferredSize(new java.awt.Dimension(230, 60));

        lbNhapHang.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbNhapHang.setForeground(new java.awt.Color(255, 255, 255));
        lbNhapHang.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbNhapHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giaodienchuan/images/icons8_downloads_30px.png"))); // NOI18N
        lbNhapHang.setText("Nhập hàng");
        lbNhapHang.setToolTipText("");

        javax.swing.GroupLayout pnNhapHangLayout = new javax.swing.GroupLayout(pnNhapHang);
        pnNhapHang.setLayout(pnNhapHangLayout);
        pnNhapHangLayout.setHorizontalGroup(
            pnNhapHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNhapHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbNhapHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnNhapHangLayout.setVerticalGroup(
            pnNhapHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNhapHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbNhapHang, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnTheLoai.setBackground(new java.awt.Color(46, 134, 222));
        pnTheLoai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnTheLoai.setPreferredSize(new java.awt.Dimension(230, 60));

        lbTheLoai.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbTheLoai.setForeground(new java.awt.Color(255, 255, 255));
        lbTheLoai.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTheLoai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giaodienchuan/images/icons8_dossier_folder_30px.png"))); // NOI18N
        lbTheLoai.setText("Thể loại");
        lbTheLoai.setToolTipText("");

        javax.swing.GroupLayout pnTheLoaiLayout = new javax.swing.GroupLayout(pnTheLoai);
        pnTheLoai.setLayout(pnTheLoaiLayout);
        pnTheLoaiLayout.setHorizontalGroup(
            pnTheLoaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTheLoaiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTheLoai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnTheLoaiLayout.setVerticalGroup(
            pnTheLoaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTheLoaiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTheLoai, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnNXB.setBackground(new java.awt.Color(46, 134, 222));
        pnNXB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnNXB.setPreferredSize(new java.awt.Dimension(230, 60));

        lbNXB.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbNXB.setForeground(new java.awt.Color(255, 255, 255));
        lbNXB.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbNXB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giaodienchuan/images/icons8_company_30px.png"))); // NOI18N
        lbNXB.setText("Nhà xuất bản");
        lbNXB.setToolTipText("");

        javax.swing.GroupLayout pnNXBLayout = new javax.swing.GroupLayout(pnNXB);
        pnNXB.setLayout(pnNXBLayout);
        pnNXBLayout.setHorizontalGroup(
            pnNXBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNXBLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbNXB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnNXBLayout.setVerticalGroup(
            pnNXBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNXBLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbNXB, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnHoaDon.setBackground(new java.awt.Color(46, 134, 222));
        pnHoaDon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnHoaDon.setPreferredSize(new java.awt.Dimension(230, 60));

        lbHoaDon.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbHoaDon.setForeground(new java.awt.Color(255, 255, 255));
        lbHoaDon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giaodienchuan/images/icons8_agreement_30px.png"))); // NOI18N
        lbHoaDon.setText("Hóa đơn");
        lbHoaDon.setToolTipText("");

        javax.swing.GroupLayout pnHoaDonLayout = new javax.swing.GroupLayout(pnHoaDon);
        pnHoaDon.setLayout(pnHoaDonLayout);
        pnHoaDonLayout.setHorizontalGroup(
            pnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnHoaDonLayout.setVerticalGroup(
            pnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnPhieuNhap.setBackground(new java.awt.Color(46, 134, 222));
        pnPhieuNhap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnPhieuNhap.setPreferredSize(new java.awt.Dimension(230, 60));

        lbPhieuNhap.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbPhieuNhap.setForeground(new java.awt.Color(255, 255, 255));
        lbPhieuNhap.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbPhieuNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giaodienchuan/images/icons8-invoice-30.png"))); // NOI18N
        lbPhieuNhap.setText("Phiếu nhập");
        lbPhieuNhap.setToolTipText("");

        javax.swing.GroupLayout pnPhieuNhapLayout = new javax.swing.GroupLayout(pnPhieuNhap);
        pnPhieuNhap.setLayout(pnPhieuNhapLayout);
        pnPhieuNhapLayout.setHorizontalGroup(
            pnPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPhieuNhapLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbPhieuNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnPhieuNhapLayout.setVerticalGroup(
            pnPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPhieuNhapLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbPhieuNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnNhanVien.setBackground(new java.awt.Color(46, 134, 222));
        pnNhanVien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnNhanVien.setPreferredSize(new java.awt.Dimension(230, 60));

        lbNhanVien.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        lbNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giaodienchuan/images/icons8-customer-agent-30.png"))); // NOI18N
        lbNhanVien.setText("Nhân viên");
        lbNhanVien.setToolTipText("");

        javax.swing.GroupLayout pnNhanVienLayout = new javax.swing.GroupLayout(pnNhanVien);
        pnNhanVien.setLayout(pnNhanVienLayout);
        pnNhanVienLayout.setHorizontalGroup(
            pnNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNhanVienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnNhanVienLayout.setVerticalGroup(
            pnNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNhanVienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnKhachHang.setBackground(new java.awt.Color(46, 134, 222));
        pnKhachHang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnKhachHang.setPreferredSize(new java.awt.Dimension(230, 60));

        lbKhachHang.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbKhachHang.setForeground(new java.awt.Color(255, 255, 255));
        lbKhachHang.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giaodienchuan/images/icons8-account-30.png"))); // NOI18N
        lbKhachHang.setText("Khách hàng");
        lbKhachHang.setToolTipText("");

        javax.swing.GroupLayout pnKhachHangLayout = new javax.swing.GroupLayout(pnKhachHang);
        pnKhachHang.setLayout(pnKhachHangLayout);
        pnKhachHangLayout.setHorizontalGroup(
            pnKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnKhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnKhachHangLayout.setVerticalGroup(
            pnKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnKhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnNCC.setBackground(new java.awt.Color(46, 134, 222));
        pnNCC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnNCC.setPreferredSize(new java.awt.Dimension(230, 60));

        lbNCC.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbNCC.setForeground(new java.awt.Color(255, 255, 255));
        lbNCC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbNCC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giaodienchuan/images/icons8_company_30px.png"))); // NOI18N
        lbNCC.setText("Nhà cung cấp");
        lbNCC.setToolTipText("");

        javax.swing.GroupLayout pnNCCLayout = new javax.swing.GroupLayout(pnNCC);
        pnNCC.setLayout(pnNCCLayout);
        pnNCCLayout.setHorizontalGroup(
            pnNCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNCCLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbNCC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnNCCLayout.setVerticalGroup(
            pnNCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNCCLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbNCC, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnTaiKhoan.setBackground(new java.awt.Color(46, 134, 222));
        pnTaiKhoan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnTaiKhoan.setPreferredSize(new java.awt.Dimension(230, 60));

        lbTaiKhoan.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbTaiKhoan.setForeground(new java.awt.Color(255, 255, 255));
        lbTaiKhoan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTaiKhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giaodienchuan/images/icons8_key_30px.png"))); // NOI18N
        lbTaiKhoan.setText("Tài khoản");
        lbTaiKhoan.setToolTipText("");

        javax.swing.GroupLayout pnTaiKhoanLayout = new javax.swing.GroupLayout(pnTaiKhoan);
        pnTaiKhoan.setLayout(pnTaiKhoanLayout);
        pnTaiKhoanLayout.setHorizontalGroup(
            pnTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTaiKhoanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnTaiKhoanLayout.setVerticalGroup(
            pnTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTaiKhoanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnTacGia.setBackground(new java.awt.Color(46, 134, 222));
        pnTacGia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnTacGia.setPreferredSize(new java.awt.Dimension(230, 60));

        lbTacGia.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbTacGia.setForeground(new java.awt.Color(255, 255, 255));
        lbTacGia.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTacGia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giaodienchuan/images/icons8-quill-with-ink-30.png"))); // NOI18N
        lbTacGia.setText("Tác giả");
        lbTacGia.setToolTipText("");

        javax.swing.GroupLayout pnTacGiaLayout = new javax.swing.GroupLayout(pnTacGia);
        pnTacGia.setLayout(pnTacGiaLayout);
        pnTacGiaLayout.setHorizontalGroup(
            pnTacGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTacGiaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTacGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnTacGiaLayout.setVerticalGroup(
            pnTacGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTacGiaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTacGia, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnDangXuat.setBackground(new java.awt.Color(153, 153, 153));
        pnDangXuat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnDangXuat.setPreferredSize(new java.awt.Dimension(230, 60));

        lbDangXuat.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbDangXuat.setForeground(new java.awt.Color(255, 255, 255));
        lbDangXuat.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giaodienchuan/images/icons8_exit_30px.png"))); // NOI18N
        lbDangXuat.setToolTipText("");

        javax.swing.GroupLayout pnDangXuatLayout = new javax.swing.GroupLayout(pnDangXuat);
        pnDangXuat.setLayout(pnDangXuatLayout);
        pnDangXuatLayout.setHorizontalGroup(
            pnDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDangXuatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnDangXuatLayout.setVerticalGroup(
            pnDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDangXuatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnMenuLayout = new javax.swing.GroupLayout(pnMenu);
        pnMenu.setLayout(pnMenuLayout);
        pnMenuLayout.setHorizontalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(pnBanHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnNhapHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnTheLoai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnNXB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnPhieuNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnNhanVien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnSanPham, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnNCC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnTacGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnMenuLayout.setVerticalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMenuLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnNhapHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnNXB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnPhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        spnMenu.setViewportView(pnMenu);

        javax.swing.GroupLayout pnHomeLayout = new javax.swing.GroupLayout(pnHome);
        pnHome.setLayout(pnHomeLayout);
        pnHomeLayout.setHorizontalGroup(
            pnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHomeLayout.createSequentialGroup()
                .addComponent(spnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnContent, javax.swing.GroupLayout.DEFAULT_SIZE, 1112, Short.MAX_VALUE))
        );
        pnHomeLayout.setVerticalGroup(
            pnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spnMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addComponent(pnContent, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnHome, javax.swing.GroupLayout.DEFAULT_SIZE, 1360, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeFrame().setVisible(true);
            }
        });
    }
    
    private void logout() {

        if (JOptionPane.showConfirmDialog(getRootPane(),"Bạn có chắc muốn đăng xuất khỏi " + LoginFrame.nhanVienLogin.getTenNV() + "?", 
                "Chú ý",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            new LoginFrame().setVisible(true);
            this.dispose();
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbBanHang;
    private javax.swing.JLabel lbDangXuat;
    private javax.swing.JLabel lbHoaDon;
    private javax.swing.JLabel lbImg;
    private javax.swing.JLabel lbKhachHang;
    private javax.swing.JLabel lbNCC;
    private javax.swing.JLabel lbNXB;
    private javax.swing.JLabel lbNhanVien;
    private javax.swing.JLabel lbNhapHang;
    private javax.swing.JLabel lbPhieuNhap;
    private javax.swing.JLabel lbSanPham;
    private javax.swing.JLabel lbTacGia;
    private javax.swing.JLabel lbTaiKhoan;
    private javax.swing.JLabel lbTheLoai;
    private javax.swing.JPanel pnBanHang;
    private javax.swing.JPanel pnContent;
    private javax.swing.JPanel pnDangXuat;
    private javax.swing.JPanel pnHoaDon;
    private javax.swing.JPanel pnHome;
    private javax.swing.JPanel pnKhachHang;
    private javax.swing.JPanel pnMenu;
    private javax.swing.JPanel pnNCC;
    private javax.swing.JPanel pnNXB;
    private javax.swing.JPanel pnNhanVien;
    private javax.swing.JPanel pnNhapHang;
    private javax.swing.JPanel pnPhieuNhap;
    private javax.swing.JPanel pnSanPham;
    private javax.swing.JPanel pnTacGia;
    private javax.swing.JPanel pnTaiKhoan;
    private javax.swing.JPanel pnTheLoai;
    private javax.swing.JScrollPane spnMenu;
    // End of variables declaration//GEN-END:variables

}
