package vn.edu.giadinh.tuan05;

import java.util.Scanner;

public class BaiTap13Cach2 {
    public static void main(String[] args) {
        int n, min;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng: ");
        n = scanner.nextInt();

        int array[] = new int[n];
        for (int i = 0; i < n; i++){
            System.out.print("Nhập phần tử thứ "+i+" : ");
            array[i] = scanner.nextInt();
        }

        System.out.println("                 ");
        min = array[0];
        for (int i = 0; i < n; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.print("Phần tử nhỏ nhất là: " + min);
    }
}
