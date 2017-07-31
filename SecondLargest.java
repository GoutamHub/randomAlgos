/**
 * Created by Goutam on 7/30/2017.
 */
public class SecondLargest {
    public static void printSecondLargest(int a[], int n) {
        if(n<2) {
            System.out.println("There is no 2nd Largest Exists in given Array due to size <2");
            return;
        }
        int largest = -1;
        int secondLargest = -1;
        for(int i=0; i<n; i++) {
            if(a[i] > largest) {
                secondLargest = largest;
                largest = a[i];
            }
            else if(a[i] > secondLargest && a[i]!= largest) {
                secondLargest = a[i];
            }
        }
        if(secondLargest!= -1)
            System.out.println("The Second Largest is: " + secondLargest);
        else
            System.out.println("There is no 2nd Largest Exists in given Array");
    }
    
    public static void main(String args[]) {
        int array[] = {2,1,1};
        printSecondLargest(array, array.length);
    }
}
