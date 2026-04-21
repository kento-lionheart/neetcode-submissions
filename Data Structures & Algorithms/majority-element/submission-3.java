class Solution {
    public int majorityElement(int[] nums) {
        int count = 1, res = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(count > 0){
                if(nums[i] == res){
                    count++;
                }
                else{
                    count--;
                }
            }
            else{
                if(nums[i] == res){
                    count++;
                }
                else{
                    count = 1;
                    res = nums[i];
                }
            }
        }
        return res;
    }
}