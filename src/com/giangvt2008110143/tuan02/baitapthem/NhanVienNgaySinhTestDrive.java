package com.giangvt2008110143.tuan02.baitapthem;

public class NhanVienNgaySinhTestDrive {
    public static void main(String[] args) {
        NhanVienNgaySinh NhanVien;

        NhanVien = new NhanVienNgaySinh("26-9-2021");
        System.out.println("Ngày sinh: " + NhanVien.ngaySinh);

        NhanVien.ngaySinh = "26-9-2021";
    }
}
