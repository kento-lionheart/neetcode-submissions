class Solution {
    public int splitArray(int[] nums, int k) {
        int l = 0, r = 0;
        for(int num : nums) {
        	l = Math.max(l, num);
        	r += num;
        }
        while(l < r) {
        	int m = l + (r - l) / 2;
        	int capacity = 0;
        	int ships = 1;
        	for(int num : nums) {
        		if(capacity + num > m) {
        			capacity = num;
        			ships++;
        		}
        		else {
        			capacity += num;
        		}
        	}
        	if(ships > k) {
        		l = m + 1;
        	}
        	else {
        		r = m;
        	}
        }
        return r;
    }
}