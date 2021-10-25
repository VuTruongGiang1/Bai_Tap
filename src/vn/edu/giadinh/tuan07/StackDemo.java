package vn.edu.giadinh.tuan07;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        
        Stack<String> stack;

        stack = new Stack<>();

        //thêm phần tử vào stack
        stack.push("welcome");
        stack.push("to");
        stack.push("Data");

        System.out.println(stack);

        //lấy ra 1 phần tử từ đỉnh stack
        String poped = stack.pop();

        System.out.println("Phần tử đã lấy ra là: "+poped);

        System.out.print("Phần tử còn lại của stack: ");
        System.out.println(stack);

        //Thăm nút đỉnh
        String phamTuDuocTham = stack.peek();
        System.out.println("Thăm phần tử đỉnh" +phamTuDuocTham);

        //sau khi thăm
        System.out.println(stack);
    }
}
