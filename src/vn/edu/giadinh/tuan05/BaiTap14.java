package vn.edu.giadinh.tuan05;

import java.util.Scanner;

public class BaiTap14 {
    public static void main(String[] args) {
        int n, i, j, temp;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập số phần tử của mảng: ");
        n = scanner.nextInt();

        int array[] = new int[n];
        for (i = 0; i < n; i++){
            System.out.print("Nhập phần tử thứ "+i+" : ");
            array[i] = scanner.nextInt();
        }

        System.out.println("                ");
        System.out.println("Các phần tử đã nhập: ");
        for (int mang: array){
            System.out.println(mang);
        }

        j = i - 1;
        i = 0;
        scanner.close();
        while(i<j)
        {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        System.out.println("Mảng sau khi sắp xếp là: ");
        for (int mangSapXep: array){
            System.out.println(mangSapXep);
        }
    }
}
