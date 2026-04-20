class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length - k + 1];
        int l = 0, r = 0;
        Deque<Integer> dq = new LinkedList<>();
        while(r < nums.length){
            while(!dq.isEmpty() && nums[dq.getLast()] < nums[r]){
                dq.removeLast();
            }
            dq.addLast(r);
            if(l > dq.getFirst()){
                dq.removeFirst();
            }
            if(r + 1 >= k){
                res[l] = nums[dq.getFirst()];
                l++;
            }
            r++;
        }
        return res;
    }
}
