package vn.edu.giadinh.tuan05;

import java.util.Scanner;

public class BaiTap13 {
    static void min(int array[]){
        int min = array[0];
        for( int i = 1; i < array.length; i++){
            if(min > array[i]){
                min = array[i];
            }
        }
        System.out.print(min);
    }
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng: ");
        n = scanner.nextInt();

        int array[] = new int[n];
        for( int i = 0; i < n; i++){
            System.out.print("Nhập phần tử thứ "+i+" : ");
            array[i] = scanner.nextInt();
        }

        System.out.println("                   ");
        System.out.print("Phần tử nhỏ nhất là: ");
        min(array);
    }
}
