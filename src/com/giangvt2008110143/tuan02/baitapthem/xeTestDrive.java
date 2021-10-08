package com.giangvt2008110143.tuan02.baitapthem;

public class xeTestDrive {
    public static void main(String[] args) {
        xe xe;

        xe = new xe("Bạch Tuyết và 7 chú lùn", null, null, null);
        System.out.println("Tên chủ xe: " + xe.tenChuXe);

        xe.tenChuXe = "Bạch Tuyết và 7 chú lùn";

        xe = new xe( null,"Yamaha", null, null);
        System.out.println("Hãng sản xuất: " + xe.hangSanXuat);

        xe.hangSanXuat = "Yamaha";

        xe = new xe( null, null,"Moto", null);
        System.out.println("Dòng xe: " + xe.dong);

        xe.dong = "Moto";

        xe = new xe( null, null, null, "A2");
        System.out.println("Giấy phép lái xe loại: " + xe.giayPhep);

        xe.giayPhep = "A2";

        xe = new xe(1000);
        System.out.println("Dung tích xăng: " + xe.dungTichXang +"ml");

        xe.dungTichXang = 1000;
    }
}
