package vn.edu.giadinh.tuan03;

public class cowTestDrive {
    public static void main(String[] args) {
        cow cow;
        //cow = new Cow();
        cow = new cow(15);
        System.out.println("weight: " +cow.weight);

        cow.weight = 15;
    }
    
}
