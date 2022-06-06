//Declare the node class
class Node{
    
    int key , value;
    Node prev;
    Node next;
    
    public Node(int key , int value){
        
        this.key = key;
        this.value = value;
        
    }
}
class LRUCache {
    
    //Declare DS for the LRU Cache
    Node head = new Node(0 , 0);
    Node tail = new Node(0 , 0);
    
    
    Map<Integer , Node> dict = new HashMap<>();
    int capacity;
    
    public LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(dict.containsKey(key)){
            Node node = dict.get(key);
            delete(node);
            insert(node);
            return node.value;
        }
        else return -1;
    }
    
    public void put(int key, int value) {
        Node node = new Node(key , value);
        if(dict.containsKey(key)) delete(dict.get(key));
        if(dict.size() == capacity) delete(tail.prev);
        
            
        insert(node);
    }
    
    public void insert(Node node){
        dict.put(node.key , node);
        node.next = head.next;
        head.next.prev=node;
        head.next = node;
        node.prev = head;
        
    }
    public void delete(Node node){
        dict.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */