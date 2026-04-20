class Solution {
   public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            hashMap.put(numbers[i], i);
        }
        for (int i = 0; i < numbers.length; i++) {
            if (hashMap.containsKey(target - numbers[i])) {
                res[1] = i + 1;
                res[0] = hashMap.get(target - numbers[i]) + 1;
            }
        }
        return res;
    }
}
