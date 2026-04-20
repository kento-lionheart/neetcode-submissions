class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        long maxFruit = 0;
        long minFruit = 1;
        for(int x : piles){
            maxFruit = Math.max(maxFruit, x);
        }
        long k = maxFruit;
       while(minFruit <= maxFruit){
            long tempRate = minFruit + (maxFruit - minFruit) / 2;
            long hour = 0;
            for(int x : piles){
                hour += (long)Math.ceil((double)x / tempRate);
            }

            if(hour <= h){
                k = Math.min(tempRate, k);
                maxFruit = tempRate - 1;
            }
            else{
                minFruit = tempRate + 1;
            }
        }
        return (int)k;
    }
}
