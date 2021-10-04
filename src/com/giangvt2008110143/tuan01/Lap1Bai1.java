package com.giangvt2008110143.tuan01;

import java.util.Scanner;

public class Lap1Bai1 {
    public static void main(String[] args){
        String hoTenSinhVien;
        Double diemTB;
    Scanner scanner = new Scanner(System.in);
        System.out.print("Họ và Tên: ");
    hoTenSinhVien = scanner.nextLine();
        System.out.print("Điểm TB: ");
    diemTB = scanner.nextDouble();
        System.out.printf("%s %d điểm", hoTenSinhVien, diemTB);

    }
}
