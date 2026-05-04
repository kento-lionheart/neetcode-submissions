class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int count = 0;
        Arrays.sort(people);
        int l = 0, r = people.length - 1;
        while(l <= r){
            if(l == r){
                return ++ count;
            }
            if(people[l] + people[r] <= limit){
                count++;
                l++; r--;
            }
            else{
                count++;
                r--;
            }
        }
        return count;
    }
}