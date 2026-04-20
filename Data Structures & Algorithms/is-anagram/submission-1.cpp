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
        map<int,int>::iterator it;
        for(it = mp2.begin(); it != mp2.end(); it++){
            if((*it).second != mp1[(*it).first]){
            	return false;
			}
        }
        for(pair<int, int> it : mp1){
            if(mp2.find(it.first) == mp2.end()){
                return false;
            }
        }
        for(pair<int, int> it: mp2){
            if(mp1.find(it.first) == mp1.end()){
                return false;
            }
        }
        return true;
}
};
