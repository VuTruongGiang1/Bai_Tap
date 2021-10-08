package com.giangvt2008110143.tuan02.baitapthem;

public class xe {
    String tenChuXe = "Bạch Tuyết và 7 chú lùn";
    String hangSanXuat = "Yamaha";
    String dong = "Moto";
    String giayPhep = "A2";

    xe (String e, String y, String d, String g){
        tenChuXe = e;
        hangSanXuat = y;
        dong = d;
        giayPhep = g;
    }
    int dungTichXang;

    xe (int t){
        dungTichXang = t;
    }
}
