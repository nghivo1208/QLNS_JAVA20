package DAO;

import model.NhanVienThuong;
import model.TruongPhong;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

public class TruongPhongDAO implements DAO<TruongPhong> {
    List<TruongPhong> listOfTruongPhong = new ArrayList<>();

    @Override
    public List<TruongPhong> getAll() {
        return listOfTruongPhong;
    }

    @Override
    public Optional<TruongPhong> get(int maSo) {
        return listOfTruongPhong.stream()
                .filter(truongPhong -> truongPhong.getMaSo() == maSo)
                .findFirst();
    }

    @Override
    public void save(TruongPhong truongPhong) {
        listOfTruongPhong.add(truongPhong);
    }

    @Override
    public void update(TruongPhong truongPhong) {
        get(truongPhong.getMaSo()).ifPresent(existTruongPhong -> {
            existTruongPhong.setMaSo(truongPhong.getMaSo());
            existTruongPhong.setHoTen(truongPhong.getHoTen());
            existTruongPhong.setSoDienThoai(truongPhong.getSoDienThoai());
            existTruongPhong.setSoNgayLam(truongPhong.getSoNgayLam());
            existTruongPhong.setListOfNhanVienThuong(truongPhong.getListOfNhanVienThuong());
        });
    }

    @Override
    public void delete(TruongPhong truongPhong) {
        get(truongPhong.getMaSo()).ifPresent(existTruongPhong ->
                listOfTruongPhong.remove(existTruongPhong));
    }

//    public AtomicInteger soNhanVienDuoiQuyen(int maSo){
//        AtomicInteger soNhanVien = new AtomicInteger();
//        get(maSo).ifPresent(exist-> {
//            for (NhanVienThuong nv: exist.getListOfNhanVienThuong()){
//                soNhanVien.getAndIncrement();
//            }
//        });
//        return soNhanVien;
//    }

    public void themNhanVienDuoiQuyen() {
        
    }

}
