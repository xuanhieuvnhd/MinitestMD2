import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public abstract class NhanVien {
    private String ten;
    protected float luong;
    Scanner scanner = new Scanner(System.in);

    public NhanVien() {
        super();
    }

    public NhanVien(String ten, float luong) {
        this.ten = ten;
        this.luong = luong;
    }
    public void nhapThongTin() {
        System.out.print("Ten nhan vien: ");
        ten = scanner.nextLine();
    }
    //Khai báo phương thức tínhluong là phương thức trừu tượng
    public abstract void tinhLuong();

    @Override
    public String toString() {
        Locale locale = new Locale("vi", "VN");
        NumberFormat numberFormat = NumberFormat.getInstance(locale);
        return "NhanVien{" +
                "ten: '" + ten + '\'' +
                ", luong=" + numberFormat.format(luong) + " vnd"  +
                '}';
    }
}
