package vn.edu.giadinh.tuan03;

public class soDuTaiKhoanTestDrive {
    public static void main(String[] args) {
        soDuTaiKhoan soDuTaiKhoan;

        soDuTaiKhoan = new soDuTaiKhoan(20);
        System.out.println("Số dư tài khoản: " + soDuTaiKhoan.soDuTaiKhoan + "Tỷ");

        soDuTaiKhoan.soDuTaiKhoan = 20;
    }
}
