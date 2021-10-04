package com.giangvt2008110143.tuan02;

import java.util.Scanner;

public class Lap2Bai1 {
    public static void main(String[] args){
        int a, b;
        float x;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập hệ số a: ");
        a = scanner.nextInt();
        System.out.print("Nhập hệ số b: ");
        b = scanner.nextInt();

        if (a==0)
            if(b==0)
                System.out.print("Phương trình vô số nghiệm! ");
            else
                System.out.print("Phương trình vô nghiệm!!! ");
        else        
        if (a!=0){
            x = -b/a ;
        System.out.printf("Nghiệm x là: %f", x );}
    }
}
