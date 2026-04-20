class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] postfix = new int[nums.length];
        int[] res = new int[nums.length];
        prefix[0] = nums[0];
        postfix[nums.length - 1] = nums[nums.length - 1];
        for(int i = 1; i < nums.length; i++){
            prefix[i] = prefix[i - 1] * nums[i];
        }
        for(int i = nums.length - 2; i >= 0; i--){
            postfix[i] = postfix[i + 1] * nums[i];
        }
        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                res[i] = postfix[1];
            }
            else if(i == nums.length - 1){
                res[i] = prefix[i - 1];
            }
            else{
                res[i] = prefix[i - 1] * postfix[i + 1];
            }
        }
        return res;
    }
}  
