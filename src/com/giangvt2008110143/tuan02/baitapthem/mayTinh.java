package com.giangvt2008110143.tuan02.baitapthem;

public class mayTinh {
    String nhaSanXuat = "Ajinomoto";
    String namSanXuat = "31-2-2022";
    String heDieuHanh = "Windown";
    String CPU = "intel core i9 10500";
    String namBaoHanh = "23-12-2025";

    mayTinh (String n, String s, String h, String c, String e){
        nhaSanXuat = n;
        namSanXuat = s;
        heDieuHanh = h;
        CPU = c;
        namBaoHanh = e;
    }
    int ram , gia;

    mayTinh (int r, int g){
        ram = r;
        gia = g;
    }
}
