package vn.edu.giadinh.tuan03;

public class mayTinhTestDrive {
    public static void main(String[] args) {
        mayTinh mayTinh;

        mayTinh = new mayTinh("Ajinomoto");
        System.out.println("Nhà sản xuất: " + mayTinh.nhaSanXuat);

        mayTinh.nhaSanXuat = "Ajinomoto";
    }
}
