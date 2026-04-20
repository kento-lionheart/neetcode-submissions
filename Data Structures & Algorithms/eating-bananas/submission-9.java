class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1, r = Integer.MIN_VALUE;
        for(int pile : piles) {
        	r = Math.max(pile, r);
        }
        int res = Integer.MAX_VALUE;
        while(l <= r) {
        	int m = l + ( r -l )/2;
        	int totalH = timeTaken(piles, m);
        	if(totalH > h) {
        		l = m + 1;
        	}
        	else {
        		res = Math.min(res, m);
        		r = m - 1;
        	}
        }
        return res;
    }
	public int timeTaken(int[] piles, int k) {
		int sum = 0;
		for(int pile : piles) {
			sum += Math.ceil((double)pile / k);
		}
		return sum;
	}
}
