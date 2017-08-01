/**
 * Created by Goutam on 8/1/2017.
 */
public class TappingWater {
    public static int bars[] = {5,1,3,4}; 
    
    public static void getMinWater(int len) {
        int left[] = new int[len];
        int right[] = new int[len];
        int waterUnits=0;
        
        left[0] = bars[0];
        for(int i=1; i<len; i++)
            left[i] = Math.max(left[i-1], bars[i]);
        
        right[len-1] = bars[len-1];
        for(int i=len-2; i>=0; i--)
            right[i] = Math.max(right[i+1],bars[i]);
        
        for(int i=0; i<len; i++) {
            waterUnits += Math.min(left[i], right[i]) - bars[i];
        }
        
        System.out.println("The amount of water will be accumulated is : " + waterUnits);
    }
    
    public static void main(String args[]) {
        getMinWater(bars.length);
    }
}
