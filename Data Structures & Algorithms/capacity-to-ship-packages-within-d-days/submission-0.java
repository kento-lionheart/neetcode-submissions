class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int minCap = -1;
        int maxCap = 0;
        for(int x : weights){
            minCap = Math.max(minCap, x);
            maxCap += x;
        }
        int res = maxCap;
        while(minCap <= maxCap){
            int m = minCap + (maxCap - minCap) / 2;
            if(canShip(weights, days, m)){
                res = Math.min(res, m);
                maxCap = m - 1;
            }
            else{
                minCap = m + 1;
            }
        }
        return res;
    }
    public boolean canShip(int[] weights, int ships, int cap){
        int curCap = cap;
        int curShip = 1;
        for(int w : weights){
            if(curCap - w < 0){
                curShip++;
                if(curShip > ships){
                    return false;
                }
                curCap = cap;
            }
            curCap -= w;
        }
        return true;
    }
}