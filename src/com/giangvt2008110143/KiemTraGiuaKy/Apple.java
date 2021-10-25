package com.giangvt2008110143.KiemTraGiuaKy;

public class Apple {
    int ma, khoiLuong;
    String mauSac = "Vàng, Xanh, Đỏ";
    public Object mau;

    public Apple(int m, int k, String p){
        ma = m;
        khoiLuong = k;
        mauSac = p;
    }

    public Apple(){}

    public void nhap(){
        System.out.print("Nhập vào mã của Apple: " +  " "+ "Nhập vào khối lượng của Apple: "+ " " + "Nhập vào màu sắc của Apple: " + mauSac);
    }

    public void inThongTin(){
        System.out.print("Mã của Apple: " + ma);
        System.out.println("Khối lượng: " + khoiLuong);
        System.out.println("Màu sắc: " + mauSac);
    }

    public void Constructor(){}

    public void add(int ma2, int khoiLuong2, String mauSac2) {
    }
}
