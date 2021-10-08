package com.giangvt2008110143.tuan02.baitapthem;

public class sachTestDrive {
    public static void main(String[] args) {
        sach sach;

        sach = new sach(200000, 0, 0, 0);
        System.out.println("gia: " + sach.gia);

        sach.gia = 200000;

        sach = new sach("alizabeo", null);
        System.out.println("nhà xuất bản: " + sach.nhaXuatBan);

        sach.nhaXuatBan = "alizabeo";

        sach = new sach(0, 2021, 0, 0);
        System.out.println("năm xuất bản: " + sach.namXuatBan);

        sach.namXuatBan = 2021;

        sach = new sach(0, 0, 200000, 0);
        System.out.println("giá bán: " + sach.giaBan +"đ");

        sach.giaBan = 200000;

        sach = new sach(0, 0, 0, 2);
        System.out.println("số lượng: " + sach.soLuong);

        sach.soLuong = 2;

        sach = new sach("A");
        System.out.println("loại: " + sach.loai);

        sach.loai = "A";
    }
}
