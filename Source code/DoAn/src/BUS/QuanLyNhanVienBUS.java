package BUS;


import DAO.*;
import DTO.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class QuanLyNhanVienBUS {

    private ArrayList<NhanVien> dsnv = new ArrayList<>();
    private QuanLyNhanVienDAO qlnvDAO = new QuanLyNhanVienDAO();

    public QuanLyNhanVienBUS() {
        dsnv = qlnvDAO.readDB();
    }

    public void showConsole() {
        dsnv.forEach((nv) -> {
            System.out.print(nv.getMaNV() + " ");
            System.out.println(nv.getTenNV() + " ");
            System.out.println(nv.getNgaySinh() + " ");
            System.out.println(nv.getDiaChi() + " ");
            System.out.println(nv.getSDT() + " ");
        });
    }

    public String[] getHeaders() {
        return new String[]{"Mã nhân viên", "Tên nhân viên", "Ngày sinh", "Địa chỉ", "Số điện thoại"};
    }

    public void readDB() {
        dsnv = qlnvDAO.readDB();
    }

    public String getNextID() {
        return "NV" + String.valueOf(this.dsnv.size() + 1);
    }

    public NhanVien getNhanVien(String manv) {
        for (NhanVien nv : dsnv) {
            if (nv.getMaNV().equals(manv)) {
                return nv;
            }
        }
        return null;
    }

    public ArrayList<NhanVien> search(String value, String type) {
        ArrayList<NhanVien> result = new ArrayList<>();

        dsnv.forEach((nv) -> {
            if (type.equals("Tất cả")) {
                if (nv.getMaNV().toLowerCase().contains(value.toLowerCase())
                        || nv.getTenNV().toLowerCase().contains(value.toLowerCase())
                        || nv.getNgaySinh().toString().toLowerCase().contains(value.toLowerCase())
                        || nv.getDiaChi().toLowerCase().contains(value.toLowerCase())
                        || nv.getSDT().toLowerCase().contains(value.toLowerCase())) {
                    result.add(nv);
                }
            } else {
                switch (type) {
                    case "Mã nhân viên":
                        if (nv.getMaNV().toLowerCase().contains(value.toLowerCase())) {
                            result.add(nv);
                        }
                        break;
                    case "Tên nhân viên":
                        if (nv.getTenNV().toLowerCase().contains(value.toLowerCase())) {
                            result.add(nv);
                        }
                        break;
                    case "Ngày sinh":
                        if (nv.getNgaySinh().toString().toLowerCase().contains(value.toLowerCase())) {
                            result.add(nv);
                        }
                        break;
                    case "Địa chỉ":
                        if (nv.getDiaChi().toLowerCase().contains(value.toLowerCase())) {
                            result.add(nv);
                        }
                        break;
                    case "Số điện thoại":
                        if (nv.getSDT().toLowerCase().contains(value.toLowerCase())) {
                            result.add(nv);
                        }
                        break;
                }
            }
        });

        return result;
    }

    public Boolean add(NhanVien nv) {
        Boolean ok = qlnvDAO.add(nv);

        if (ok) {
            dsnv.add(nv);
        }
        return ok;
    }

    public Boolean add(String manv, String tennv, LocalDate ngaysinh, String diachi, String sdt) {
        NhanVien nv = new NhanVien(manv, tennv, ngaysinh, diachi, sdt);
        return add(nv);
    }

    public Boolean delete(String manv) {
        Boolean ok = qlnvDAO.delete(manv);

        if (ok) {
            for (int i = (dsnv.size() - 1); i >= 0; i--) {
                if (dsnv.get(i).getMaNV().equals(manv)) {
                    dsnv.remove(i);
                }
            }
        }
        return ok;
    }

    public Boolean update(String manv, String tennv, LocalDate ngaysinh, String diachi, String sdt) {
        Boolean ok = qlnvDAO.update(manv, tennv, ngaysinh, diachi, sdt);

        if (ok) {
            dsnv.forEach((nv) -> {
                if (nv.getMaNV().equals(manv)) {
                    nv.setTenNV(tennv);
                    nv.setNgaySinh(ngaysinh);
                    nv.setDiaChi(diachi);
                    nv.setSDT(sdt);
                }
            });
        }

        return ok;
    }


    public ArrayList<NhanVien> getDsnv() {
        return dsnv;
    }
}
