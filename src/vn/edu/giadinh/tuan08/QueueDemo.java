package vn.edu.giadinh.tuan08;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue;

        queue = new LinkedList<>();

        queue.add(8);
        queue.add(10);
        queue.add(2);

        //lấy ra 1 phần tử

        System.out.println(queue);

        int PhanTuDuocLayRa = queue.remove();

        System.out.println("Phần tử được lấy ra từ Queue: " +PhanTuDuocLayRa);

        System.out.println("Phần tử còn lại trong Queue: ");

        System.out.println(queue);

        //thăm 1 phần tử của Queue
        int PhanTuDuocTham = queue.peek();

        System.out.println("Phần tử vừa được thăm: "+PhanTuDuocTham);

        System.out.println("Phần tử còn lại trong Queue sau khi thăm: ");

        System.out.println(queue);
    }
}
