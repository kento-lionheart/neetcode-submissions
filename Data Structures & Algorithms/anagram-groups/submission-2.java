class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            int[] temp = new int[26];
            for(int j = 0; j < strs[i].length(); j++){
                temp[strs[i].charAt(j) - 'a']++;
            }
            String key = Arrays.toString(temp);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
                map.get(key).add(strs[i]);
            }
            else{
                map.get(key).add(strs[i]);
            }
        }
        return new ArrayList<>(map.values());
    }
}
