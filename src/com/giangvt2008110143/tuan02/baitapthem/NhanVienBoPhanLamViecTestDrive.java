package com.giangvt2008110143.tuan02.baitapthem;

public class NhanVienBoPhanLamViecTestDrive {
    public static void main(String[] args) {
        NhanVienBoPhanLamViec NhanVien;

        NhanVien = new NhanVienBoPhanLamViec("May");
        System.out.println("Bộ phận làm việc: " + NhanVien.boPhanLamViec);

        NhanVien.boPhanLamViec = "May";
    }
}
