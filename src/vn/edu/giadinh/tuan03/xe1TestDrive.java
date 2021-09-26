package vn.edu.giadinh.tuan03;

public class xe1TestDrive {
    public static void main(String[] args) {
        xe1 xe;

        xe = new xe1("Yamaha");
        System.out.println("Hãng sản xuất: " + xe.hangSanXuat);

        xe.hangSanXuat = "Yamaha";
    }
}
