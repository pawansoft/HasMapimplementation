public class MyHashMap<K, V> {

    CreatedLinkedList<K> myLinkedList;

    public MyHashMap() {
        this.myLinkedList = new CreatedLinkedList<>();
    }

    public V get(K key) {
        MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.myLinkedList.findNode(key);
        if(myMapNode == null){
            return null;
        }else {
            return myMapNode.getValue();
        }
    }

    public void add(K key, V value) {
        MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.myLinkedList.findNode(key);
        if(myMapNode == null){
            myMapNode = new MyMapNode<K, V>(key, value);
            this.myLinkedList.addAtLast(myMapNode);
        }else {
            myMapNode.setValue(value);
        }
    }

    public void printMyMap() {
        myLinkedList.printMyNode();
    }
}
