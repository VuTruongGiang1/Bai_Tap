package vn.edu.giadinh.tuan03;

public class mayTinh3TestDrive {
    public static void main(String[] args) {
        mayTinh3 mayTinh;

        mayTinh = new mayTinh3(32);
        System.out.println("Ram: " + mayTinh.ram + "GB");

        mayTinh.ram = 32;
    }
}
