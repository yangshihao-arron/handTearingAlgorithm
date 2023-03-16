package y_2023.m2.d25;

import java.util.LinkedList;

public class TestStack {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();
       stack.push(0);
       stack.push(1);
       stack.addLast(-1);
       System.out.println(stack.size());
        System.out.print("stack [");
        for (int i = 0; i < stack.size(); i++) {
            if(i != stack.size() - 1)
                System.out.print(stack.get(i) + ",");
            else
                System.out.println(stack.get(i) + "]");
        }
        System.out.println();
        System.out.println(stack.pop());
    }
}
