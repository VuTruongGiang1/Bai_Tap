package vn.edu.giadinh.tuan02;

import java.util.Scanner;

public class Lap2Bai3 {
    public static void main(String[] args){
        int soDienSuDungCuaThang, tien;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số điện sử dụng trong một tháng: ");
        soDienSuDungCuaThang = (int) scanner.nextDouble();

        if (soDienSuDungCuaThang < 50){
            tien = soDienSuDungCuaThang*1000;
            System.out.printf("Số tiền phải trả là: %d đ", (int)tien);
        }
        else
        if (soDienSuDungCuaThang > 50){
            tien = 50*1000 + (soDienSuDungCuaThang - 50)*1200; 
            System.out.printf("Số tiền phải trả là: %d đ", (int)tien);
        }
    }
    
}
