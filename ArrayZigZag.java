import java.util.Arrays;

/**
 * Created by Goutam on 8/7/2017.
 */
public class ArrayZigZag {
    public static int a[] = new int[] {1, 4, 3, 2};
    public static void zigzag(int a[], int n) {
        boolean flag = true;
        /*The above flag is stands to indicate the "expected-relational-operator"
        * true : "expected value is <"
        * false : "expected value is >"
        * the final values should be like : a<b>c<d>e<f
        * which means first relation should be "<"*/
        int temp = 0;
        for(int i=0; i<=n-2; i++) {
            if(flag) {
                /*now at this moment the expected relation is < 
                * if "<" holds between a[i] and a[i+1] : do nothing
                * else swap a[i] and a[i+1]*/
                if(a[i] > a[i+1]) {
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            } else {
                /*now at this moment the expected relation is < 
                * if ">" holds between a[i] and a[i+1] : do nothing
                * else swap a[i] and a[i+1]*/
                if(a[i] < a[i+1]) {
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
            flag = !flag; /*Flip the flag for next iteration*/
        }
    }
    
    public static void main(String args[]) {
        zigzag(a, a.length);
        System.out.println(Arrays.toString(a));
    }
}
