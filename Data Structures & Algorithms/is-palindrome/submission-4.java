class Solution {
    public static boolean isPalindrome(String s) {
        String temp = s.toLowerCase();
        String[] words = temp.split(" ");
        StringBuilder finalString = new StringBuilder();
        for(String x : words){
            StringBuilder word = new StringBuilder();
            for(int i = 0; i < x.length(); i++){
                char z = x.charAt(i);
                if(z >= 'a' && z <= 'z' || z >= '0' && z <= '9' ){
                    word.append(x.charAt(i));
                }
            }
            finalString.append(word);
        }
        System.out.println(finalString);
        int first = 0, last = finalString.length() - 1;
        while(first <= last){
            if(finalString.charAt(first) != finalString.charAt(last)){
                return false;
            }
            else{
                first++;
                last--;
            }
        }
        return true;
    }
}
