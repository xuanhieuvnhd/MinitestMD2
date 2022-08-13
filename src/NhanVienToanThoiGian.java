public class NhanVienToanThoiGian extends NhanVien{
    private int soNgayLamThem, choose;
    private String loaiNhanVien;
    private static float LUONG_NHAN_VIEN_LA_SEP = 30000000;
    private static float LUONG_NHAN_VIEN_BINH_THUONG = 10000000;
    private static float LUONG_LAM_THEM = 500000;

    public NhanVienToanThoiGian() {
        super();
    }

    public NhanVienToanThoiGian(int soNgayLamThem, String loaiNhanVien) {
        this.soNgayLamThem = soNgayLamThem;
        this.loaiNhanVien = loaiNhanVien;
    }

    public int getSoNgayLamThem() {
        return soNgayLamThem;
    }

    public void setSoNgayLamThem(int soNgayLamThem) {
        this.soNgayLamThem = soNgayLamThem;
    }

    public String getLoaiNhanVien() {
        return loaiNhanVien;
    }

    public void setLoaiNhanVien(String loaiNhanVien) {
        this.loaiNhanVien = loaiNhanVien;
    }
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.print("So ngay lam them: ");
        soNgayLamThem = scanner.nextInt();
        System.out.print("Loai nhan vien (1 - binh thuong, 2 - sep): ");
        choose = scanner.nextInt();
        switch (choose) {
            case 1 -> loaiNhanVien = "Nhan vien binh thuong";
            case 2 -> loaiNhanVien = "Sep";
            default -> System.out.println("Chon loai nhan vien khong dung!");
        }
    }

    @Override
    public void tinhLuong() {
        if (loaiNhanVien.equals("Nhan vien binh thuong")) {
            luong = LUONG_NHAN_VIEN_BINH_THUONG + this.soNgayLamThem * LUONG_LAM_THEM;
        } else if (loaiNhanVien.equals("Sep")) {
            luong = LUONG_NHAN_VIEN_LA_SEP + this.soNgayLamThem * LUONG_LAM_THEM;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Loai nhan vien: " + this.loaiNhanVien +
                ", So ngay lam them: " + this.soNgayLamThem;
    }
}
