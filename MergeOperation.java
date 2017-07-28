import java.util.Arrays;

/**
 * Created by Goutam on 7/28/2017.
 */
public class MergeOperation {
        public static void getMergedArray(int a[], int b[], int c[]) {
            int i = 0; /*To trace the array elements of a[]*/
            int j = 0; /*To trace the array elements of b[]*/
            int k = 0; /*To trace the array elements of c[]*/

            while(i<a.length && j<b.length) {
                if (a[i] < b[j]) {
                    c[k++] = a[i++];
                } else {
                    c[k++] = b[j++];
                }
            }

            while(i<a.length) {
                    c[k++] = a[i++];
            }

            while(j<b.length) {
                    c[k++] = b[j++];
            }

            System.out.println("The new List is : " + Arrays.toString(c));
            
        }
        
        public static void inplaceMerge(int a[], int b[]) {
            int m = a.length;
            int n = b.length;
            int lastOfa = a[m-1];
            int j;
            for(int i=n-1; i >=0; i--) {
                for(j=m-2; j >=0 && a[j] > b[i] ; j--)
                    a[j+1] = a[j];
                if(j!= m-2 || lastOfa > b[i]){
                    a[j+1] = b[i];
                    b[i] = lastOfa;
                }
            }
            System.out.println("The new List is : " + Arrays.toString(a));
            System.out.println("The new List is : " + Arrays.toString(b));
        }
        public static void main(String args[]){
            int a[] = {1, 3, 5, 7};
            int b[] = {2, 4, 6, 8};
            int c[] = new int[a.length + b.length];
            //getMergedArray(a,b,c);
            inplaceMerge(a,b);
        }
    }

