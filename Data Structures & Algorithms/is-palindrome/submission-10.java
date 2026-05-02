class Solution {
    public static boolean isPalindrome(String s) {
        s = helper(s);
        int l = 0, r = s.length() - 1;
        while(l <= r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;r--;
        }
        return true;
    }
    public static String helper(String s){
        StringBuilder res = new StringBuilder();

        for(char c : s.toCharArray()){
            if(Character.isAlphabetic(c) || Character.isDigit(c)){
                res.append(Character.toLowerCase(c));
            }
        }
        return res.toString();
    }
}
