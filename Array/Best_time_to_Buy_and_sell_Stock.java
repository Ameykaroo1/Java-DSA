/*Question 3: You are given an array prices where prices[i] is the price of a given stock on
the i th day.
Return the maximum profit you can achieve from this transaction. If you cannot
achieve any profit, return 0.
Example 1:
Input: prices = [7, 1, 5, 3, 6, 4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because
you must buy before you sell.
Example 2:
Input: Prices = [7, 6, 4, 3, 1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
Constraints:
• 1 <= prices . length <= 105
• 0 <= prices [ i ] <= 10  */
public class Best_time_to_Buy_and_sell_Stock{
  public static int sellStock(int arr[]){
    int n = arr.length;
    int min_price = Integer.MAX_VALUE;
    int maxprofit = 0;

    for(int price: arr){
      if(min_price> price){
        min_price = price;
      }else{
        maxprofit = Math.max(maxprofit, price-min_price);
      }
    }
    return maxprofit;
  }
  public static void main(String[] args) {
    int arr[] = {7,1,5,3,6,4};
    int result = sellStock(arr);
    System.out.println("Max profit:" + result);

  }
}