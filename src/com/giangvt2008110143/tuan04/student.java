package com.giangvt2008110143.tuan04;

public class student {

    int tuoi, MSSV;
    String hoTen, queQuan;

    public student() {}

    student(int t, int m, String h, String q){
        tuoi = t;
        MSSV = m;
        hoTen = h;
        queQuan = q;
    }

    void inThongTin(){
        System.out.println("Họ và Tên: "+ hoTen +" "+ "Tuổi: "+ tuoi  +" " + "Mã số sinh viên: "+ MSSV +" "+ "Quê quán: "+ queQuan);
    }

}
