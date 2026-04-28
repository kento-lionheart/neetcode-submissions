class TimeMap {

    record Node(String value, int timestamp){}
    Map<String, List<Node>> map;
    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        map.computeIfAbsent(key, k -> new ArrayList<>())
                .add(new Node(value, timestamp));
    }
    public String get(String key, int timestamp) {
        List<Node> list = map.get(key);
        if(list == null) return "";
        int idx = binSearch(list, timestamp);
        return idx == - 1 ? "" : list.get(idx).value();
    }
    public int binSearch(List<Node> list, int target){
        int l = 0, r;
        if(list.isEmpty()){
            r = 0;
        }
        else r = list.size() - 1;
        while(l < r){
            int m = l + (r - l + 1) / 2;
            if(list.get(m).timestamp() <= target){
                l = m;
            }
            else{
                r = m - 1;
            }
        }
        return list.get(l).timestamp() <= target ? l : - 1;
    }
}
