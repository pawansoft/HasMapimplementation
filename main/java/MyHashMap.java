import java.util.ArrayList;

public class MyHashMap<K, V> {
    private final int numBuckets;
    ArrayList<CreatedLinkedList<K>> myBucket;

    CreatedLinkedList<K> myLinkedList;

    public MyHashMap() {
        this.numBuckets = 10;
        this.myBucket = new ArrayList<>(numBuckets);
        for (int i = 0; i < numBuckets; i++){
            this.myBucket.add(null);
        }
    }

    public V get(K key) {
        int index = this.getBucketIndex(key);
        CreatedLinkedList<K> linkedList = this.myBucket.get(index);
        if(linkedList == null){
            return null;
        }
        MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) linkedList.findNode(key);
       if(myMapNode == null){
           return null;
       }
       else {
           return myMapNode.getValue();
       }
    }

    private int getBucketIndex(K key) {
        int hasCode = Math.abs(key.hashCode());
        int index = hasCode % numBuckets;
        return index;
    }

    public void add(K key, V value) {
        int index = this.getBucketIndex(key);
        CreatedLinkedList<K> linkedList = this.myBucket.get(index);
        if(linkedList == null){
            linkedList = new CreatedLinkedList<>();
            this.myBucket.set(index, linkedList);
        }
        MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) linkedList.findNode(key);
        if(myMapNode == null){
            myMapNode = new MyMapNode<K, V>(key, value);
            linkedList.addAtLast(myMapNode);
        }else {
            myMapNode.setValue(value);
        }
    }

    public V delete(K key){
        int index = this.getBucketIndex(key);
        CreatedLinkedList<K> linkedList = this.myBucket.get(index);
        if(linkedList == null){
            return null;
        }
        MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) linkedList.findNode(key);
        if (myMapNode == null){
            return null;
        }
        else {
            linkedList.remove(myMapNode);
            return myMapNode.getValue();
        }
    }

    @Override
    public String toString() {
        return " " + myBucket + " ";
    }
}
