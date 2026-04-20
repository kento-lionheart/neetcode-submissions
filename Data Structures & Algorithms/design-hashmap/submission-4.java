class MyHashMap {
class Node{
        int k;
        int v;
        Node(int k, int v){
            this.k = k;
            this.v = v;
        }
    }
    Node[] table;
    public MyHashMap() {
        this.table = new Node[10000000];
    }

    public void put(int key, int value) {
        int index = Integer.hashCode(key);
        Node node = new Node(key, value);
        table[index] = node;
    }

    public int get(int key) {
        int index = Integer.hashCode(key);
        return table[index] == null ? -1 : table[index].v; 
    }

    public void remove(int key) {
        table[Integer.hashCode(key)] = null;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */