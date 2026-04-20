class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int left = 0, right = numbers.length - 1;
        while(left < right){
            if(numbers[left] + numbers[right] < target){
                left++;
            }
            else if(numbers[left] + numbers[right] > target){
                right--;
            }
            else{
                res[0] = 1 + left;
                res[1] = 1 + right;
                 return res;
            }
        }
        return res;
    }
}
