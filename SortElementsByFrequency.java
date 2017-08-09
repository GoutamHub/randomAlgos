import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by Goutam on 8/9/2017.
 */
/*Step-1: Construct a HashMap to count the frequency of the elements present in the Array
* Step-2: Construct a LinkedList to get a Sorted results as desired
* Step-3: Use Java internal sorting on map elements based on frequency
* Step-4: Write your comparator to get the sorted result
* @TimeComplexity: 
* step-1 will takes 0(n) as its needs to go through all the array elements
* step-2 Again takes 0(n) to construct the List
* step-3 will takes 0(nlogn) to get the sorting results in worst case
* So Total time will be : 0(n)+0(n)+0(nlogn) ==> 0(nlogn) */

public class SortElementsByFrequency {
    public static int arr[] = new int[] {2, 5, 2, 6, -1, 9999999, 5, 8, 8, 8};
    public static Map<Integer, Integer> hs = new HashMap<Integer, Integer>(); 
    static int initFrequency = 1;
    
    public static void hashStorage() {
        for(int i=0; i<arr.length; i++) {
            if(!hs.containsKey(arr[i]))
                hs.put(arr[i], initFrequency);
            else {
                int presentFrequency = hs.get(arr[i]);
                presentFrequency++;
                hs.put(arr[i], presentFrequency);
            }
                
        }
        System.out.println(hs);/*{-1=1, 2=2, 5=2, 6=1, 9999999=1, 8=3} is the output after this stage*/

        List<Map.Entry<Integer,Integer>> list = new LinkedList<Map.Entry<Integer, Integer>>(hs.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue()); /*Ascending order Sorting*/
            }
        });
        
        for(Map.Entry<Integer,Integer> item : list) {
            System.out.print(item.getKey() + " ");
        }
    }
    
    public static void main(String args[]) {
        hashStorage();
    }    
}
