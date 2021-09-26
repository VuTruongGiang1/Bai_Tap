package vn.edu.giadinh.tuan03;

public class taiKhoanTestDrive {
    public static void main(String[] args) {
        taiKhoan taiKhoan;

        taiKhoan = new taiKhoan("Trần Đức Bo");
        System.out.println("Tên chủ tài khoản: " + taiKhoan.tenChuTaiKhoan);

        taiKhoan.tenChuTaiKhoan = "Trần Đức Bo";
    }
}
