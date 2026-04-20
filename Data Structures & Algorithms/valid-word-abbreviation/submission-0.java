class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int n = word.length() - 1, m = abbr.length() - 1;
		int s1 = 0, s2 = 0;
        String temp = "";
        while(s1 < word.length() && s2 < abbr.length()) {
        	Character c1 = word.charAt(s1), c2 = abbr.charAt(s2);
        	if(Character.isAlphabetic(c2)) {
        		if(c1 != c2) {
        			return false;
        		}
        		++s1;++s2;
        	}
        	else {
        		if(c2 == '0') {
        			return false;
        		}
        		int start = s2;
        		while(s2 <= m && Character.isDigit(abbr.charAt(s2))) {
        			s2++;
        		}
        		int skip = Integer.parseInt(abbr.substring(start, s2));
        		s1 += skip;
        	}
        	
        }
        return s1== n + 1 && s2 == m + 1;
    }
}