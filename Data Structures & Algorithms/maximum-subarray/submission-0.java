class Solution {
    public int maxSubArray(int[] nums) {
        int curSum = 0, max = Integer.MIN_VALUE;
        for(int num : nums){
            curSum = Math.max(curSum, 0);
            curSum += num;
            max = Math.max(max, curSum);
        }
        return max;
    }
}
