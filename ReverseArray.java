import java.util.Arrays;

import static java.lang.Math.min;

/**
 * Created by Goutam on 7/29/2017.
 */
public class ReverseArray {
    public static int a[] ={1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int k = 3;
    public static int left=0;
    public static int right=0;
    
    public static void doReverse() {
        
        for(int i=0; i<a.length; i=i+k) {
            int left = i;
            int right = min(i+k-1, a.length-1);
            while(left < right) {
                int temp;
                temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            }
        }
      System.out.println("The k = {3} size rever Arrays is : " + Arrays.toString(a));  
    }
    
    
    public static void main(String args[]) {
        doReverse();
    }
}
