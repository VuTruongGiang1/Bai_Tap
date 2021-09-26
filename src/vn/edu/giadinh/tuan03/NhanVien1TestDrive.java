package vn.edu.giadinh.tuan03;

public class NhanVien1TestDrive {
    public static void main(String[] args) {
        NhanVien1 NhanVien;

        NhanVien = new NhanVien1(20000);
        System.out.println("Lương: " + NhanVien.luong +"đ");

        NhanVien.luong = 20000;
    }
}
