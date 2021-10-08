package com.giangvt2008110143.tuan02.baitapthem;

public class NhanVienTestDrive {
    public static void main(String[] args) {
        NhanVien NhanVien;

        NhanVien = new NhanVien("Nguyễn Văn A");
        System.out.println("Tên nhân viên: " + NhanVien.tenNhanVien);

        NhanVien.tenNhanVien = "Nguyễn Văn A";

        NhanVien = new NhanVien(20000);
        System.out.println("Lương: " + NhanVien.luong +"đ");

        NhanVien.luong = 20000;
    }
}
