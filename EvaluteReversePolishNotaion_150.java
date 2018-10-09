import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class EvaluteReversePolishNotaion_150 {
    public static void main(String[] args) {
        String[] a = {"2", "1", "+", "3", "*"};
        System.out.println(reversepolishNotation(a));

    }

    public static int reversepolishNotation(String[] a) {
        String all = "+-*/";

        Deque<Integer> stack = new LinkedList<>();
        for (String s : a) {
            if (!all.contains(s)) {
                stack.push(Integer.valueOf(s));
                continue;
            }
            int num1 = stack.pop();
            int num2 = stack.poll();

            if (s.equals("+")) {
                stack.push(num2 + num1);
            } else if (s.equals("-")) {
                stack.push(num2 - num1);
            } else if (s.equals("*")) {
                stack.push(num1 * num2);
            } else if (s.equals("/")) {
                stack.push(num2 / num1);
            }
        }
        return stack.pop();

    }
}