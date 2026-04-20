class Solution {
    public int compress(char[] chars) {
        int slow = 1;
		int fast = 1;
		while(fast < chars.length) {
			int index = fast;
			while(fast < chars.length && chars[fast] == chars[slow - 1]) {
				fast++;
			}
			if(fast - index == 0) {
				chars[slow++] = chars[fast];
			}
			else {
				String total = Integer.toString(fast - index + 1);
				for(int i = 0; i < total.length(); i++) {
					chars[slow++] = total.charAt(i);
				}
                if(fast < chars.length){
                    chars[slow++] = chars[fast];
                }
			}
			
			fast++;
		}
		return slow;
    }
}