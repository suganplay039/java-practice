import java.util.ArrayList;

public class MinStack {
    public static void main(String[] args) {
        String input = "19 P 10 P 9 g P 8 g P 7 g P 6 g p g p g p g p g p g";

    }
}

class Solution {
    public int size = 0;
    public int top = -1;
    public ArrayList<Integer> stackArray;
    public void push(int x) {
        stackArray.add(x);
        top++; size++;
    }

    public void pop() {
        if(stackArray.size() > 0) {
            stackArray.remove(top);
            top--;size--;
        }
    }

    public int top() {
        if(stackArray.size() > 0) {
            return stackArray.get(top);
        }
        return -1;
    }

    public int getMin() {
        if(stackArray.size() > 0) {
            int currentMin = stackArray.get(0);
            for(int i = 1; i < stackArray.size(); i++) {
                if(currentMin > stackArray.get(i)) { currentMin = stackArray.get(i); }
            }
            return currentMin;
        }
        return -1;
    }
}
