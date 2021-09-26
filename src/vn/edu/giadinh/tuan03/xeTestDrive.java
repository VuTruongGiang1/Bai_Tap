package vn.edu.giadinh.tuan03;

public class xeTestDrive {
    public static void main(String[] args) {
        xe xe;

        xe = new xe("Bạch Tuyết và 7 chú lùn");
        System.out.println("Tên chủ xe: " + xe.tenChuXe);

        xe.tenChuXe = "Bạch Tuyết và 7 chú lùn";
    }
}
