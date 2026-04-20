class Solution {

    ArrayList<Integer> myArray = new ArrayList<>();
    
    public String encode(List<String> strs) {
        StringBuilder stringBuilder = new StringBuilder();
        myArray.clear(); // Reset for each encode call
        
        for (String x : strs) {
            myArray.add(x.length());
            stringBuilder.append(x);
        }
        
        return stringBuilder.toString();
    }

    public List<String> decode(String str) {
        List<String> arr = new ArrayList<>();
        int index = 0;
        
        for (int x : myArray) {
            String s = str.substring(index, index + x);
            arr.add(s);
            index += x;
        }
        
        return arr;
    }
}
