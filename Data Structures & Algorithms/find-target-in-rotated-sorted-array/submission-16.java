class Solution {
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        int res = binSearch(nums, target, 0, pivot);
        return res == -1 ? binSearch(nums, target, pivot + 1, nums.length - 1) : res;
    }
    public int binSearch(int[] nums, int target, int l, int r) {
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] == target) {
                return m;
            } else if (nums[m] > target) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }
    public int findPivot(int[] nums) {
        if (nums[nums.length - 1] > nums[0]) {
            return nums.length - 1;
        }
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int m = l + (r - l + 1) / 2;
            if (nums[m] < nums[0]) {
                r = m - 1;
            } else {
                l = m;
            }
        }
        return l;
    }
}
