class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // freq
        Map<Integer, Integer> map = new HashMap<>();
        for(int x : nums){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        // find k most freq
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            arrayList.add(entry.getValue());
        }
        arrayList.sort(Collections.reverseOrder());
        ArrayList<Integer> sortedMost = new ArrayList<>();
        for(int i = 0; i < k; i++){
            sortedMost.add(arrayList.get(i));
        }
        // find the number
        int[] res = new int[k];
        ArrayList<Integer> res2 = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(sortedMost.contains(entry.getValue())){
                res2.add(entry.getKey());
            }
        }
        for(int i = 0; i <k ;i++){
            res[i] = res2.get(i);
        }
        return res;
    }
}
