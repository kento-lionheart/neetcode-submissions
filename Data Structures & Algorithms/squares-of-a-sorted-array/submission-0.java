class Solution {
    public int[] sortedSquares(int[] nums) {
        int l = 0, r = nums.length - 1;
        int[] res = new int[nums.length];
        int index = r;
        while(l <= r) {
        	int l2 = (int)Math.pow(nums[l], 2), r2 = (int)Math.pow(nums[r], 2);
        	if(l2 >= r2) {
        		res[index] = l2;
        		l++;
        	}
        	else if(r2 > l2) {
        		res[index] = r2;
        		r--;
        	}
        	--index;
        }
        return res;
    }
}