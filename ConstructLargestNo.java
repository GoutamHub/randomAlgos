import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Goutam on 8/8/2017.
 */
public class ConstructLargestNo {
    private static void printBiggestNumber(String [] arr)
    {
        int i;
        Arrays.sort(arr,new Comparator<String>()
        {
            @Override
            public int compare(String a, String b)
            {
                String s1 = a + b;
                String s2 = b + a;
                return s2.compareTo(s1);
                /*If s2 < s1 return -1; If s2 > s1 return 1*/
            }
        });

        for(i=0 ; i< arr.length ; i++)
            System.out.print(arr[i]);
    }
    

    public static void main (String[] args) {
        //String[] arr = new String[]{"54","546","548","60"};
        String[] arr = new String[]{"6","7","2","5"};
        printBiggestNumber(arr);
        

    }

}
