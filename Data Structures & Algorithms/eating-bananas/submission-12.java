class Solution {
     public int minEatingSpeed(int[] piles, int h) {
        int low = 0, high = 0;
        for(int x : piles){
            high = Integer.max(x, high);
        }
        while(low < high){
            int m = low + (high - low) / 2;
            if(canEat(piles, h, m)){
                high = m;
            }
            else{
                low = m + 1;
            }
        }
        return low;
    }
    public boolean canEat(int[] piles, int h, int k){
        int count = 0;
        for(int pile : piles){
            count += (int) Math.ceil((double)pile / k);
        }
        return count <= h;
    }
}
