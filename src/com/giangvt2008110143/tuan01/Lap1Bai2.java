package com.giangvt2008110143.tuan01;

import java.util.Scanner;

public class Lap1Bai2 {
    public static void main(String[] args){
        double chieuDai, chieuRong, chuVi, dienTich, canhNhoNhat;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài hình chữ nhật: ");
        chieuDai = scanner.nextDouble();
        System.out.print("Nhập chiều rộng hình chữ nhật: ");
        chieuRong = scanner.nextDouble();

        chuVi = (chieuDai + chieuRong)*2;
        System.out.printf("Chu vi hình chữ nhật là: %d", chuVi);

        dienTich = chieuDai*chieuRong;
        System.out.printf("Diện tích của hình chữ nhật là: %d", dienTich);

        canhNhoNhat = Math.min(chieuDai, chieuRong);
        System.out.printf("Cạnh nhỏ nhất của hình chủ nhật là: %d", canhNhoNhat);


    }
}
