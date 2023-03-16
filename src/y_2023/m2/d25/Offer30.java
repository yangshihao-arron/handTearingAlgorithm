package y_2023.m2.d25;

import java.util.LinkedList;

public class Offer30 {

    LinkedList<Integer> stackIn;
    LinkedList<Integer> stackRe;


    public Offer30() {
        stackIn = new LinkedList<>();
        stackRe = new LinkedList<>();
    }

    public void push(int x) {
        if(stackIn.isEmpty()){
            stackIn.addLast(x);
            stackRe.addLast(x);
        }else{
            int minValue = x < stackRe.peekLast() ? x : stackRe.peekLast();
            stackIn.addLast(x);
            stackRe.addLast(minValue);
        }
        System.out.print("stackIn Push [");
        for(int i = 0; i < stackIn.size(); i++){
            if(i != stackIn.size() - 1)
                System.out.print(stackIn.get(i) + ",");
            else
                System.out.print(stackIn.get(i) + "]");
        }
        System.out.println();
        System.out.print("stackRe Push [");
        for(int i = 0; i < stackRe.size(); i++){
            if(i != stackRe.size() - 1)
                System.out.print(stackRe.get(i) + ",");
            else
                System.out.print(stackRe.get(i) + "]");
        }
        System.out.println();
    }

    public void pop() {
        stackIn.removeLast();
        stackRe.removeLast();
        System.out.print("stack Pop [");
        for(int i = 0; i < stackRe.size(); i++){
            if(i != stackRe.size() - 1)
                System.out.print(stackRe.get(i) + ",");
            else
                System.out.print(stackRe.get(i) + "]");
        }
        System.out.println();

    }

    public int top() {
        return stackIn.peekLast();
    }

    public int min() {
        return stackRe.peekLast();
    }

    public static void main(String[] args) {
        Offer30 stack = new Offer30();
        stack.push(2);
        stack.push(0);
        stack.push(3);
        stack.push(0);
        System.out.println("min: " + stack.min());
        stack.pop();
        System.out.println("min: " + stack.min());
        stack.pop();
        System.out.println("min: " + stack.min());
        stack.pop();
        System.out.println("min: " + stack.min());
    }
}
