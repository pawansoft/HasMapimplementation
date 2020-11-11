public class MyNode<K> implements INode<K>{
    private K key;
    private INode<K> next;

    public MyNode(K key) {
        this.setKey(key);
        this.setNext(null);
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public INode<K> getNext() {
        return next;
    }

    public void setNext(INode<K> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder linkedListString = new StringBuilder();
        linkedListString.append(key);
        if(next != null)
            linkedListString.append("->").append(next);
        return linkedListString.toString();
    }

}
