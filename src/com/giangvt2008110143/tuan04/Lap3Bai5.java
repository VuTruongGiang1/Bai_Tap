package com.giangvt2008110143.tuan04;

import java.util.Scanner;

public class Lap3Bai5 {
    public static void main(String[] args) {
        //tạo 1 danh sách sinh viên
        student[] studentList = new student[2];

        //nhập danh sách sinh viên từ bàn phím
        Scanner varInput = new Scanner(System.in);

        System.out.println("Nhập vào danh sách sinh viên: ");

        for(int i = 0; i < studentList.length; i++){
            System.out.println("Nhập sinh viên thứ " + (i+1));
            System.out.print("Tên sinh viên: ");
            String hoTen = varInput.nextLine();
            System.out.print("Tuổi: ");
            int tuoi = varInput.nextInt();
            varInput.nextLine();
            System.out.print("Mã số sinh viên: ");
            int MSSV = varInput.nextInt();
            System.out.print("Nhập quê quán: ");
            String queQuan = varInput.nextLine();
            varInput.nextLine();
            studentList[i] = new student();
        }

        for( student student : studentList){
            student.inThongTin();
        }
    }
}
