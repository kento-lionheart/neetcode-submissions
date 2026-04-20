class Solution {
   public static int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int x : nums){
            set.add(x);
        }
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            if(!set.contains(nums[i] - 1)){
                int length = 1;
                int thisNumber = nums[i];
                while(set.contains(thisNumber + 1)){
                    length++;
                    thisNumber++;
                }
                if(length >= res){
                    res = length;
                }
            }
        }
        return res;
    }
}
