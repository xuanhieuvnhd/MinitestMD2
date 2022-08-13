import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int soNhanVienToanThoiGian, soNhanVienThoiVu;
        Scanner scanner = new Scanner(System.in);
        NhanVien nhanVien;
        ArrayList<NhanVien> NhanViens = new ArrayList<>();

        System.out.print("Nhap so nhan vien toan thoi gian: ");
        soNhanVienToanThoiGian = scanner.nextInt();
        for (int i = 0; i < soNhanVienToanThoiGian; i++) {
            System.out.println("Nhan vien thu " + (i + 1));
            nhanVien = new NhanVienToanThoiGian();  // lúc này đối tượng nhanVien đóng vai trò là nhân viên toàn thời gian
            nhanVien.nhapThongTin();
            NhanViens.add(nhanVien);
        }

        System.out.print("Nhap so nhan vien thoi vu: ");
        soNhanVienThoiVu = scanner.nextInt();
        for (int i = 0; i < soNhanVienThoiVu; i++) {
            System.out.println("Nhan vien thu: " + (i + 1));
            nhanVien = new NhanVienThoiVu();    // còn bây giờ đối tượng nhanVien đóng vai trò là nhân viên thời vụ
            nhanVien.nhapThongTin();
            NhanViens.add(nhanVien);
        }
        System.out.println("----------------------------");
        System.out.println("THONG TIN NHAN VIEN");
        for (NhanVien nv : NhanViens) {
            nv.tinhLuong();
            System.out.println(nv.toString());
        }
    }
}
