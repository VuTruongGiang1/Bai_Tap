package vn.edu.giadinh.tuan03;

public class mayTinh6TestDrive {
    public static void main(String[] args) {
        mayTinh6 mayTinh;

        mayTinh = new mayTinh6("23-12-2025");
        System.out.println("Năm bảo hành: " + mayTinh.namBaoHanh);

        mayTinh.namBaoHanh = "23-12-2025";
    }
}
