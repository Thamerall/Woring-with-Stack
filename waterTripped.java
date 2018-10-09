public class waterTripped {
    public static void main(String[] args) {
        int [] a  = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(water(a));
    }
    public static int water(int [] a ){
        int l = 0 , r = a.length-1 , level = 0 , water = 0;
        while (l  < r){
            int lower = a[(a[l]<a[r]) ? l++ : r--];
            level = Math.max(lower,level);
            water += level-lower;

        }
        return water;
    }
}
