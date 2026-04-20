class Solution {
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if(pivot == -1 || nums[nums.length - 1] > nums[0]){
            return binSearch(nums, target, 0, nums.length - 1);
        }        
        if(nums[pivot] == target){
            return pivot;
        }
        if(target >= nums[0]){
            return binSearch(nums, target, 0, pivot - 1);
        }
        return binSearch(nums, target, pivot + 1, nums.length - 1);
    }
    public int binSearch(int[] nums, int target, int l, int r){
        
        while(l <= r){
            int m = l + (r - l) / 2;
            if(nums[m] == target){
                return m;
            }
            else if(nums[m] > target){
                r = m - 1;
            }
            else{
                l = m + 1;
            }
        }
        return -1;
    }
    public int findPivot(int[] nums){
        int l = 0, r = nums.length - 1;
        if(nums.length == 1){
            return -1;
        }
        while(l <= r){
            int m = l + (r - l) / 2;
            if(m < r && nums[m] > nums[m + 1]){
                return m;
            }
            if(l < m && nums[m] < nums[m - 1]){
                return m - 1;
            }
            if(nums[m] >= nums[l]){
                l = m + 1;
            }
            else{
                r = m - 1;
            }
        }
        return -1;
    }
}
