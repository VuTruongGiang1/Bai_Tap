package vn.edu.giadinh.tuan03;

public class NhanVien4TestDrive {
    public static void main(String[] args) {
        NhanVien4 NhanVien;

        NhanVien = new NhanVien4("26-9-2021");
        System.out.println("Ngày sinh: " + NhanVien.ngaySinh);

        NhanVien.ngaySinh = "26-9-2021";
    }
}
