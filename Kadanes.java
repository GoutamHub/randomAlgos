import java.util.Arrays;

/**
 * Created by Goutam on 7/26/2017.
 */
public class Kadanes {
    static int startIndex = 0;
    static int endIndex = 0;
    
    public static int doMax(int m, int n) {
        if(m > n) 
           startIndex += 1; 
        return(m>n?m:n);
    }
    
    public static void calculateLargest(int a[], int n) {
        int currentMax = a[0];
        int globalMax = a[0];
        for(int i=1; i<n; i++) {
           currentMax = doMax(a[i], currentMax+a[i]);
           if(currentMax > globalMax) {
               globalMax = currentMax;
               endIndex = i;
           }
        }
        System.out.println("The Maximum sum is : " + globalMax);
        System.out.println("The StartIndex of Maximum sum Array is : " + startIndex);
        System.out.println("The EndIndex of Maximum sum Array is : " + endIndex);
    }
    
    public static void main(String[] args) {
        //int array[] = {-2,3,2,-1};
        int array[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int n = array.length;
        calculateLargest(array, n);
        System.out.println("The Maximum SubArray is: " + Arrays.toString(Arrays.copyOfRange(array, startIndex, endIndex)));
    }
}
