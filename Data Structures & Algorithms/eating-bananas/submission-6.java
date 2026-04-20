class Solution {
    public  int minEatingSpeed(int[] piles, int h) {
        int maxRate = -1;
        for(int x : piles){
            maxRate = Math.max(maxRate, x);
        }
        long l = 1, r = maxRate;
        long res = maxRate;
        while(l <= r){
            long m = l + (r - l) / 2;
            long time = totalTime(piles, m);
            if(time > h){
                l = m + 1;
            }
    
            else{
                res = Math.min(res, m);
                r = m - 1;
            }
        }
        return (int)res;
    }
    public long totalTime(int[] arr, long rate){
        long sum = 0;
        for(int x : arr){
            sum += (long) Math.ceil(1.0*x / rate);
        }
        return sum;
    }
}
