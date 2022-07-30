package tutort.hashTable;

public class Hashtable {
    private HashNode[] buckets;
    private int numOfBuckets;// capacity
    private int size;// num of key, value pairs in hashtable or no. of hash nodes in hashtable

    public Hashtable(int capacity) {
        this.numOfBuckets = capacity;
        this.buckets = new HashNode[numOfBuckets];
        this.size = 0;
    }


    private class HashNode {
        private Integer key;// can be generic type
        private String value;// can be generic type
        private HashNode next;

        public HashNode(Integer key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void put(Integer key, String value) {
        if (key == null || value == null) {
            throw new IllegalArgumentException("key or Value is null!");
        }
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        while(head != null) {
            if(head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }
        size++;
        head = buckets[bucketIndex];
        HashNode node = new HashNode(key,value);
        node.next = head;
        buckets[bucketIndex] = node;
    }

    public String get(Integer key) {
        if (key == null) {
            throw new IllegalArgumentException("key is null!");
        }
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        while(head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    public String remove(Integer key) {
        if (key == null) {
            throw new IllegalArgumentException("key is null!");
        }
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];// ex:: (21, "Tom") -> (31, "Ram") -> (41, "Sam") -> null
        HashNode prev = null;
        while(head != null) {
            if(head.key.equals(key)) {
                break;
            }
            prev = head;
            head = head.next;
        }
        if(head == null) {
            return null;
        }
        size--;
        if (prev != null) {// removing the node in middle of chains in bucket
            prev.next = head.next;
        } else {
            buckets[bucketIndex] = head.next;// removing the first node in bucket
        }
        return head.value;
    }

    private int getBucketIndex(Integer key) {
        return key % numOfBuckets;// buckets.length
    }


    public static void main(String[] args) {
        Hashtable table = new Hashtable(10);
        table.put(105, "John");
        table.put(21, "Tom");
        table.put(31, "Sana");
        table.put(21, "Mary");
        System.out.println(table.size());

        System.out.println(table.get(21));
        System.out.println(table.get(90));

        System.out.println(table.remove(21));
        System.out.println(table.size());
    }
}
