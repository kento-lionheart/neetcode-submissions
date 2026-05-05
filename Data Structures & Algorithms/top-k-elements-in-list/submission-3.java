class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for(int x : nums){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        List<Integer>[] count = new List[nums.length + 1];
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(count[entry.getValue()] == null){
                List<Integer> temp = new ArrayList<>(List.of(entry.getKey()));
                count[entry.getValue()] = temp;
            }
            else{
                count[entry.getValue()].add(entry.getKey());
            }
        }
        int index = 0;
        for(int i = count.length - 1; i >= 1; i--){
            if(count[i] != null){
                List<Integer> temp = count[i];
                for(int x : temp){
                    if(k > 0){
                        k--;
                    }
                    else{
                        return res;
                    }
                    res[index++] = x;
                }
            }
        }

        return res;
    }
}
