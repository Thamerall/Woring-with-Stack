public class largestSumSubArray_3 {
    public static void main(String[] args) {
        final int [] a = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(a));
    }
    public  static int maxSubArray(final int[] a) {
        int sum = Integer.MIN_VALUE;
        int last = 0;
        for (int num : a){
            last += num;
            sum = Math.max(sum,last);
            if (last<0)
                last = 0;
        }
        return sum;

    }
}
