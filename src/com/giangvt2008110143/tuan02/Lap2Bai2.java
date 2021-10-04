package com.giangvt2008110143.tuan02;

import java.util.Scanner;

public class Lap2Bai2 {
    public static void main(String[] args){
        int a, b, c, x;
        double delta;
        int x1, x2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập hệ số a: ");
        a = (int) scanner.nextDouble();
        System.out.println("Nhập hệ số b: ");
        b = (int) scanner.nextDouble();
        System.out.println("Nhập hệ số c: ");
        c = (int) scanner.nextDouble();

        //if (a==0){
            //if (b==0)
                System.out.println("Phương trình vô nghiệm!!!");
            //else
                x = -b/a;
                //System.out.printf("Phương trình có nghiệm duy nhất: %f", x);}
        if (a!=0)
            delta = Math.pow(b, 2) - 4*a*c;

        //if (delta < 0){
        //    System.out.println("Phương trình vô nghiệm!!!");}
       // else 
       // if (delta == 0){
              //  x = -b/(2*a);
           // System.out.printf("Phương trình có nghiệm kép: %.3f", x);}
        //else 
        //if (delta > 0){
               // x1 = (int) (-b + Math.sqrt(delta))/(2*a);
               // x2 = (int) (-b - Math.sqrt(delta))/(2*a);
          //  System.out.printf("Phương trình có hai nghiệm phân biệt: %.3f, %.3f", x1, x2);}
    }
}
