package model;

import java.util.List;

public class TruongPhong extends NhanVien {
    List<NhanVienThuong> listOfNhanVienThuong;

    public TruongPhong(int maSo, String hoTen, int soDienThoai, int soNgayLam) {
        super(maSo, hoTen, soDienThoai, soNgayLam);
    }

    public TruongPhong(List<NhanVienThuong> listOfNhanVienThuong) {
        this.listOfNhanVienThuong = listOfNhanVienThuong;
    }

    public List<NhanVienThuong> getListOfNhanVienThuong() {
        return listOfNhanVienThuong;
    }

    public void setListOfNhanVienThuong(List<NhanVienThuong> listOfNhanVienThuong) {
        this.listOfNhanVienThuong = listOfNhanVienThuong;
    }

    @Override
    public int cachTinhLuong() {
        return 200 * this.getSoNgayLam() + 100 *tongSoNhanVien();
    }

    public int tongSoNhanVien(){
        int soNhanVien = 0;
        for (NhanVienThuong nv: this.listOfNhanVienThuong){
            soNhanVien++;
        }
        return soNhanVien;
    }
}
