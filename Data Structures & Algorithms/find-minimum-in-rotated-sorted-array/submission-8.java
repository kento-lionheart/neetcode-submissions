class Solution {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1;
        int res = 0;
        if(nums.length == 1) return nums[0];
        while(l <= r){
            int m = l + (r - l) / 2;
            if(m < r && nums[m] > nums[m + 1]){
                res = m + 1;
                return nums[res];
            }
            if(l < m && nums[m] < nums[m - 1]){
                res = m;
                return nums[res];
            }
            if(nums[m] > nums[0]){
                l = m + 1;
            }
            if(nums[m] < nums[nums.length - 1]){
                r = m - 1;
            }
        }
        return nums[res];
    }
}
