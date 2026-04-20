class Solution {
    public boolean isPalindrome(String s) {
		String temp = helper(s);
		int l = 0, r = temp.length() - 1;
		while(l <= r) {
			if(temp.charAt(l) != temp.charAt(r)) {
				return false;
			}
			l++;r--;
		}
		return true;
    }
	String helper(String s) {
		StringBuilder temp = new StringBuilder();
		for(char c : s.toCharArray()) {
			if(Character.isLetter(c)) {
				temp.append(Character.toLowerCase(c));
			}
			else if(Character.isDigit(c)) {
				temp.append(c);
			}
		}
		return temp.toString();		
	}
}
