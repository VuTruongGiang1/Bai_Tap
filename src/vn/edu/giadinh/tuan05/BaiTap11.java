package vn.edu.giadinh.tuan05;

import java.util.Scanner;

public class BaiTap11 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số phần tử của mảng: ");
        n = scanner.nextInt();
        int array[] = new int[n];
        for( int i = 0; i < n; i++){
            System.out.print("Nhập phần tử thứ " + i + " : ");
                array[i] = scanner.nextInt();
        }

        System.out.println("                     ");
        System.out.println("Các phần tử đã nhập");
        for( int mang: array){
            System.out.println(mang);
        }

        double tong = 0;
        for( int i = 0; i < array.length; i++){
            tong = tong + array[i];
        }
        double trungBinh = tong / array.length;
        System.out.printf("Trung bình của mảng là: %.3f", trungBinh);
    }
}
