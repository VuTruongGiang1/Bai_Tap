package vn.edu.giadinh.tuan03;

public class sach2TestDrive {
    public static void main(String[] args) {
        sach2 sach;

        sach = new sach2(2021);
        System.out.println("năm xuất bản: " + sach.namXuatBan);

        sach.namXuatBan = 2021;
    }
}
