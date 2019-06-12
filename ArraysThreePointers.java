public class ArraysThreePointers {
    public static void main(String[] args) {
        int a [] = {1,4,10};
        int b [] = {2,15,20};
        int c [] = {10,12};

        System.out.println(minimize(a,b,c));
    }

    public static int minimize(final int[] a, final int[] b, final int[] c) {
        int max = Integer.MAX_VALUE;
        int i = 0 , j = 0 , k = 0;
        while (i < a.length && j< b.length && k < c.length) {
            int temp = Math.max(Math.abs(a[i]-b[j]), Math.max(Math.abs(b[j]-c[k]), Math.abs(c[k]-a[i])));
            max = Math.min(max, temp);
            if (a[i] <= b[j] && a[i] <= c[k]) {
                i++;
            } else if (b[j] <= c[k] && b[j] <= a[i]) {
                j++;
            } else {
                k++;
            }
        }

        return max;

    }

}
