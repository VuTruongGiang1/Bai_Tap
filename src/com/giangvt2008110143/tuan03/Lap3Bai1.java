package com.giangvt2008110143.tuan03;

import java.util.Scanner;

public class Lap3Bai1 {
    public static void main(String[] args) {
        int i, N;
        boolean ok = true;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào 1 số: ");
        N = scanner.nextInt();

        for(i = 2; i< N-1; i++){
            if(N % i== 0){
                ok = false;
                System.out.printf("Số %d không phải là số nguyên tố",i);
                break;
            }i++;
            System.out.printf(" Số %d là số nguyên tố", i);
        }
    }
}
