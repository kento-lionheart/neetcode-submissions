class Solution {
public:
    bool validWordAbbreviation(string word, string abbr) {
        int p1 = 0, p2 = 0;
        while(p1 < abbr.size()){
            if(!isdigit(abbr[p1])){
                if(abbr[p1] != word[p2]){
                    return false;
                }
                else{
                    p2++;
                    p1++;
                }
            }
            else{
                if(abbr[p1] == '0'){
                    return false;
                }
                string temp;
                while(p1 < abbr.size() && isdigit(abbr[p1])){
                    temp += abbr[p1];
                    p1++;
                }
                p2 += stoi(temp);
                if(p2 > word.size()) return false;
            }
        }   
        return true;
    }
};