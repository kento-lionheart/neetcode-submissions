class Solution {
    public static boolean search(int[] nums, int target) {
        int pivot = pivot(nums);
        boolean res = binSearch(nums, target, 0, pivot);
        return res == false ? binSearch(nums, target, pivot + 1, nums.length - 1) : true;
    }
    public static boolean binSearch(int[] nums, int target, int l, int r){
        while(l <= r){
            int m = l + (r - l) / 2;
            if(nums[m] == target) return true;
            else if(nums[m] > target) r = m - 1;
            else l = m + 1;
        }
        return false;
    }
    public static int pivot(int[] nums){
        int l = 0, r = nums.length - 1;
        if(nums[l] < nums[r]) return l;
        while(l < r){
            int m = l + (r -l + 1) / 2;
            if(nums[m] == nums[l] && nums[r] == nums[m]){
                l++; r--;
            }
            else if(nums[m] >= nums[l]){
                l = m;
            }
            else{
                r = m - 1;
            }
        }
        return l;
    }
}