import java.util.ArrayList;

public class MinStepsInfiniteGrid_1 {
    public static void main(String[] args) {
       int [] a = {0,1,2};
       int [] b = {0,1,2};
        System.out.println(coverPoints(a,b));

    }
    public static int coverPoints(int [] A , int [] B){

        int sum = 0;
        for(int i = 1; i < A.length; i++){
            int x = Math.abs(A[i]-A[i-1]);
            int y = Math.abs(B[i]-B[i-1]);
            sum += Math.max(x,y);
        }
        return sum;
    }
}