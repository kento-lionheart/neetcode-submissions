class Solution {
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < nums.length ; i++){
            if(!hashMap.containsKey(nums[i])){
                hashMap.put(nums[i], 1);
            }
            else{
                hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
            }
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()){
            arr.add(entry.getValue());
        }
        Collections.sort(arr, Collections.reverseOrder());
        int bigger = arr.get(k - 1);
        int[] res = new int[k];
        ArrayList<Integer> res2 = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()){
            if(entry.getValue() != 0 && entry.getValue() >= bigger){
                res2.add(entry.getKey());
                entry.setValue(0);
            }
        }
        for(int i = 0; i < k; i++){
            res[i] = res2.get(i);
        }
        return res;
    }
}
