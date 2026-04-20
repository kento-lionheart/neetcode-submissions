class Solution {
   public String mergeAlternately(String word1, String word2) {
		int i = 0, j = 0, n = word1.length(), m = word2.length();
		StringBuilder res = new StringBuilder();
		while(i < n && j < m) {
			res.append(word1.charAt(i));
			res.append(word2.charAt(j));
			i++; j++;
		}
		if(i == n && j == m) {
			return res.toString();
		}
		return i < n ? res.append(word1.substring(i, n)).toString()  : res.append(word2.substring(j, m)).toString();
    }
}