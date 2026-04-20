class Solution {
    public int maxArea(int[] height) {
        int l= 0 , r = height.length - 1;
        int res = 0;
        while(l < r) {
        	int curArea = area(height[l], height[r], l, r);
        	res = Math.max(res, curArea);
        	if(height[l] < height[r]) {
        		l++;
        	}
        	else {
        		r--;
        	}
        }
        return res;
    }
	public int area(int height1, int height2, int index1, int index2) {
		int delta = Math.abs(index2- index1);
		return Math.min(height1, height2) * delta;
	}
}
