class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0, high = 0;
        for(int x : weights){
            low = Math.max(x, low);
            high += x;
        }
        int res = high;
        while(low < high){
            int m = low + (high - low) / 2;
            boolean isGood = helper(weights, days, m);
            if(isGood){
                res = m;
                high = m;
            }
            else{
                low = m + 1;
            }
        }
        return res;
    }
    public boolean helper(int[] weights, int day, int capacity){
        int curSum = 0, count = 1;
        for(int x : weights){
            if(curSum + x > capacity){
                count++;
                curSum = x;
            }
            else{
                curSum += x;
            }
        }
        return count <= day;
    }
}