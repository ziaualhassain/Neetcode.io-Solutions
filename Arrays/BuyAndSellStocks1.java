package Arrays;

public class BuyAndSellStocks1 {

    //Brute Force O(n^2)
    //Optimised O(n)
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int maxProfitInGivenDays = maxProfit(prices);
        System.out.println(maxProfitInGivenDays);
        int maxProfitInGivenDaysOP = maxProfitOptimised(prices);
        System.out.println(maxProfitInGivenDaysOP);
    }

    public static int maxProfit(int[] prices) {
        int maximumProfit = 0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                int currentProfit = prices[i] - prices[j];
                if(currentProfit > maximumProfit){
                    maximumProfit = currentProfit;
                }
            }
        }
        return maximumProfit;
    }

    public static int maxProfitOptimised(int[] prices) {
        int minimumPrice = prices[0];
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            int currentPrice = prices[i];
            int currentProfit = minimumPrice - currentPrice;

            if(currentProfit < minimumPrice){
                minimumPrice = currentPrice;
            }

            if(currentProfit > maxProfit){
                maxProfit = currentProfit;
            }
        }

        return  maxProfit;
    }
}
