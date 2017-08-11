/**
 * Created by Goutam on 8/10/2017.
 */
public class FindPivot {
    public static int getPivot(int a[], int startIndex, int endIndex){
        
        if(startIndex>endIndex)
            return -1;
        if(startIndex == endIndex)
            return a[startIndex];
        int midIndex = (startIndex + endIndex)/2;
        
        if(midIndex<endIndex && a[midIndex] > a[midIndex+1])
            return a[midIndex];
        
        if(midIndex>startIndex && a[midIndex] < a[midIndex-1])
            return a[midIndex-1];
        
        
        if(a[startIndex]<=a[midIndex])
            return getPivot(a, midIndex+1, endIndex);
        else
            return getPivot(a, startIndex, midIndex-1);
        
    }
    
    
    public static void main(String args[]) {
    int a[] = {4,5,6,7,8,9,1,2,3};
        int startIndex = 0;
        int endIndex = a.length-1;
    int pivot = getPivot(a, startIndex, endIndex);
    System.out.println("The Pivot element is : " + pivot);
    }
}
