class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
		Arrays.sort(nums);
		for(int i = 0; i < nums.length - 2; i++) {
			if(i > 0  && nums[i] == nums[i - 1]) continue;
            int temp = i + 1;
			for(int j = i + 1; j < nums.length - 1; j++) {
				if(j != temp && nums[j] == nums[j - 1]) continue;
				int l = j + 1, r = nums.length - 1;
				while(l < r) {
					long sum = (long)nums[i] + nums[j] + nums[l] + nums[r];
					if(sum > target) {
						--r;
					}
					else if(sum < target) {
						++l;
					}
					else {
						res.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
						++l; --r;
						while(l < r && nums[l] == nums[l - 1]) {
							l++;
						}
					}
				}
			}
		}
		return res;
    }
}