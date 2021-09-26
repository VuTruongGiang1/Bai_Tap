package vn.edu.giadinh.tuan03;

public class sach4TestDrive {
    public static void main(String[] args) {
        sach4 sach;

        sach = new sach4(2);
        System.out.println("số lượng: " + sach.soLuong);

        sach.soLuong = 2;
    }
}
