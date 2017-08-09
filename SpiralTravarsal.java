/**
 * Created by Goutam on 8/9/2017.
 */

/*The idea here is to traverse the 2D array in below order and exclude the same row or column from traversing in next iteration.
* 1. Go RIGHT ----->
* 2. Go DOWN |
* 3. Go LEFT <----
* 4. GO UP |
* Eliminate the Rows and Columns which you have already traversed*/

public class SpiralTravarsal {
    
    public static void printSpiral(int a[][], int row, int col) {
        
        int rowStartIndex = 0;
        int rowEndIndex = row-1;
        int colStartIndex = 0;
        int colEndIndex = col-1;
        int i = 0;
        
        while(rowStartIndex<=rowEndIndex && colStartIndex<=colEndIndex) {
            /*First GOTO RIGHT, means print the 1st @ROW always*/
            for(i=colStartIndex; i<colEndIndex; i++)
                System.out.print(a[rowStartIndex][i] + " ");
            rowStartIndex++; /*eliminating the present @ROW from next iteration*/
            
            /*Second GOTO DOWN, means print the last @COLUMN always*/
            for(i=rowStartIndex; i<rowEndIndex; i++)
                System.out.print(a[i][colEndIndex]+ " ");
            colEndIndex--; /*eliminating the present @COLUMN from the next iteration*/
            
            if(rowStartIndex<rowEndIndex) {
            /*Third GOTO LEFT, means print the last @ROW always*/
                for (i = colEndIndex; i >= colStartIndex; i--)
                    System.out.print(a[rowEndIndex][i] + " ");
                rowEndIndex--; /*eliminating the present @ROW from the next iteration*/
            }
            
            if(colStartIndex<colEndIndex) {
            /*Fourth GOTO UP, means print the first @COLUMN always*/
                for (i = rowEndIndex; i>rowStartIndex; i--)
                    System.out.print(a[i][colStartIndex]);
                colEndIndex++; /*eliminating the present @COLUMN from the next iteration*/
            }
            
        }
    }
    public static void main(String args[]) {
        int row = 3;
        int column = 6;
        int arr[][] = new int[][] 
                { {1,  2,  3,  4,  5,  6},
                  {7,  8,  9,  10, 11, 12},
                  {13, 14, 15, 16, 17, 18}
                };
        printSpiral(arr, row, column);
    }
}
