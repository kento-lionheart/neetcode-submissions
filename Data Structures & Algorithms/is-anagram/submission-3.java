class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char x = s.charAt(i);
            if(map.get(x) == null){
                map.putIfAbsent(x, 1);
            }
            else map.put(x, map.get(x) + 1);
        }
        for(int i = 0; i < t.length(); i++){
            char x = t.charAt(i);
            if(map.get(x) == null){
                return false;
            }
            else{
                map.put(x, map.get(x) - 1);
            }
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() != 0){
                return false;
            }
        }
        return true;
    }
}
