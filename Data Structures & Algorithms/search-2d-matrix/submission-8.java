class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
		int top = 0, bot = matrix.length - 1;
		int n = matrix[0].length - 1;
		while(top <= bot) {
			int m = top + (bot - top) / 2;
			if(matrix[m][0] <= target && matrix[m][n] >= target){
				return binSearch(matrix[m], target);
			}
			else if(matrix[m][0] > target) {
				bot = m - 1;
			}
			else if(matrix[m][n] < target) {
				top = m + 1;
			}
		}
		return false;
    }
	public boolean binSearch(int[] a, int target) {
		int l = 0, r = a.length - 1;
		while(l <= r) {
			int m = l + ( r- l ) / 2;
			if(a[m] == target) {
				return true;
			}
			else if(a[m] > target) {
				r = m - 1;
			}
			else {
				l = m + 1;
			}
		}
		return false;
	}
}
