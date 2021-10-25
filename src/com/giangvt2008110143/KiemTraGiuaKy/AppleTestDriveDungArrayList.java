package com.giangvt2008110143.KiemTraGiuaKy;

import java.util.ArrayList;
import java.util.Scanner;

public class AppleTestDriveDungArrayList {
    static ArrayList<Apple> list = new ArrayList<Apple>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int chucNang;

        do{
            System.out.println("+--------------------MENU--------------------+");
            System.out.println("1. Nhập thêm táo vào kho");
            System.out.println("2. Tìm táo theo màu và xuất ra màn hình");
            System.out.println("3. In danh sách táo");
            System.out.println("4. Kết thúc");
            System.out.println("+--------------------MENU--------------------+");
            System.out.print("Chọn 1 chức năng: ");
            chucNang = scanner.nextInt();
    
        switch(chucNang){
            case 1: nhap(); break;
            case 2: tim(); break;
            case 3: inDanhSach(); break;
            case 4: System.out.println("Kết thúc!!!"); break;
            }
        }while(chucNang >= 1 && chucNang <= 3);
    }

    static void nhap(){
        while(true){
            Apple apple = new Apple();
            apple.nhap();
            scanner.nextLine();
            list.add(apple);

            System.out.print("Nhập thêm (Y/N)?"); 
            if(scanner.nextLine().equals("N")){ 
                break; 
            } 
        }
    }

    static void tim(){
        System.out.print("nhập màu táo muốn tìm: ");
       for(Apple apple : list){
           if(scanner.nextLine().equals(apple.mau)){
               apple.inThongTin();
           }
       }
    }

    static void inDanhSach(){
        for( Apple apple: list){
            apple.inThongTin();
        }
    }
    
}
