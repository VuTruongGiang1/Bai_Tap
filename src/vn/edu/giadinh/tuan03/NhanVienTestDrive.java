package vn.edu.giadinh.tuan03;

public class NhanVienTestDrive {
    public static void main(String[] args) {
        NhanVien NhanVien;

        NhanVien = new NhanVien("Nguyễn Văn A");
        System.out.println("Tên nhân viên: " + NhanVien.tenNhanVien);

        NhanVien.tenNhanVien = "Nguyễn Văn A";
    }
}
