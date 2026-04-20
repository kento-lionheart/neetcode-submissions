class Solution {
public:
    bool isAnagram(string s, string t){
	map<int, int> mp1;
        map<int, int> mp2;
        for(int i = 0; i < s.size(); i++){
            mp1[s[i]]++;
        }
        for(int i = 0; i < t.size(); i++){
            mp2[t[i]]++;
        }
        if(s.length() != t.length()) return false;
        map<int,int>::iterator it;
        for(it = mp2.begin(); it != mp2.end(); it++){
            if((*it).second != mp1[(*it).first]){
            	return false;
			}
        }
        return true;
}
};
