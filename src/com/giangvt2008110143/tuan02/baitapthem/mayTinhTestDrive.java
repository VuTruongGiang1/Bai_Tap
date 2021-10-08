package com.giangvt2008110143.tuan02.baitapthem;

public class mayTinhTestDrive {
    public static void main(String[] args) {
        mayTinh mayTinh;

        mayTinh = new mayTinh("Ajinomoto", null, null, null, null);
        System.out.println("Nhà sản xuất: " + mayTinh.nhaSanXuat);

        mayTinh.nhaSanXuat = "Ajinomoto";

        mayTinh = new mayTinh(null, "31-2-2022", null, null, null);
        System.out.println("Năm sản xuất: " + mayTinh.namSanXuat);

        mayTinh.namSanXuat = "31-2-2022";

        mayTinh = new mayTinh(null, null, "Windown", null, null);
        System.out.println("Hệ điều hành: " + mayTinh.heDieuHanh);

        mayTinh.heDieuHanh = "Windown";

        mayTinh = new mayTinh(32, 0);
        System.out.println("Ram: " + mayTinh.ram + "GB");

        mayTinh.ram = 32;

        mayTinh = new mayTinh(null, null, null, "intel core i9 10500", null);
        System.out.println("CPU: " + mayTinh.CPU);

        mayTinh.CPU = "intel core i9 10500";

        mayTinh = new mayTinh(0, 22);
        System.out.println("Giá: " + mayTinh.gia + "Tr");

        mayTinh.gia = 22;

        mayTinh = new mayTinh(null, null, null, null, "23-12-2025");
        System.out.println("Năm bảo hành: " + mayTinh.namBaoHanh);

        mayTinh.namBaoHanh = "23-12-2025";
    }
}
