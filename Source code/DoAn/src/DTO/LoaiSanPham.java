
package DTO;
// package giaodienchuan.model.BackEnd.QuanLyLoaiSanPham;
public class LoaiSanPham {
    String MaLSP, TenLSP, MoTa;
    // Phương thức khởi tạo có tham só
    public LoaiSanPham(String MaLSP, String TenLSP, String MoTa) {
        this.MaLSP = MaLSP;
        this.TenLSP = TenLSP;
        this.MoTa = MoTa;
    }
// Phương thức thiết lập 
    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    public String getMaLSP() {
        return MaLSP;
    }

    public void setMaLSP(String MaLSP) {
        this.MaLSP = MaLSP;
    }

    public String getTenLSP() {
        return TenLSP;
    }

    public void setTenLSP(String TenLSP) {
        this.TenLSP = TenLSP;
    }
}
