class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int s = 2, f = 2;
        while(f < nums.size()){
            if(nums[f] != nums[s - 2]){
                nums[s++] = nums[f++];
            }
            else{
                while(f < nums.size() && nums[f] == nums[s - 2]){
                    f++;
                }
                if(f == nums.size()) return s;
                nums[s++] = nums[f++];
            }
        }
        return s;
    }
};