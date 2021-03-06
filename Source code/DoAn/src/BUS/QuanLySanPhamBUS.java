package BUS;


import DAO.*;
import DTO.*;
import java.util.ArrayList;

public class QuanLySanPhamBUS {

    private ArrayList<SanPham> dssp = new ArrayList<>();
    QuanLySanPhamDAO qlspDAO = new QuanLySanPhamDAO();

    public QuanLySanPhamBUS() {
        dssp = qlspDAO.readDB();
    }

    public void showConsole() {
        dssp.forEach((sp) -> {
            System.out.print(sp.getMaSP() + " ");
            System.out.print(sp.getMaLSP() + " ");
            System.out.println(sp.getTenSP() + " ");
            System.out.println(sp.getDonGia() + " ");
            System.out.println(sp.getSoLuong() + " ");
            System.out.println(sp.getMaTG() + " ");
            System.out.println(sp.getMaNXB());
        });
    }

    public String[] getHeaders() {
        return new String[]{"Mã sản phẩm", "Mã loại", "Tên", "Đơn giá", "Số lượng", "Mã tác giả", "Mã nhà Xuất Bản"};
    }

    public void readDB() {
        dssp = qlspDAO.readDB();
    }

    public String getNextID() {
        return "SP" + String.valueOf(this.dssp.size() + 1);
    }

    public SanPham getSanPham(String masp) {
        for (SanPham sp : dssp) {
            if (sp.getMaSP().equals(masp)) {
                return sp;
            }
        }
        return null;
    }

    public ArrayList<SanPham> search(String value, String type, int soluong1, int soluong2, float gia1, float gia2, int trangthai) {
        ArrayList<SanPham> result = new ArrayList<>();

        dssp.forEach((sp) -> {
            if (type.equals("Tất cả")) {
                if (sp.getMaSP().toLowerCase().contains(value.toLowerCase())
                        || sp.getMaLSP().toLowerCase().contains(value.toLowerCase())
                        || sp.getTenSP().toLowerCase().contains(value.toLowerCase())
                        || String.valueOf(sp.getDonGia()).toLowerCase().contains(value.toLowerCase())
                        || String.valueOf(sp.getSoLuong()).toLowerCase().contains(value.toLowerCase())
                        || sp.getMaTG().toLowerCase().contains(value.toLowerCase())
                        || sp.getMaNXB().toLowerCase().contains(value.toLowerCase())) {
                    result.add(sp);
                }
            } else {
                switch (type) {
                    case "Mã sản phẩm":
                        if (sp.getMaSP().toLowerCase().contains(value.toLowerCase())) {
                            result.add(sp);
                        }
                        break;
                    case "Mã loại":
                        if (sp.getMaLSP().toLowerCase().contains(value.toLowerCase())) {
                            result.add(sp);
                        }
                        break;
                    case "Tên":
                        if (sp.getTenSP().toLowerCase().contains(value.toLowerCase())) {
                            result.add(sp);
                        }
                        break;
                    case "Đơn giá":
                        if (String.valueOf(sp.getDonGia()).toLowerCase().contains(value.toLowerCase())) {
                            result.add(sp);
                        }
                        break;
                    case "Số lượng":
                        if (String.valueOf(sp.getSoLuong()).toLowerCase().contains(value.toLowerCase())) {
                            result.add(sp);
                        }
                        break;
                    case "Mã tác giả":
                        if (sp.getMaTG().toLowerCase().contains(value.toLowerCase())) {
                            result.add(sp);
                        }
                    
                    case "Mã nhà xuất bản":
                        if (sp.getMaNXB().toLowerCase().contains(value.toLowerCase())) {
                            result.add(sp);
                        }
                }
            }
        });

        for (int i = result.size() - 1; i >= 0; i--) {
            SanPham sp = result.get(i);
            int soluong = sp.getSoLuong();
            float gia = sp.getDonGia();
            Boolean soLuongKhongThoa = (soluong1 != -1 && soluong < soluong1) || (soluong2 != -1 && soluong > soluong2);
            Boolean giaKhongThoa = (gia1 != -1 && gia < gia1) || (gia2 != -1 && gia > gia2);

            if (soLuongKhongThoa || giaKhongThoa) {
                result.remove(i);
            }
        }

        return result;
    }

    public Boolean add(SanPham sp) {
        Boolean ok = qlspDAO.add(sp);

        if (ok) {
            dssp.add(sp);
        }
        return ok;
    }

    public Boolean add(String masp, String malsp, String tensp, float dongia, int soluong, String filename, String matg, String manxb) {
        SanPham sp = new SanPham(masp, malsp, tensp, dongia, soluong, filename, matg,manxb);
        return add(sp);
    }

    public Boolean delete(String masp) {
        Boolean ok = qlspDAO.delete(masp);

        if (ok) {
            for (int i = (dssp.size() - 1); i >= 0; i--) {
                if (dssp.get(i).getMaSP().equals(masp)) {
                    dssp.remove(i);
                }
            }
        }
        return ok;
    }

    public Boolean update(String masp, String malsp, String tensp, float dongia, int soluong, String filename, String matg, String manxb) {
        Boolean ok = qlspDAO.update(masp, malsp, tensp, dongia, soluong, filename, matg, manxb);

        if (ok) {
            dssp.forEach((sp) -> {
                if (sp.getMaSP().equals(masp)) {
                    sp.setMaLSP(malsp);
                    sp.setTenSP(tensp);
                    sp.setDonGia(dongia);
                    sp.setSoLuong(soluong);
                    sp.setFileNameHinhAnh(filename);
                    sp.setMaTG(matg);
                    sp.setMaNXB(manxb);
                }
            });
        }

        return ok;
    }

    public Boolean updateSoLuong(String masp, int soluong) {
        Boolean ok = qlspDAO.updateSoLuong(masp, soluong);

        if (ok) {
            dssp.forEach((sp) -> {
                if (sp.getMaSP().equals(masp)) {
                    sp.setSoLuong(soluong);
                }
            });
        }

        return ok;
    }


    public ArrayList<SanPham> getDssp() {
        return dssp;
    }
}
