class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int[] freqS1 = new int[128];
        int[] freqS2 = new int[128];
        int window = s1.length();
        for(char c : s1.toCharArray()){
            freqS1[c]++;
        }
        for(int i = 0; i < window; i++){
            freqS2[s2.charAt(i)]++;
        } 
        if(Arrays.equals(freqS1, freqS2)) return true;
        for(int i = window; i < s2.length(); i++){
            if(Arrays.equals(freqS1, freqS2)) return true;
            freqS2[s2.charAt(i)]++;
            freqS2[s2.charAt(i - window)]--;
            if(Arrays.equals(freqS1, freqS2)) return true;
        }
        return false;
    }
}
