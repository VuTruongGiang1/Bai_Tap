package vn.edu.giadinh.tuan03;

public class xe2TestDrive {
    public static void main(String[] args) {
        xe2 xe;

        xe = new xe2("Moto");
        System.out.println("Dòng xe: " + xe.dong);

        xe.dong = "Moto";
    }
}
