package vn.edu.giadinh.tuan03;

public class soTaiKhoanTestDrive {
    public static void main(String[] args) {
        soTaiKhoan soTaiKhoan;

        soTaiKhoan = new soTaiKhoan(2020220212);
        System.out.println("số tài khoản: " + soTaiKhoan.soTaiKhoan);

        soTaiKhoan.soTaiKhoan = 2020220212;
    }
}
