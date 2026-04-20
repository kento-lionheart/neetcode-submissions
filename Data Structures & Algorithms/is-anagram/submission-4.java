class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] firstString = s.toCharArray();
        char[] secondString = t.toCharArray();
        Arrays.sort(firstString);
        Arrays.sort(secondString);
        for(int i = 0; i < s.length(); i++){
            if(firstString[i] != secondString[i]){
                return false;
            }
        }
        return true;
    }
}
