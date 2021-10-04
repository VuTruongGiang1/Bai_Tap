package com.giangvt2008110143.tuan04;

import java.util.Arrays;

public class CTMinhHoaMang {
    public static void main(String[] args) {
        //cú pháp khai báo mảng
        int[] mangSoNguyen;//chưa chỉ định số phần tử

        mangSoNguyen = new int[5];//=> mảng trong java là 1 kiểu tham chiếu đối tượng 

        double mangSoThuc[] = new double[10];

        //trước khi dùng thì phải xác định số phần tử của mảng
        mangSoNguyen[0] = 2;

        //KHAI BÁO CÓ KHỞI TẠO GIÁ TRỊ CHO MẢNG
        double diemMonHoc[] = new double[]{10.5, 5.5, 3.0, 4.5};
        System.out.println("Mảng điểm môn học: "+ Arrays.toString(diemMonHoc));
        diemMonHoc[0] = diemMonHoc[1];
        //5.5, 5.5, 3.0, 4.5

        System.out.println("Mảng điểm môn học: "+ Arrays.toString(diemMonHoc));

        System.out.println("Số phần tử của mảng điểm môn học: " + diemMonHoc.length);


        //CÁCH 2
        String dsTenSinhVien[] = {"Tèo", "Tý", "Tửng"};

        //dùng vòng lặp để duyệt mảng
        System.out.println("===========DUYỆT MẢNG-------------");

        for (int i=0; i < diemMonHoc.length; i++){
            System.out.println(diemMonHoc[i]);
        }

        System.out.println("===========FOR EACH--------------");
        //FOR-EACH
        for(double diem : diemMonHoc){
            System.out.println(diem);
        }

        //mảng có kiểu dữ liệu tham chiếu đối tượng 
        Dog[] danhSachDog = new Dog[7];

        Dog dog0 = new Dog(10, "Đen", "lili");
        Dog dog1 = new Dog(5, "Trắng", "lulu");
        Dog dog2 = new Dog(6, "Hồng", "sisi");
        Dog dog3 = new Dog(8, "Tím", "mun");
        Dog dog4 = new Dog(7, "Đỏ", "mèo");
        Dog dog5 = new Dog(9, "Vàng", "kayn");
        Dog dog6 = new Dog(15, "Xanh", "kata");
        
        danhSachDog[0] = dog0;
        danhSachDog[1] = dog1;
        danhSachDog[2] = dog2;
        danhSachDog[3] = dog3;
        danhSachDog[4] = dog4;
        danhSachDog[5] = dog5;
        danhSachDog[6] = dog6;

        for(Dog dog : danhSachDog){
            dog.inThongTin();
        }
        //danhSachDog[0].inThongTin();
        //danhSachDog[1].inThongTin();
        //danhSachDog[2].inThongTin();
        //danhSachDog[3].inThongTin();
        //danhSachDog[4].inThongTin();
        //danhSachDog[5].inThongTin();
        //danhSachDog[6].inThongTin();


    }
    
}
