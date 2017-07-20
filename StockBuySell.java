import java.util.ArrayList;

/**
 * Created by Goutam on 6/28/2017.
 */
class Interval {
    int buyDay, sellDay;
}
public class StockBuySell {
    void StockBuySell(int price[], int length) {
      /*We need atleast 2elements to reach the solution*/  
      if (length == 2)
          return;
      int i=0;
      int count=0;
      ArrayList<Interval> sol = new ArrayList<>();
      while(i < length-1) {
          /*Calculate Local-minimum and store it to starting-index. If not found return. 
          * If the present element <= next element, then present element is Local-minimum*/
          while(i < length-1 && !(price[i] <= price[i+1])) 
              i++;
          /*if we reach to the end of the Array-length, it means no solution exists*/
          if (i == length-1)
              break;
          Interval e = new Interval();
          e.buyDay = i++; //store the index for Local-minimum and increment the value of i
          /*Calculate Local-Maximum and store it to End-index. 
          * If the present element >= next element, then the present element is Local-Maximum*/
          while(i < length-1 && !(price[i] >= price[i+1]))
              i++;
          e.sellDay = i;
          sol.add(e);
          count++; //Update the solution to trace all buy and sell day
      }
      for(int j=0; j <count ; j++) {
          if(count == 0)
          System.out.println("There is no solution exists with given input");
          else
          System.out.println(" Buy date: " + sol.get(j).buyDay + " sell date: " + sol.get(j).sellDay);    
      }
      return;
    }
    public static void main(String args[]) {
        StockBuySell stock = new StockBuySell();
        int price[] ={23, 13, 25 ,29 ,33 ,19 ,34, 45, 67, 65};
        int length = price.length;
        stock.StockBuySell(price, length);
    }
}
