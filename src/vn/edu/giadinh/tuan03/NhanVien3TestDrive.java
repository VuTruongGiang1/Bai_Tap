package vn.edu.giadinh.tuan03;

public class NhanVien3TestDrive {
    public static void main(String[] args) {
        NhanVien3 NhanVien;

        NhanVien = new NhanVien3("May");
        System.out.println("Bộ phận làm việc: " + NhanVien.boPhanLamViec);

        NhanVien.boPhanLamViec = "May";
    }
}
