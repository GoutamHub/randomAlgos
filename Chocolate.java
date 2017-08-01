import java.util.Arrays;

/**
 * Created by Goutam on 8/1/2017.
 */
public class Chocolate {
    public static int choco[] = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
    static int student = 7;
    
    public static void getMinDifference(int len) {
        if(len == 0 || student == 0)
            return;
        if(student > len)
            return;
        Arrays.sort(choco);
        int firstPkt = 0;
        int lastPkt = 0;
        int minDiff = Integer.MAX_VALUE;
        for(int i=0; i+student-1<len; i++){
            int diff = choco[i+student-1] -choco[i];
            if(diff < minDiff) {
                minDiff = diff;
                firstPkt = i;
                lastPkt = i+student-1;
            }
        }
        System.out.print(choco[lastPkt] - choco[firstPkt]);
    }
    
    public static void main(String args[]) {
        getMinDifference(choco.length);
    }
    
}
