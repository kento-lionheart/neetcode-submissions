class Solution {
    public int removeElement(int[] nums, int val) {
        int write = 0;
        int count = 0;
        for(int read = 0; read < nums.length; read++){
            if(nums[read] != val){
                count++;
                int temp = nums[write];
                nums[write++] = nums[read];
                nums[read] = temp;
            }
        }
        return count;
    }
}