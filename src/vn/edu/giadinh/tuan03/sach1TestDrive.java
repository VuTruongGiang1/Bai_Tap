package vn.edu.giadinh.tuan03;

public class sach1TestDrive {
    public static void main(String[] args) {
        sach1 sach;

        sach = new sach1("alizabeo");
        System.out.println("nhà xuất bản: " + sach.nhaXuatBan);

        sach.nhaXuatBan = "alizabeo";
    }
    
}
