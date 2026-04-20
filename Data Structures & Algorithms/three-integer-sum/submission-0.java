class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i - 1] == nums[i]){
                continue;
            }
            else{
                int left = i + 1, right = nums.length - 1;
                
                while(left < right){
                    int threeSum = nums[i] + nums[left] + nums[right];
                    if(threeSum < 0){
                        left++;
                    }
                    else if(threeSum > 0){
                        right--;
                    }
                    else{
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[left]);
                        temp.add(nums[right]);
                        res.add(temp);
                        left += 1;
                        while(nums[left] == nums[left - 1] && left < right){
                            left+=1;
                        }
                    }
                }
            }
        }
        return res;
    }
}
