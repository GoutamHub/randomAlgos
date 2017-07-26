/**
 * Created by Goutam on 7/26/2017.
 */
public class missingNumber {
    public static void getMissingNumberbyNaturalSum(int a[], int length) {
        int sum = ((length+1)*(length+2))/2;
        for(int i=0; i<length; i++)
            sum = sum-a[i];
        System.out.println("The Misssing Number is: " + sum);
    }
    
    public static void getMissingNumeberbyXOR(int a[], int length) {
        int i;
        int x1 = a[0];
        int x2 = 1;
        for(i=1; i<length; i++)
            x1 = x1^a[i];
        for(i=2; i<=length+1; i++)
            x2 = x2^i;
        System.out.println("The Misssing Number is: " + (x1^x2));
    }
    
    public static void main(String args[]) {
        int array[] = {1, 2, 4, 5, 6};
        int length = array.length;
        getMissingNumberbyNaturalSum(array, length);
        getMissingNumeberbyXOR(array, length);
    }
}
