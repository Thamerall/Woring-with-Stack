public class ThreeSum {
    public static void main(String[] args) {
        int [] a ={-1,2,1,-4};
        System.out.println(threeSum(a,1));
    }
    public static int threeSum(int [] a , int target ){
        int temp[] = new int[a.length];
        int sum = 0;
        for (int i = 0 ; i < a.length; i++){
            if(a[i] <= target ){

                sum = a[i] ;


            }
        }
        return  Math.abs(sum);
    }
}
