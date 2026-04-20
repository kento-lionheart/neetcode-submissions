class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int n = word.length(), m = abbr.length();
        int i = 0, j = 0;
        while(i < n && j < m){
            Character c1 = word.charAt(i), c2 = abbr.charAt(j);
            if(Character.isAlphabetic(c2)) {
            	if(c1 != c2) {
            		return false;
            	}
            	++i; ++j;
            }
            else {
            	if(c2 == '0') {
            		return false;
            	}
            	int start = j;
            	while(j < abbr.length() && Character.isDigit(abbr.charAt(j))) {
            		j++;
            	}
            	int skip = Integer.parseInt(abbr.substring(start, j));
            	i += skip;
            }
        }
        return i == n && j == m;
    }
}