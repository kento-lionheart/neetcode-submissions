class Solution {
public:
    bool validPalindrome(string s) {
        string temp;
        for(int i = 0; i < s.length() ; i++){
            if(isalnum(s[i])){
                temp += tolower(s[i]);
            }
        }
        int l = 0, r = temp.length() - 1;
        while(l < r){
            if(temp[l] != temp[r]){
                string s1 = temp.substr(l, r - l);
                string s2 = temp.substr(l + 1, r - l);
                bool res = helper(s1);
                res == false ? res = helper(s2) : res;
                return res;
            }
            l++; r--;
        }
        return true;
}
    bool helper(string s){
        int l = 0, r = s.length() - 1;
        while(l< r){
            if(s[l] != s[r]){
                return false;
            }
            l++; r--;
        }
        return true;
    }
};