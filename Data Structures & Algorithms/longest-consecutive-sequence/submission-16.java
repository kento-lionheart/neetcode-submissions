class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 0){
            return 0;
        }
        int res = 1;
        int cur = 1;
        if(nums.length == 1) return res;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1]) continue;
            if(nums[i] - 1 == nums[i - 1]){
                cur++;
                if(cur >= res){
                    res = cur;
                }
            }
            else{
                cur = 1;
            }
        }
        return res;
    }
}
