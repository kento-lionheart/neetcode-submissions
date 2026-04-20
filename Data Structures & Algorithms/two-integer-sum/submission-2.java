class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for(int i = 0; i < nums.length; i++){
            int numsi = nums[i];
            for(int j = i + 1; j < nums.length; j++){
                int numsj = nums[j];
                if(numsi + numsj == target){
                    res[0] = i;
                    res[1] = j;
                    break;
                }
            }
        }
        return res;
    }
}
