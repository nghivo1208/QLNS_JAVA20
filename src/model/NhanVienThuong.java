package model;

import DAO.TruongPhongDAO;

public class NhanVienThuong extends NhanVien{
    private TruongPhong truongPhong;

    public NhanVienThuong(int maSo, String hoTen, int soDienThoai, int soNgayLam, TruongPhong truongPhong) {
        super(maSo, hoTen, soDienThoai, soNgayLam);
        this.truongPhong = truongPhong;
    }

    public TruongPhong getTruongPhong() {
        return truongPhong;
    }

    public void setTruongPhong(TruongPhong truongPhong) {
        this.truongPhong = truongPhong;
    }

    @Override
    public int cachTinhLuong() {
        return 100* this.getSoNgayLam();
    }
}
