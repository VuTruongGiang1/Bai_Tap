package com.giangvt2008110143.tuan02.baitapthem;

public class taiKhoanTestDrive {
    public static void main(String[] args) {
        taiKhoan taiKhoan;

        taiKhoan = new taiKhoan("Trần Đức Bo");
        System.out.println("Tên chủ tài khoản: " + taiKhoan.tenChuTaiKhoan);

        taiKhoan.tenChuTaiKhoan = "Trần Đức Bo";

        taiKhoan = new taiKhoan(2020220212, 0);
        System.out.println("số tài khoản: " + taiKhoan.soTaiKhoan);

        taiKhoan.soTaiKhoan = 2020220212;

        taiKhoan = new taiKhoan(0, 20);
        System.out.println("Số dư tài khoản: " + taiKhoan.soDuTaiKhoan + " " + "Tỷ" );

        taiKhoan.soDuTaiKhoan = 20;
    }
}
