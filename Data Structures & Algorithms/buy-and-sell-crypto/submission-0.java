class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;
        int bestBuy = Integer.MAX_VALUE;
        int bestSell = Integer.MIN_VALUE;
        for(int x : prices){
            if(x < bestBuy){
                bestBuy = x;
            }
            if(x - bestBuy > bestSell){
                bestSell = x - bestBuy;
            }
        }
        return bestSell;
    }
}
