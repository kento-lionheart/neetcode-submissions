class Solution {

    List<Integer> lengthVal = new ArrayList<>();
    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();
        for(String s : strs){
            str.append(s);
            lengthVal.add(s.length());
        }
        return str.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int index = 0;
        for(int i = 0; i < lengthVal.size(); i++){
            String temp = str.substring(index, index + lengthVal.get(i));
            index += lengthVal.get(i);
            res.add(temp);
        }
        return res;
    }
}
