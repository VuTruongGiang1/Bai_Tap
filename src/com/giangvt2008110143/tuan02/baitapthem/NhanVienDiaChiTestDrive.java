package com.giangvt2008110143.tuan02.baitapthem;

public class NhanVienDiaChiTestDrive {
    public static void main(String[] args) {
        NhanVienDiaChi NhanVien;

        NhanVien = new NhanVienDiaChi("TP HCM");
        System.out.println("Địa chỉ: " + NhanVien.diaChi);

        NhanVien.diaChi = "TP HCM";
    }
}
