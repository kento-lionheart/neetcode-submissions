class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int top = 0, bottom = matrix.length - 1;
        int numLength = matrix[0].length - 1;
        while(top <= bottom) {
        	int m = top + (bottom - top) / 2;
        	if(matrix[m][0] <= target && matrix[m][numLength] >= target) {
        		return binSearch(matrix[m], target);
        	}
        	else if(matrix[m][numLength] < target) {
        		top = m + 1;
        	}
        	else if(matrix[m][0] > target) {
        		bottom = m - 1;
        	}
        }
        return false;
    }
	public boolean binSearch(int[] a, int target) {
		int l = 0, r = a.length - 1;
		while(l <= r) {
			int m = l + (r - l) / 2;
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
