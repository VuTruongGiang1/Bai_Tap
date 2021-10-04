package com.giangvt2008110143.tuan03;

import java.util.Scanner;

public class Lap3Bai4 {
    public static void main(String[] args) {
        int diem, n, soHocSinh;

        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Nhập vào số học sinh: ");
            n = scanner.nextInt();
        }while (n < 0);

        char hoTen, hocLuc;
            System.out.println("Nhập vào tên và điểm của học sinh: ");
        for (hoTen = 20; hoTen < n; hoTen++){
            System.out.printf("Nhập vào tên của học sinh thứ : ", hoTen);
                hoTen = (char) scanner.nextInt();
        }
    }
}
