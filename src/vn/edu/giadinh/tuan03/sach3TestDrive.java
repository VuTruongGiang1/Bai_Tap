package vn.edu.giadinh.tuan03;

public class sach3TestDrive {
    public static void main(String[] args) {
        sach3 sach;

        sach = new sach3(200000);
        System.out.println("giá bán: " + sach.giaBan +"đ");

        sach.giaBan = 200000;
    }
    
}
