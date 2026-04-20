class Solution {
    public boolean validPalindrome(String s) {
		int l = 0, r = s.length() - 1;
		boolean res = true;
		while(l <= r) {
			if(s.charAt(l) != s.charAt(r)) {
				res = isValid(s.substring(l, r));
				return res == false ? isValid(s.substring(l + 1, r + 1)) : res;
			}
			l++; r--;
		}
		return res;
    }
	boolean isValid(String s) {
		int l = 0, r = s.length() - 1;
		while(l <= r) {
			if(s.charAt(l) != s.charAt(r)) return false;
			l++; r--;
		}
		return true;
	}
}