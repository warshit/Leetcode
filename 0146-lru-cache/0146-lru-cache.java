// class LRUCache {
//     class Node {
//         int key, val;
//         Node prev, next;

//         Node(int k, int v) {
//             key = k;
//             val = v;
//         }
//     }
//     int cap;
//     HashMap<Integer,Node> map;
//     Node head,tail;

//     public LRUCache(int capacity) {
//         this.cap = cap;
//         map=new HashMap<>();
//         head= new Node(0,0);
//         tail = new Node(0,0);
//         head.next = tail;
//         tail.prev=head;
//     }

//     public int get(int key) {
//         if(!map.containsKey(key)) return -1;
//             Node node = map.get(key);
//             remove(node);
//             insert(node);
//             return node.val;
//     }
//      void remove(Node a){
//         if (a == head || a == tail) return;
//         a.prev.next=a.next;
//         a.next.prev=a.prev;
//     }
//      void insert(Node a){
//         a.next=head.next;
//         a.prev=head;
//         head.next.prev=a;
//         head.next=a;
//     }
//     public void put(int key, int value) {
//         if (this.cap == 0) {
//             return;
//         }
//         if(map.containsKey(key)){
//            Node a= map.get(key);
//             a.val = value;
//             remove(a);
//             insert(a);
//         }
//         else {
//             if(map.size()==cap){
//                 Node lru  = tail.prev;
//                 remove(lru);
//                 map.remove(lru.key);
//             }
//             Node newNode = new Node(key,value);
//             map.put(key,newNode);
//             insert(newNode);
            
//         }
//     }
// }

// /**
//  * Your LRUCache object will be instantiated and called as such:
//  * LRUCache obj = new LRUCache(capacity);
//  * int param_1 = obj.get(key);
//  * obj.put(key,value);
//  */


class LRUCache {
    class Node {
        int key;
        int val;
        Node prev;
        Node next;

        Node(int k, int v) {
            key = k;
            val = v;
        }
    }

    int capacity;
    HashMap<Integer, Node> map; 
    Node head, tail; 

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        head = new Node(0, 0); 
        tail = new Node(0, 0); 
        head.next = tail;
        tail.prev = head;
    }

    void remove(Node node) {
        if (node == head || node == tail) return; 
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    void insert(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1; 
        }
        Node node = map.get(key);
        remove(node);
        insert(node); 
        return node.val;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.val = value;
            remove(node);
            insert(node);
        } else {
            if (map.size() == capacity) {
                Node lruNode = tail.prev;
                remove(lruNode);
                map.remove(lruNode.key);
            }
            Node newNode = new Node(key, value);
            map.put(key, newNode);
            insert(newNode);
        }
    }
}

