/**
 * Created by Goutam on 7/27/2017.
 */
public class Leaders {
    
    public static void getLeaders(int a[], int n) {
        int maxFromRight = a[n-1];
        System.out.print("The Leader(s) are from Right to left: " + maxFromRight);
        for(int i=n-2; i>=0; i--) {
            if(maxFromRight < a[i]) {
                maxFromRight = a[i];
                System.out.print(", " + a[i]);
            }
        }
    }
    
    public static void main(String arags[]) {
        int array[] = {16,17,4,3,5,2};
        int len = array.length;
        getLeaders(array, len);
        
    }
}
