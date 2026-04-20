class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 1) return nums[0];
        int n = nums.length - 1;
		if(nums[0] < nums[n]) {
			return nums[0];
		}
		return nums[pivot(nums) + 1];
    }
	public int pivot(int[] nums) {
		int l = 0, r = nums.length - 1;
		while(l <= r) {
			int m = l + (r - l) / 2;
			if(nums[m] > nums[m + 1]) {
				return m;
			}
			else if(nums[m] < nums[m - 1]) {
				return m - 1;
			}
			else if(nums[m] >= nums[0]) {
				l = m + 1;
			}
			else if(nums[m] < nums[0]) {
				r = m - 1;
			}
		}
		return - 1;
	}
}
