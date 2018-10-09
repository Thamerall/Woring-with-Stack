import java.util.*;
public class LargestRectangleHistogram {
    public static void main(String[] args) {

        int a[] = {2,1,5,6,2,3};

        System.out.println(largestRectangleArea(a));
    }
    public static int largestRectangleArea(int[] a) {

        int len = a.length;
        Stack<Integer> stack = new Stack<Integer>();
        int maxArea = 0;
        for(int i = 0; i <= len; i++){
            int h = (i == len ? 0 : a[i]);
            if(stack.isEmpty() || h >= a[stack.peek()]){
                stack.push(i);
            } else {
                int tp = stack.pop();
                maxArea = Math.max(maxArea, a[tp] * (stack.isEmpty() ? i : i - 1 - stack.peek()));
                i--;
            }
        }
        return maxArea;
    }

}
