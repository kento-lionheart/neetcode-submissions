class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] temp = s.toCharArray();
            Arrays.sort(temp);
            String sortedOne = new String(temp);
            if(!map.containsKey(sortedOne)){
                List<String> listTemp = new ArrayList<>();
                listTemp.add(s);
                map.put(sortedOne, listTemp);
            }
            else{
                map.get(sortedOne).add(s);
            }
        }
        for(Map.Entry<String, List<String>> entry : map.entrySet()){
            res.add(entry.getValue());
        }
        return res;
    }
}
