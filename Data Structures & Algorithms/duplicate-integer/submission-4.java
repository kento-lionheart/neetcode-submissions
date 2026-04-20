class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> temp = new HashSet<>();
        for(int x : nums){
            temp.add(x);
        }
        return temp.size() != nums.length;
    }
}