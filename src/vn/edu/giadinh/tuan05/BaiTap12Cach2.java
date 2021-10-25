package vn.edu.giadinh.tuan05;

import java.util.Scanner;

public class BaiTap12Cach2 {
    public static void main(String[] args) {
        int n, max;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng: ");
        n = scanner.nextInt();

        int array[] = new int[n];
        for (int i = 0; i < n; i++){
            System.out.print("Nhập phần tử thứ "+i+" : ");
            array[i] = scanner.nextInt();
        }

        System.out.println("                      ");
        max = array[0];
        for (int i= 0; i < n; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.printf("Phần tử lớn nhất là: " + max);
    }
}
