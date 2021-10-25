package vn.edu.giadinh.tuan05;

import java.util.Scanner;

public class BaiTap12 {
    static void max(int array[]){
        int max = array[0];
        for( int i = 1; i < array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        System.out.print(max);
    }
    public static void main(String[] args) {
        int n, i;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập số phần tử của mảng: ");
        n = scanner.nextInt();

        int array[] = new int[n];
        do{
        for( i = 0; i < n; i++){
            System.out.print("Nhập phần tử thứ "+i+" : ");
            array[i] = scanner.nextInt();
        }
        }while(i>0);
        
        System.out.println("                 ");
        System.out.print("Phần tử lớn nhất là: ");
        max(array);
    }
}
