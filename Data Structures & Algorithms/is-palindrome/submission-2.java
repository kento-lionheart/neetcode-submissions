class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String[] words = s.split("\\s+");
        StringBuilder temp1 = new StringBuilder();
        for(String x : words){
            for(int i = 0; i < x.length(); i++){
                char temp = x.charAt(i);
                if(temp >= 'a' && temp <= 'z' || temp >= '0' && temp <= '9'){
                    temp1.append(x.charAt(i));
                }
            }
        }
        StringBuilder temp2 = new StringBuilder();
        for(int i = words.length - 1; i >= 0; i--){
            for(int j = words[i].length() - 1; j >= 0; j--){
                char temp = words[i].charAt(j);
                if(temp >= 'a' && temp <= 'z' || temp >= '0' && temp <='9'){
                    temp2.append(words[i].charAt(j));
                }
            }
        }
        return temp1.toString().equals(temp2.toString());
    }
}
