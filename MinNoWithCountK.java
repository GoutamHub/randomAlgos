package arrayprograms;

import java.util.HashMap;

/**
 * Created by Goutam on 8/24/2017.
 */
public class MinNoWithCountK {
    
    private int findMinno(int a[], int k){
        int result = Integer.MAX_VALUE;
        HashMap<Integer,Integer> frequency = new HashMap<>();
        for(int i=0; i<a.length; i++){
            if(!frequency.containsKey(a[i]))
                frequency.put(a[i], 1);
            else
                frequency.put(a[i], frequency.get(a[i])+1);
        }
        
        /*Iterate the HashMap elements to get the element with count k in value field
        * This will take 0(n) in Worst case*/
        for(int j=0; j<frequency.size(); j++) {
            if (frequency.get(a[j]) == k && k != 0) {
                if (a[j] < result)
                    result = a[j];
            }
        }
        return result;
    }
    
    public static void main(String args[]) {
        int[] array = new int[]{3, 5,5, 3, 2, 2, 1, 1 };
        int k = 1;
        MinNoWithCountK mck = new MinNoWithCountK();
        System.out.println("The Minimum number with given k is: " + mck.findMinno(array, k));
    }
}
