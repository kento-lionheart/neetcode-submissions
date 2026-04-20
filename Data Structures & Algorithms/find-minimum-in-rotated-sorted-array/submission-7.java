class Solution {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1;
        int res = nums[0];
        while(l <= r){
            int m = l + (r - l) / 2;
            if(m > l && nums[m] < nums[m - 1]){
                return nums[m];
            }
            if(m < r && nums[m] > nums[m + 1] ){
                return nums[m + 1];
            }
            if(nums[m] >= nums[l]){
                l = m + 1;
            }
            else{
                r = m - 1;
            }
        }
        return res;
    }
}
