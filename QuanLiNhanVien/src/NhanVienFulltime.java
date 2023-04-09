import java.util.ArrayList;
import java.util.Scanner;

public class NhanVienFulltime extends NhanVien {
    private int bonus;
    private int penalty;
    private int baseSalary = 10000000;
    public NhanVienFulltime() {
    }
    public NhanVienFulltime(int maNhanVien, String fullName, byte age, String phone, String email, String address) {
        super(maNhanVien, fullName, age, phone, email, address);
    }
    public NhanVienFulltime(int maNhanVien, String fullName, byte age, String phone, String email, String address, int bonus, int penalty, int baseSalary) {
        super(maNhanVien, fullName, age, phone, email, address);
        this.bonus = bonus;
        this.penalty = penalty;
        this.baseSalary = baseSalary;
    }
    public int getBonus() {
        return bonus;
    }
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    public int getPenalty() {
        return penalty;
    }
    public void setPenalty(int penalty) {
        this.penalty = penalty;
    }
    public int getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }
    @Override
    public double NetPay() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("nhap so tien thuong cua nhan vien fulltime: ");
//        int bonus = scanner.nextInt();
//        System.out.println("nhap so tien phat cua nhan vien fulltime: ");
//        int penalty = scanner.nextInt();
        return this.baseSalary + (this.bonus - this.penalty);
    }
}


