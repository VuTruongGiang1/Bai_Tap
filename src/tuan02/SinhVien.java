package tuan02;

import java.util.Date;

public class SinhVien {
    String mssv;
    String tenSinhVien;
    int tuoi;
    String queQuan;
    Date ngaySinh;

    void inThongTinSV(){
        System.out.println("MSSV: " + mssv);
        System.out.println("Ten SV: " + tenSinhVien);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Que quan: " + queQuan);
        System.out.println("Ngay sinh: " + ngaySinh);
    }

}
