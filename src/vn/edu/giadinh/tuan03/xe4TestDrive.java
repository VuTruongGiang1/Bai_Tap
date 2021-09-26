package vn.edu.giadinh.tuan03;

public class xe4TestDrive {
    public static void main(String[] args) {
        xe4 xe;

        xe = new xe4(100);
        System.out.println("Dung tích xăng: " + xe.dungTichXang +"ml");

        xe.dungTichXang = 100;
    }
}
