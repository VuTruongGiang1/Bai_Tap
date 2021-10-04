package com.giangvt2008110143.tuan01;

import java.util.Scanner;

public class Lap1Bai4 {
    public static void main(String[] args){
        int soThuNhat, soThuHai, soThuBa;
        double delta;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        soThuNhat = (int) scanner.nextDouble();
        System.out.print("Nhập số thứ hai: ");
        soThuHai = (int) scanner.nextDouble();
        System.out.print("Nhập số thứ ba: ");
        soThuBa = (int) scanner.nextDouble();

        delta = Math.pow(soThuHai, 2) - 4*soThuNhat*soThuBa;
        
        Math.sqrt(delta);
        System.out.printf("Căn của delta là: %f", delta);
    }
}
