package vn.edu.giadinh.tuan03;

public class sach5TestDrive {
    public static void main(String[] args) {
        sach5 sach;

        sach = new sach5("A");
        System.out.println("loại: " + sach.loai);

        sach.loai = "A";
    }
}
