import java.util.ArrayList;

public abstract class NhanVien implements Comparable {
private int maNhanVien;
private String fullName;
private byte age;
private String phone;
private String email;
private String address;
    public NhanVien() {
    }
    public NhanVien(int maNhanVien, String fullName, byte age, String phone, String email, String address) {
        this.maNhanVien = maNhanVien;
        this.fullName = fullName;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public int getMaNhanVien() {
        return maNhanVien;
    }
    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public byte getAge() {
        return age;
    }
    public void setAge(byte age) {
        this.age = age;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAddress() {
        return address;
    }
//    public String getTinh(){
//        String[] part = address.split(",");
//        return part[0].trim();
//    }
//    public String getHuyen(){
//        String[] part = getAddress().split(",");
//        return part[1].trim();
//    }
//    public String getxa(){
//        String[] part = getAddress().split(",");
//        return part[2].trim();
//    }
//    public String getSoNha(){
//        String[] part = getAddress().split(",");
//        return part[3].trim();
//    }
    public void setAddress(String address) {
        this.address = address;
    }
     abstract double NetPay();

    @Override
    public int compareTo(Object o) {
        return (int) (NetPay()- ((NhanVien)o).NetPay());
    }

    public String   toString() {
        return "NhanVien{" +
                "maNhanVien=" + maNhanVien +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}' + "\n";
    }
}



