class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int top = 0, down = matrix.length - 1, left = 0, right = matrix[0].length - 1, size = right;
        while(top <= down){
            int midRow = top + (down - top) / 2;
            if(matrix[midRow][size] < target){
                top = midRow + 1;
            }
            else if(matrix[midRow][0] > target){
                down = midRow - 1;
            }
            else{
                return binSearch(matrix[midRow], target);
            }
        }
        return false;
    }
    public boolean binSearch(int[] nums, int target){
        int l = 0, r = nums.length - 1;
        while(l <= r){
            int m = l + (r - l) / 2;
            if(nums[m] == target) return true;
            else if(nums[m] > target) r = m - 1;
            else l = m + 1;
        }
        return false;
    }
}
