class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int s1 = 0, s2 = 0;
		while(s1 < word.length() && s2 < abbr.length()) {
			char temp1 = word.charAt(s1);
			char temp2 = abbr.charAt(s2);
			if(Character.isAlphabetic(temp2)) {
				if(temp1 != temp2) {
					return false;
				}
				s1++;s2++;
			}
			else {
				if(temp2 == '0') return false;
				int first = s2;
				while(s2 < abbr.length() && Character.isDigit(abbr.charAt(s2))) {
					s2++;
				}
				int jump = Integer.parseInt(abbr.substring(first,s2));
				s1 += jump;
			}
		}
		return s1 == word.length() && s2 == abbr.length();
    }
}