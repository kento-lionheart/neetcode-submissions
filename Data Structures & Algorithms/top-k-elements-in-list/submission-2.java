class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        ArrayList<Integer>[] buckets = new ArrayList[nums.length + 1];

        for(int i = 0; i < nums.length + 1; i++){
            buckets[i] = new ArrayList<>();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x : nums){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            buckets[entry.getValue()].add(entry.getKey());
        }
        int[] res = new int[k];
        int index = 0;
        for(int i = buckets.length - 1; i > 0 && index < k; i--){
            for(int n : buckets[i]){
                res[index++] = n;
                if(index==k){
                    return res;
                }
            }
        }
        return res;
    }
}
