package com.giangvt2008110143.tuan02;

import java.util.Scanner;

public class Lap2Bai4 {
    public static void main(String[] args){
        int chucNang;

        Scanner scanner = new Scanner(System.in);
        do{
        System.out.println("+--------------------MENU--------------------+");
        System.out.println("1. Tính chu vi và diện tích của hình chữ nhật");
        System.out.println("2. Tính thể tích của khối lập phương");
        System.out.println("3. Giải phương trình bậc nhất");
        System.out.println("4. Kết thúc");
        System.out.println("+--------------------MENU--------------------+");
        System.out.print("Chọn 1 chức năng: ");
        chucNang = scanner.nextInt();

        switch(chucNang){
            case 1: chuViVaDienTichHCN(); break;
            case 2: theTichLapPhuong(); break;
            case 3: giaiPhuongTrinhBacNhat(); break;
            case 4: System.out.println("Kết thúc!!!"); break;
            }
        }while(chucNang >= 1 && chucNang <= 3);
    }

    static void chuViVaDienTichHCN(){
        int chieuDai, chieuRong, chuVi, dienTich;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài của hình chữ nhật: ");
            chieuDai = scanner.nextInt();
        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
            chieuRong = scanner.nextInt();

            chuVi = (chieuDai + chieuRong)*2;
        System.out.printf("Chu vi hình chữ nhật là: %d", chuVi);

        System.out.println("                            ");

            dienTich = chieuDai*chieuRong;
        System.out.printf("Diện tích của hình chữ nhật là: %d", dienTich);

        System.out.println("                            ");
    }

    static void theTichLapPhuong(){
        int a,b,c, theTich;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cạnh thứ nhất của khối lập phương: ");
            a = scanner.nextInt();
        System.out.print("Nhập cạnh thứ hai của khối lập phương: ");
            b = scanner.nextInt();
        System.out.print("Nhập cạnh thứ ba của khối lập phương: ");
            c = scanner.nextInt();

            theTich = a*b*c;
        System.out.printf("Thể tích của khối lập phương là: %d", theTich);

        System.out.println("                             ");
    }

    static void giaiPhuongTrinhBacNhat(){
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
        System.out.printf("Nghiệm x là: %.3f", x );

        System.out.println("                             ");
        }
    }
}
