class Solution {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1;
		if(nums.length == 1) return nums[0];
        if(nums[l] < nums[r]) return nums[l];
        while(l < r){
            int m = l + (r - l + 1) / 2;
            if(nums[m] > nums[0]){
                l = m ;
            }
            else{
                r = m - 1;
            }
        }
        return nums[l + 1];
    }
}
