package vn.edu.giadinh.tuan02;

import java.util.Scanner;

public class Lap1Bai3 {
    public static void main(String[] args){
        double canhThuNhat, canhThuHai, canhThuBa, theTich;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cạnh thứ nhất của khối lập phương: ");
        canhThuNhat = scanner.nextDouble();
        System.out.print("Nhập cạnh thứ hai của khối lập phương: ");
        canhThuHai = scanner.nextDouble();
        System.out.print("Nhập cạnh thứ ba của khối lập phương: ");
        canhThuBa = scanner.nextDouble();

        theTich = canhThuNhat*canhThuHai*canhThuBa;
        System.out.printf("Thể tích của khối lập phương là: %d", theTich);
    }

}
