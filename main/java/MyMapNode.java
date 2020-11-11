public class MyMapNode<K, V> implements INode<K> {
    private K key;
    private V value;
    private MyMapNode<K, V> next;

    public MyMapNode(K key, V value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public void setKey(K key) {
        this.key = key;
    }

    @Override
    public INode<K> getNext() {
        return next;
    }

    @Override
    public void setNext(INode<K> next) {
        this.next = (MyMapNode<K, V>) next;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder myMapNode = new StringBuilder();
        myMapNode.append("{K=").append(key).append(" V=").append(value).append("}");
        if(next != null) {
            myMapNode.append("->").append(next);
        }
        return myMapNode.toString();
    }
}

