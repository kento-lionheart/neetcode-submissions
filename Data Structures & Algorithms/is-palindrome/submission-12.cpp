class Solution {
public:
    bool isPalindrome(string s) {
        string temp;
        for(int i = 0; i < s.length() ; i++){
            if(isalnum(s[i])){
                temp += tolower(s[i]);
            }
        }
        int l = 0, r = temp.length() - 1;
        while(l < r){
            if(temp[l] != temp[r]){
                return false;
            }
            l++; r--;
        }
        return true;
    }
};
