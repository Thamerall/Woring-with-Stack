import java.util.Stack;

public class ReduntBract {
    public static void main(String[] args) {
        String a = "((a+b))";
        System.out.println(redunt(a));
    }
    public static int redunt(String a ) {

        Stack<Character> stack = new Stack<>();
        int index = 0;
        int size = a.length();
        while (index < size) {
            char c = a.charAt(index);
            if (c == '(' || c == '+' || c == '-' || c == '*' || c == '/') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.peek() == '(') {
                    return 1;
                } else {
                    while (!stack.empty() && stack.peek() != '(') {
                        stack.pop();
                    }
                    stack.pop();
                }
            }
            index++;

        }
        return 0;
    }

}
