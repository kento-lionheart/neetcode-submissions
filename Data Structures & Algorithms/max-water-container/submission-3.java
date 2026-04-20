class Solution {
    public int maxArea(int[] heights){
        int res = -1;
        int left = 0, right = heights.length - 1;
        while(left < right){
            res = Math.max(res, Math.min(heights[left], heights[right]) * (right - left));
            if(heights[left] < heights[right]){
                left++;
            }
            else if(heights[left] > heights[right]){
                right--;
            }
            else{
                if(heights[left + 1] > heights[right - 1]){
                    left++;
                }
                else{
                    right--;
                }
            }
            
        }
        return res;
    }
}
