class Solution {
   public static int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int res = 1;
        Arrays.sort(nums);
        TreeSet<Integer> set = new TreeSet<>();
        for(int x : nums){
            set.add(x);
        }
        Integer[] array = set.toArray(new Integer[0]);
        int temp = 1;
        for(int i = 0; i < array.length - 1; i++){
            if(array[i + 1] - array[i] == 1){
                temp++;
                if(temp >= res){
                    res = temp;
                }
            }
            else{
                temp = 1;
            }

        }
        if(array.length == 1){
            return 1;
        }
        return res;
    }
}
