class LRUCache {
    Node head = new Node(0,0);
    Node tail = new Node(0,0);
    Map<Integer,Node> map = new HashMap<>();
    int capacity;
    public LRUCache(int capacity) {
         this.capacity = capacity;
         head.next = tail;
         tail.prev = head;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            remove(node);
            insert(node);
        }
        else{
            return -1;
        }
        return map.get(key).value;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            remove(map.get(key));
        }
        if(map.size() == capacity){
            remove(tail.prev);
        }
        insert(new Node(key,value));
    }
    public void remove(Node node){
        map.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    public void insert(Node node){
       map.put(node.key, node);
        node.next = head.next;
        node.prev = head;
        head.next = node;
        node.next.prev = node;
    }
}
class Node{
    Node prev, next;
    int key;
    int value;
    public Node(int key, int value){
        this.key = key;
        this.value = value;
    }
}