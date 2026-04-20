class Solution {
    ArrayList<Integer> pos = new ArrayList<>();
    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < strs.size(); i++) {
            res.append(strs.get(i));
            pos.add(strs.get(i).length());
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int curIndex = 0;
        for(int x : pos){
            StringBuilder temp = new StringBuilder();
            for(int i = 0; i < x; i++){
                if(curIndex + i < str.length()) temp.append(str.charAt(curIndex + i));
                
            }
            res.add(temp.toString());
            curIndex += x;
        }
        return res;
    }
}
