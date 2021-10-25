package vn.edu.giadinh.tuan05;

import java.util.ArrayList;
import java.util.List;

import com.giangvt2008110143.tuan04.Dog;
import com.giangvt2008110143.tuan04.student;

public class CTMinhHoaMang {
    public static void main(String[] args) {
        
        ArrayList a = new ArrayList();
        a.add("Cường");
        a.add(true);
        a.add(1);
        a.add(2.5);

        Dog dog = (Dog)a.get(2);
        System.out.println("Dog name: " +dog.name + "color" + dog.color);
        //Integer x = (Integer)a.get(2);

        a.add(1,5);
        System.out.println(a.get(0));

        List bienTCArrayList = new ArrayList();

        bienTCArrayList.add(new student("Tèo", 18));

        //lấy 1 phần tử từ List
        student student = (student)bienTCArrayList.get(0);

        System.out.println(bienTCArrayList);
    }

}
