/**
 * Created by Goutam on 8/7/2017.
 */
public class MaxFromLeftMinFromRight {
    public static int a[] = {5,1,4,3,6,8,10,7,9};
    
    public static void getElementIndex(int a[], int n) {
        /*This method will takes :
        * 1. 3 traversal of Input array
        * 2. 2 extra arrays
        * 3. Time-Complexity: o(n) and Space-Complexity: o(n)*/
        int leftMax[] = new int[n];
        int rightMin[] = new int[n];
        leftMax[0] = Integer.MIN_VALUE;
        rightMin[n-1] = Integer.MAX_VALUE;
        for(int i=1; i<n; i++)
            leftMax[i] = Math.max(leftMax[i-1], a[i-1]);
        for(int j=n-2; j>=0; j--)
            rightMin[j] = Math.min(rightMin[j+1], a[j+1]);
        for(int k=0; k<n; k++) {
            if(a[k] > leftMax[k] && a[k] < rightMin[k]) {
             System.out.println("The Element Index is : " + k);
             break;
            }
        }
        System.out.println("No such element exists..");
    }

    public static void getElementIndexOptimize(int a[], int n) {
        /*This method will takes :
        * 1. 2 traversal of Input array
        * 2. 1 extra array and 1 temp variable
        * 3. Time-Complexity: o(n) and Space-Complexity: o(n)*/
        int leftMax[] = new int[n];
        leftMax[0] = Integer.MIN_VALUE;
        int rightMin = Integer.MAX_VALUE;
        for(int i=1; i<n; i++)
            leftMax[i] = Math.max(leftMax[i-1], a[i-1]);
        for(int j=n-1; j>=0; j--) {
            if(a[j] > leftMax[j] && a[j] < rightMin) {
                System.out.println("The Element Index is : " + j);
                break;
            }
            rightMin = Math.min(a[j], rightMin);
        }
        System.out.println("No such element exists..");
    }
    
    public static void main(String args[]){
        getElementIndex(a, a.length);
        getElementIndexOptimize(a, a.length);
    }
}
