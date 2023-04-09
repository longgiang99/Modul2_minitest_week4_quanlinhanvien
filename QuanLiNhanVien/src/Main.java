public class Main {
    public static void main(String[] args) {
ListStaffAll listStaffAll = new ListStaffAll();
listStaffAll.ListStaff();
        System.out.println("tien luong trung binh cua nhan vien cong ty la: " + listStaffAll.LuongTrungBinh());
        listStaffAll.ListSalaryStaffFullTime();
        System.out.println(listStaffAll.SalaryAllOfParttime());
        listStaffAll.SortStaffOfFulltime();
    }

}
