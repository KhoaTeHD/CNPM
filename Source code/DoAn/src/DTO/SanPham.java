package DTO;

public class SanPham {

    String MaSP, MaLSP, TenSP, fileNameHinhAnh,MaTG,MaNXB;
    float DonGia;
    int SoLuong;

    public SanPham(String MaSP, String MaLSP, String TenSP, float DonGia, int SoLuong, String url, String MaTG, String MaNXB) {
        this.MaSP = MaSP;
        this.MaLSP = MaLSP;
        this.TenSP = TenSP;
        this.DonGia = DonGia;
        this.SoLuong = SoLuong;
        this.fileNameHinhAnh = url;
        this.MaTG=MaTG;
        this.MaNXB=MaNXB;
    }

    public String getFileNameHinhAnh() {
        return fileNameHinhAnh;
    }

    public void setFileNameHinhAnh(String fileNameHinhAnh) {
        this.fileNameHinhAnh = fileNameHinhAnh;
    }
    
    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getMaLSP() {
        return MaLSP;
    }

    public void setMaLSP(String MaLSP) {
        this.MaLSP = MaLSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public float getDonGia() {
        return DonGia;
    }

    public void setDonGia(float DonGia) {
        this.DonGia = DonGia;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }
    
    public String getMaTG(){
        return MaTG;
    }
    
    public void setMaTG(String MaTG){
        this.MaTG=MaTG;
    }
    
    public String getMaNXB(){
        return MaNXB;
    }
    
    public void setMaNXB(String MaNXB){
        this.MaNXB=MaNXB;
    }
}
