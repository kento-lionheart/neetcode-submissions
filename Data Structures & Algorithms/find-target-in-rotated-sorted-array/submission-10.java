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
        if(nums[0] < nums[nums.length - 1]){
            return -1;
        }
        if(nums.length == 1) return -1;
        int firstHalf = nums[0], secondHalf = nums[nums.length - 1];
        int l = 0, r = nums.length - 1;
        while(l <= r){
            int m = l + (r - l) / 2;
            if(m < nums.length - 1 && nums[m] > nums[m + 1]){
                return m;
            }
            else if(m > 0 && nums[m] < nums[m - 1]){
                return m - 1;
            }
            else if(nums[m] > firstHalf){
                l = m + 1;
            }
            else if(nums[m] < secondHalf){
                r = m -1;
            }
        }
        return -1;
    }
}
