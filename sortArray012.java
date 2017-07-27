import java.util.Arrays;

/**
 * Created by Goutam on 7/20/2017.
 */
public class sortArray012 {
    public static void doSort012(int array[], int n) {
       int i = 0;
       int j = 0;
       int k = n-1;
       while(j <= k) {
           if(array[j] == 0) {
               doSwap(array, j, i);
               i++;
               j++;
           }
           if(array[j] == 1) {
               j++;
           }
           if(array[j] == 2) {
               doSwap(array, j, k);
               k--;
           }
       }
    }
    
    public static void doSort12(int array[], int n) {
        int i = 0;
        int j = n-1;
        while(i<j) {
            while(array[i] == 1 && i<j)
                i++;
            while(array[j] == 2 && i<j)
                j--;
            if(i<j) {
                array[i] = 1;
                array[j] = 2;
                i++;
                j++;
            }
        }
    }
    
    public static void doSwap(int array[], int l, int m) {
        int temp = array[l];
        array[l] = array[m];
        array[m] = temp;
    }
    
    public static void main(String[] args) {
        int array[] = {0,1,0,0,2,1,1,2,2,0,1};
        int array12[] = {2,1,2,2,2,1,1,1,2};
        int n = array.length;
        int m = array12.length;
        doSort012(array, n);
        doSort12(array12, m);
        System.out.println("The Sorted Array is: " + Arrays.toString(array));
        System.out.println("The Sorted Array is: " + Arrays.toString(array12));
    }
}
