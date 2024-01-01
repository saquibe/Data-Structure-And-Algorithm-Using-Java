// you are given an array price where price[i] is the price of a given stock on the ith day.
// you want to maximize your profit by choosing a single day to buy one stock and choosing
// a different day in the future to sell that stock return the maximum profit you can achieve
// from this transaction. If you can't achieve any profit return 0;
public class BuyAndSellStock{
    public static int buySellStock(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buyPrice<prices[i]) {
                int profit = prices[i]-buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String [] args){
        int stocks[] = {7,1,5,3,6,4};
        System.out.println("Max profit to sell stock : "+buySellStock(stocks));
    }
}
//time complexity is O(n)