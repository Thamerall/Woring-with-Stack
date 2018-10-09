import java.util.Stack;

public class miniStack {
    int min = Integer.MAX_VALUE;
    Stack<Integer> stack = new Stack<>();
    public void push(int x ){
        if(x <= min){
        min = x;
    }
    stack.push(x);

}
public void pop(){
    if(stack.pop() == min) min=stack.pop();
}

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;

    }
}
