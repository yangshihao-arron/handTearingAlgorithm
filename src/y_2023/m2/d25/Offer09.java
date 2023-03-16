package y_2023.m2.d25;

import java.util.LinkedList;
import java.util.List;

public class Offer09 {
    LinkedList<Integer> pushStack;
    LinkedList<Integer> popStack;
    public Offer09() {
        pushStack = new LinkedList<>();
        popStack = new LinkedList<>();
    }

    public void appendTail(int value) {
       pushStack.add(value);
    }

    public int deleteHead() {
        if(popStack.size() == 0 && pushStack.size() == 0)
            return -1;
        else{
            if(popStack.size() > 0){
                return popStack.remove();
            }else{
                while(pushStack.size()>0){
                    int temp = pushStack.pop();
                    popStack.add(temp);
                }
                return popStack.remove();
            }
        }
    }
}
