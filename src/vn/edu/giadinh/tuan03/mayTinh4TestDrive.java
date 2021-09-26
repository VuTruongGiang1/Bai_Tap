package vn.edu.giadinh.tuan03;

public class mayTinh4TestDrive {
    public static void main(String[] args) {
        mayTinh4 mayTinh;

        mayTinh = new mayTinh4("intel core i9 10500");
        System.out.println("CPU: " + mayTinh.CPU);

        mayTinh.CPU = "intel core i9 10500";
    }
}
