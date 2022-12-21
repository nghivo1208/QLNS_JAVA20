package DAO;

import model.NhanVienThuong;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class NhanVienThuongDAO implements DAO<NhanVienThuong> {
    List<NhanVienThuong> listOfNhanVienThuong = new ArrayList<>();

    @Override
    public List<NhanVienThuong> getAll() {
        return listOfNhanVienThuong;
    }

    @Override
    public Optional<NhanVienThuong> get(int maSo) {
        return listOfNhanVienThuong.stream()
                .filter(nhanVienThuong -> nhanVienThuong.getMaSo() == maSo)
                .findFirst();
    }

    @Override
    public void save(NhanVienThuong nhanVienThuong) {
        listOfNhanVienThuong.add(nhanVienThuong);
    }

    @Override
    public void update(NhanVienThuong nhanVienThuong) {
        get(nhanVienThuong.getMaSo()).ifPresent(existNv -> {
            existNv.setMaSo(nhanVienThuong.getMaSo());
            existNv.setHoTen(nhanVienThuong.getHoTen());
            existNv.setSoDienThoai(nhanVienThuong.getSoDienThoai());
            existNv.setSoNgayLam(nhanVienThuong.getSoNgayLam());
            existNv.setTruongPhong(nhanVienThuong.getTruongPhong());
        });
    }

    @Override
    public void delete(NhanVienThuong nhanVienThuong) {
        get(nhanVienThuong.getMaSo()).ifPresent(existNv ->
                listOfNhanVienThuong.remove(existNv));
    }

}
