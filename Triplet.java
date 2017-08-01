import java.util.Arrays;

/**
 * Created by Goutam on 8/1/2017.
 */
public class Triplet {
    public static int arr[] = {3, 1, 4, 6, 5};
    
    public static void findTriplet(int len) {
        for(int i=0; i<len; i++)
            arr[i] = arr[i]*arr[i];

        Arrays.sort(arr);
        
        for(int j=len-1; j>=2; j-- ) {
            int left = 0;
            int right = len-2;
            while(left<right) {
                if(arr[left]+arr[right] == arr[j]) {
                    System.out.println("Yes");
                    return;
                }
                else 
                    if(arr[left]+arr[right]<arr[j])
                        left++;
                    else
                        right--;
            }
        }
        System.out.println("No");
    }
    
    public static void main(String args[]) {
        findTriplet(arr.length);
    }
}
