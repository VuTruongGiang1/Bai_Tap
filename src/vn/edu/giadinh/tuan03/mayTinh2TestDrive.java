package vn.edu.giadinh.tuan03;

public class mayTinh2TestDrive {
    public static void main(String[] args) {
        mayTinh2 mayTinh;

        mayTinh = new mayTinh2("Windown");
        System.out.println("Hệ điều hành: " + mayTinh.heDieuHanh);

        mayTinh.heDieuHanh = "Windown";
    }
}
