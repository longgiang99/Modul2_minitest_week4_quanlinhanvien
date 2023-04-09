import java.util.Scanner;
public class NhanVienParttime extends NhanVien{
    private int partTimeHours;
    public NhanVienParttime(int maNhanVien, String fullName, byte age, String phone, String email, String address) {
        super(maNhanVien, fullName, age, phone, email, address);
    }
    public NhanVienParttime(int maNhanVien, String fullName, byte age, String phone, String email, String address, int partTimeHours) {
        super(maNhanVien, fullName, age, phone, email, address);
        this.partTimeHours = partTimeHours;
    }
    public int getPartTimeHours() {
        return partTimeHours;
    }
    public void setPartTimeHours(int partTimeHours) {
        this.partTimeHours = partTimeHours;
    }
@Override
    public  double NetPay(){
//        System.out.println("nhap so gio lam viec cua nhan vien parttime");
//
//        Scanner scanner = new Scanner(System.in);
//
//        int timeWOrk = scanner.nextInt();
        return this.partTimeHours * 100000;
    }
}
