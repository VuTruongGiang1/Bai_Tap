package vn.edu.giadinh.tuan03;

public class NhanVien2TestDrive {
    public static void main(String[] args) {
        NhanVien2 NhanVien;

        NhanVien = new NhanVien2("TP HCM");
        System.out.println("Địa chỉ: " + NhanVien.diaChi);

        NhanVien.diaChi = "TP HCM";
    }
}
