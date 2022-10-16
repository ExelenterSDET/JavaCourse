package Day48.Practice.SP.mentoring_10_14;
/*      You are given an array prices where prices[i] is the price of a given stock on the ith day.
        You want to maximize your profit by choosing a single day to buy one stock
        and choosing a different day in the future to sell that stock.
        Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

        Input: prices = [7,1,5,3,6,4]
        Output: 5
        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
        Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

        Input: prices = [7,6,4,3,1]
        Output: 0
        Explanation: In this case, no transactions are done and the max profit = 0.*/
public class Task3 {
    static int buySellStock(int[] arr){
        int min = Integer.MAX_VALUE;
        int profit = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
                profit = 0;
            }
            else if(arr[i] > profit){
                profit = Math.max(profit, arr[i] - min);
            }
        }
        return profit;
    }

    public static void main(String[] args) {
      int[] prices = {7,1,5,3,6,4};     // 7,4,5,3,6,1    7,1,5,3,6,4  7,6,4,3,1, 1,7,4,3,1
        int i = buySellStock(prices);
        System.out.println(i);
    }
}
