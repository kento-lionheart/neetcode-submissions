class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0, res = 1;
        int[] count = new int[26];
        for(int r = 0; r < s.length(); r++) {
            count[s.charAt(r) - 'A']++;
        	int max = maxCount(count);
        	while(r - l + 1 - max > k) {
        		count[s.charAt(l) - 'A']--;
        		l++;
        	}
        	res = Math.max(r - l + 1, res);
        }
        return res;
    }
	public int maxCount(int[] ar) {
		int res = 0;
		for(int x : ar) {
			res = Math.max(res, x);
		}
		return res;
	}
}
