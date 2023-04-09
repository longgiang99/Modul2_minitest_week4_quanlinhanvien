import java.util.ArrayList;

public class ListStaffAll {
    ArrayList<NhanVien> listStaff;
//   public static void main(String[] args) {
//       NhanVien fultime = new NhanVienFulltime();
//       fultime.getAddress();
//      NhanVienFulltime fultiem2 = new NhanVienFulltime();
//      fultiem2.
//   }
    public ListStaffAll() {
        listStaff = new ArrayList<>();
    }
    public void ListStaff() {
        NhanVienFulltime nvf1 = new NhanVienFulltime(101, "nguyen van a", (byte) 20, "101234", "nguyena@gmail.com", "ha noi, khuong dinh, khuong ha,123",10000,10000,100000);
        listStaff.add(nvf1);
        NhanVienFulltime nvf2 = new NhanVienFulltime(102, "nguyen van b", (byte) 24, "101235", "nguyenb@gmail.com", "ha noi, khuong dinh, khuong ha,123",20000,20000,200000);
        listStaff.add(nvf2);
        NhanVienFulltime nvf3 = new NhanVienFulltime(103, "nguyen van c", (byte) 34, "101236", "nguyenc@gmail.com", "ha noi, khuong dinh, khuong ha,123",30000,40000,300000);
        listStaff.add(nvf3);
//        NhanVienFulltime nvf4 = new NhanVienFulltime(104, "nguyen van d", (byte) 18, "101237", "nguyend@gmail.com", "ha noi, khuong dinh, khuong ha,123");
//        listStaff.add(nvf4);
//        NhanVienFulltime nvf5 = new NhanVienFulltime(105, "nguyen van e", (byte) 19, "101238", "nguyene@gmail.com", "ha noi, khuong dinh, khuong ha,123");
//        listStaff.add(nvf5);
        NhanVienParttime nv1 = new NhanVienParttime(201, "nguyen thi a", (byte) 23, "2012345", "nguyenthib@gmail.com", "ha noi, my dinh,ham nghi,123",2);
        listStaff.add(nv1);
        NhanVienParttime nv2 = new NhanVienParttime(202, "nguyen thi b", (byte) 23, "2012346", "nguyenthib@gmail.com", "ha noi, my dinh,ham nghi,123",3);
        listStaff.add(nv2);
//        NhanVienParttime nv3 = new NhanVienParttime(203, "nguyen thi c", (byte) 23, "2012347", "nguyenthic@gmail.com", "ha noi, my dinh,ham nghi,123");
//        listStaff.add(nv3);
//        NhanVienParttime nv4 = new NhanVienParttime(204, "nguyen thi d", (byte) 23, "2012348", "nguyenthid@gmail.com", "ha noi, my dinh,ham nghi,123");
//        listStaff.add(nv4);
//        NhanVienParttime nv5 = new NhanVienParttime(205, "nguyen thi e", (byte) 23, "2012349", "nguyenthie@gmail.com", "ha noi, my dinh,ham nghi,123");
//        listStaff.add(nv5);
        for (NhanVien nv : listStaff) {
            System.out.println(nv);
        }
    }
    public  double LuongTrungBinh() {
        double tongLuongToanNhanVien =0;
        for (NhanVien nhanVien : listStaff) {
            tongLuongToanNhanVien += nhanVien.NetPay();
        }
        return tongLuongToanNhanVien/listStaff.size();
    }
    public void ListSalaryStaffFullTime(){
        for (int i = 0; i < listStaff.size(); i++) {
            if(listStaff.get(i).NetPay() < LuongTrungBinh() && listStaff.get(i)instanceof NhanVienFulltime){
                System.out.println("danh sach nhan vien co luong thap hon LTB toan cong ty: "+listStaff.get(i));
            }
        }
    }
    public double SalaryAllOfParttime(){
        double sum = 0;
        for (int i = 0; i <listStaff.size() ; i++) {
            if(listStaff.get(i) instanceof NhanVienParttime){
                sum += listStaff.get(i).NetPay();
            }
        }return sum;
    }
    public void SortStaffOfFulltime(){
        ArrayList<NhanVien> newNVFT = new ArrayList<>();
        for (int i = 0; i <listStaff.size() ; i++) {
            if(listStaff.get(i) instanceof NhanVienFulltime){
                newNVFT.add(listStaff.get(i));
            }
        }
        newNVFT.sort(NhanVien::compareTo);
        System.out.println(newNVFT);
    }
//    public double luongTrungBinh() {
//        double salaryTrungBinhFt = 0;
//        double salaryTrungBinhPt = 0;
//        for (NhanVien nvft : listStaff) {
//            if (nvft instanceof NhanVienFulltime) {
//                salaryTrungBinhFt += ((NhanVienFulltime)nvft).NetPay();
//            }
//        }
//        for (NhanVien nvpt: listStaff) {
//            if (nvpt instanceof NhanVienParttime) {
//                salaryTrungBinhPt += ((NhanVienParttime) nvpt).NetPay();
//            }
//        }
//return (salaryTrungBinhFt + salaryTrungBinhPt)/listStaff.size();
//    }
}

