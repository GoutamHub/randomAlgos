/**
 * Created by Goutam on 7/27/2017.
 */
public class EquilibriumIndex {
    public static void getEquilibriumIndex(int a[], int n){
        int leftSum = 0;
        int totalSum = 0;
        int rightSum = 0;
        
        for(int i=0; i<n; i++) {
            totalSum = totalSum + a[i];
        }
        for(int i=0; i<n; i++) {
            rightSum = totalSum - a[i];
            totalSum = rightSum;
            if(rightSum == leftSum) {
                System.out.print(" " + i);
                return;
            }
            leftSum = leftSum + a[i];
        }
        System.out.print("There is no such Equilibrium Index exists.");
        return;
    }
    public static void main(String arags[]) {
        //int array[] = {-7, 1, 5, 2, -4, 3, 0};
        int array[] = {1};
        int len = array.length;
        getEquilibriumIndex(array, len);
    }
}
