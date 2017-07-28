import java.util.Arrays;

/**
 * Created by Goutam on 7/28/2017.
 */
public class MinimumPlatform {
    public static int arrival[] = {900, 940, 950, 1100, 1500, 1800};
    public static int departure[] = {910, 1200, 1120, 1130, 1900, 2000};
    
    public static void getMinmumPlaform(int arrival[], int departure[]) {
        int i=1;
        int j=0;
        int minPlatform = 1;
        int count = 1;
        while(i<arrival.length && j<departure.length) {
            if(arrival[i] < departure[j]) {
                count++;
                i++;
                if(count > minPlatform)
                    minPlatform = count;
            } else {
                count--;
                j++;
            }
        }
        
        System.out.println("The Minimum Platform required for the Station: " + minPlatform);
        
    }
    
    
    public static void main(String args[]) {
        Arrays.sort(arrival);
        Arrays.sort(departure);
        getMinmumPlaform(arrival, departure);
    }
}
