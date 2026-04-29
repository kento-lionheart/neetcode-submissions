class Solution {
    public int splitArray(int[] weights, int days) {
        int low = Integer.MIN_VALUE, high = 0;
        for(int x : weights){
            low = Math.max(low, x);
            high += x;
        }
        while(low < high){
            int m = low + (high - low) / 2;
            if(helper(weights, days, m)){
                high = m;
            }
            else{
                low = m + 1;
            }
        }
        return high;
    }
    public boolean helper(int[] weights, int days, int capacity){
        int count = 1, curSum = 0;
        for(int x : weights){
            if(curSum + x <= capacity){
                curSum += x;
            }
            else{
                count++;
                curSum = x;
            }
        }
        return count <= days;
    }
}