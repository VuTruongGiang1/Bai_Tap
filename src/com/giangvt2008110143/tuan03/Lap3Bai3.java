package com.giangvt2008110143.tuan03;

import java.util.Scanner;

public class Lap3Bai3 {
    public static void main(String[] args) {
        int n, min, j, i;

        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        }while (n < 0);

        int array[] = new int[n];
            System.out.println("Nhập các phần tử của mảng: ");
        for (i = 0; i < n; i++){
            System.out.printf("Nhập vào số phần tử thứ %d: ", i);
                array[i] = scanner.nextInt();
        }

            System.out.println("Các phần tử của mảng: ");
        for (i = 0; i < n; i++){
            System.out.println(array[i] + "    ");
        }

        for (i = 0; i < n - 1; i++){
            for (j = i + 1; j <= n - 1; j++){
                if (array[i] < array[j]){
                    min = array[i];
                    array[i] = array[j];
                    array[j] = min;
                }
            }
        }

            System.out.println("Mảng sau khi sắp xếp là: ");
        for (i = 0; i < n; i++){
            System.out.print(array[i] + "   ");
        }

            System.out.println("          ");
            System.out.printf("Phần tử nhỏ nhất trong mảng là: " + array[n-1]);
            double total = 0;
        for(i=0; array[i] % 3==0; i++){
            total = array[i] + total;
        }
            System.out.println("          ");
                double average;
                average = total/i;
            System.out.printf("Trung bình cộng các phần tử chia hết cho 3: %.3f", average);

    }
}
