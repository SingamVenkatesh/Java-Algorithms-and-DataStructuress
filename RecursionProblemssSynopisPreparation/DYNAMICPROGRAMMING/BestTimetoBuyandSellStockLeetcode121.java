package RecursionProblemssSynopisPreparation.DYNAMICPROGRAMMING;

public class BestTimetoBuyandSellStockLeetcode121
{
    public static void main(String[] args) {
        //prices = [7,1,5,3,6,4] output:5
        int[] prices={7,1,5,3,6,4};
        int MaxProfit= bestTime(prices);
        System.out.println(MaxProfit);
    }
    private static int bestTime(int[] prices)
    {
        int buy_price=prices[0];
        int max_profit=0;
        for(int i=1;i<prices.length;i++)
        {

            if(prices[i]<buy_price)
            {
                buy_price=prices[i];
            }
            else
            {
                int current_profit=prices[i]-buy_price;
                max_profit=Math.max(current_profit,max_profit);

            }
        }
        return max_profit;
    }
}
