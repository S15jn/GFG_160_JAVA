
class Day_09_stockBuyAndSell_I {
    public int maximumProfit(int prices[]) {
        // Code here
        if(prices.length==1){
            return 0;
        }
        int buy=Integer.MAX_VALUE;
        int profit=0;
        
        for(int i=0;i<prices.length;i++){
            buy=Math.min(prices[i],buy);
                if(prices[i]>buy){
                    profit=Math.max(profit,prices[i]-buy);
                }
            }
        
        return profit;
    }
}