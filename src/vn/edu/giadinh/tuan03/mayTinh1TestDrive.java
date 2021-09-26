package vn.edu.giadinh.tuan03;

public class mayTinh1TestDrive {
    public static void main(String[] args) {
        mayTinh1 mayTinh;

        mayTinh = new mayTinh1("31-2-2022");
        System.out.println("Năm sản xuất: " + mayTinh.namSanXuat);

        mayTinh.namSanXuat = "31-2-2022";
    }
}
