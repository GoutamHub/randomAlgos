import java.util.ArrayList;

/**
 * Created by Goutam on 8/6/2017.
 */
public class PasCal {
    //public static int a[][] = new int[5][5];
    public static int record[] = new int[5]; 
    static int count=0;
    public static void main(String args[]) {
        int i, j;
        for(i=0; i<5; i++) {
            if(count!=0)
                count = 0;
            for(j=0; j<=i; j++) {
                if(j==0 || j==i) {
                    //a[i][j] = 1;
                    record[count] = 1;
                    count++;
                }
                else {
                    //a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
                    //count--;
                    record[count] = record[count] + record[count-1];
                    count++;
                }
                //System.out.print(a[i][j] + " ");
            }
            for(int k=0; k<count; k++)
                System.out.print(record[k] + " ");
            System.out.print("\n");
        }
    }
}
