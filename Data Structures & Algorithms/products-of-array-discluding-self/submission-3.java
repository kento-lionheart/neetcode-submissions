class Solution {
    public int[] productExceptSelf(int[] nums) {
        int hasZero = 0;
        int product = 1;
        for(int x : nums){
            if(x != 0){
                product *= x;
            }
            else{
                hasZero++;
            }
        }
        int[] res = new int[nums.length];
        for(int i = 0; i < res.length; i++){
            if(hasZero == 0){
                res[i] = product / nums[i];
            }
            else if(hasZero == 1){
                if(nums[i] != 0){
                    res[i] = 0;
                }
                else{
                    res[i] = product;
                }
            }
            else{
                res[i] = 0;
            }
        }
        return res;
    }
}  
