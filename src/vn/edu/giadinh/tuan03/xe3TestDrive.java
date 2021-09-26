package vn.edu.giadinh.tuan03;

public class xe3TestDrive {
    public static void main(String[] args) {
        xe3 xe;

        xe = new xe3("A2");
        System.out.println("Giấy phép lái xe loại: " + xe.giayPhep);

        xe.giayPhep = "A2";
    }
}
