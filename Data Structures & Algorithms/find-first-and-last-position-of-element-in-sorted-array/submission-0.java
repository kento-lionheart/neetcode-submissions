class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[]{-1, -1};
        res[0] = binSearch(nums, target, true);
        res[1] = binSearch(nums,target, false);
        return res;
    }
    public int binSearch(int[] nums, int target, boolean findFirst){
        int l = 0, r = nums.length - 1;
        int res = -1;
        while(l <= r){
            int m = l + (r - l) / 2;
            if(nums[m] == target){
                if(findFirst){
                   res = m;
                   r = m - 1;
                }
                else{
                    res = m;
                    l = m + 1;
                }
            }
            else if(nums[m] > target){
                r = m - 1;
            }
            else{
                l = m + 1;
            }
        }
        return res;
    }
}