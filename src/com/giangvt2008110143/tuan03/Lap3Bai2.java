package com.giangvt2008110143.tuan03;

public class Lap3Bai2 {
    public static void main(String[] args) {
        int i, j;

        for(i = 2; i < 10; i++){
            for(j = 1; j <= 10; j++){
                System.out.printf("%d x %d = %d ", i, j, i*j);
                System.out.println();
            }
            System.out.println("           ");
        }
    }
}
