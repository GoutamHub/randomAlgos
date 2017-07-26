import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by Goutam on 7/26/2017.
 */
public class SubSetSumPos {
    static int startIndex = 0;
    static int endIndex = 0;
    public static void getSubArray(int a[], int len, int k) {
        int currentSum = a[0];
        for(int i=1 ; i<=len; i++) {
            /*When CurrentSum is greater-than givenSum*/
            while(currentSum > k && startIndex < len-1){
                currentSum = currentSum - a[startIndex];
                startIndex++;
            }
            
            /*When CurrentSumm is equalsTo givenSum*/
            if (currentSum == k) {
                endIndex = i-1;
                System.out.println("The StartIndex is : " + startIndex + " And EndIndex is : " + endIndex);
                System.out.println("The SubSet Array is : " + Arrays.toString(Arrays.copyOfRange(a, startIndex, endIndex+1)));
                return;
            }
            
            /*When CurrentSum is less-than givenSum*/
            if(i < len)
                currentSum = currentSum + a[i];
        }
        System.out.println("No such SubArray Exists!");
        return;
    }
    
    public static void getNegativeSubArray(int a[], int len, int k) {
        int currentSum = 0;
        HashMap<Integer, Integer> account = new HashMap<>();
        for(int i=0; i<len; i++) {
            currentSum = currentSum+a[i];
            
            /*When CurrentSumm is equalsTo givenSum*/
            if(currentSum == k) {
                System.out.println("The StartIndex is : " + 0 + " And EndIndex is : " + i);
                System.out.println("The SubSet Array is : " + Arrays.toString(Arrays.copyOfRange(a, 0, i+1)));
                return;
            }
            
            if(account.containsKey(currentSum-k)) {
                System.out.println("The StartIndex is : " + account.get(currentSum-k)+1 + " And EndIndex is : " + i);
                System.out.println("The SubSet Array is : " + Arrays.toString(Arrays.copyOfRange(a, account.get(currentSum-k)+1, i+1)));
                return; 
            } else {
                account.put(currentSum, i);
            }
            
        }
        System.out.println("No such SubArray Exists!");
        return;
    }
    
    public static void main(String args[]) {
        //int array[] = {15, 2, 4, 8, 9, 5, 10, 23};
        int array[] = {10, 2, -2, -20, 10};
        int len = array.length;
        //int givenSum = 23;
        int givenSum = -10;
        //getSubArray(array, len, givenSum);
        getNegativeSubArray(array, len, givenSum);
    }
}
