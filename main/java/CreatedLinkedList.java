
public class CreatedLinkedList <K> {

    public INode last;
    public INode start;
    int size = 0;

    public CreatedLinkedList() {
        this.start = null;
        this.last = null;
    }

    public void addAtStart(INode newNode) {
        if (last == null) {
            last = newNode;
        }
        if (start == null) {
            start = newNode;
        } else {
            INode temp = start;
            this.start = newNode;
            this.start.setNext(temp);
        }
        size = size + 1;
    }

    public void addAtLast(INode newNode) {
        if (start == null) {
            start = newNode;
        }
        if (last == null) {
            last = newNode;
        } else {
            this.last.setNext(newNode);
            this.last = newNode;
        }
        size = size + 1;
    }

    public INode RemoveAtStart() {
        INode temp = this.start;
        this.start = start.getNext();
        size = size - 1;
        return temp;
    }

    public void addAtSelectedPosition(INode mySelectedNode, INode newNode) {
        INode tempNode = this.start;
        while (!tempNode.getNext().equals(mySelectedNode.getNext())) {
            tempNode = tempNode.getNext();
        }
        newNode.setNext(tempNode.getNext());
        tempNode.setNext(newNode);
        size = size + 1;
    }

    public void addAfterSearchedPosition(INode mySelectedNode, INode newNode) {
        INode tempNode = this.start;
        while (!tempNode.getNext().equals(mySelectedNode.getNext())) {
            tempNode = tempNode.getNext();
        }

        newNode.setNext(tempNode.getNext().getNext());
        tempNode.setNext(newNode);
        size = size + 1;
    }

    public int deleteAfterSearch(INode nodeToDel) {
        INode temp = this.start;
        INode previousNode = null;
        while (!temp.getNext().equals(nodeToDel.getNext())) {
            previousNode = temp;
            temp = temp.getNext();
        }

        previousNode.setNext(temp.getNext());
        temp = previousNode;
        size = size - 1;
        return size;
    }

    public INode RemoveAtLast() {

        INode temp = start;
        while (!temp.getNext().equals(last)) {
            temp = temp.getNext();
        }
        this.last = temp;
        temp = temp.getNext();
        size = size - 1;
        return temp;
    }

    public INode<K> findNode(K key) {
        INode<K> temp = this.start;
        while (temp != null) {
            if (temp.getKey().equals(key)) {
                return temp;
            }
            temp = temp.getNext();

        }
        return null;
    }

    public INode<K> remove(INode<K> node) {
        INode<K> removedNode = findNode(node.getKey());
        if(removedNode != null) {
            INode<K> tempNode = this.start;
            while(tempNode.getNext() !=  removedNode) {
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(removedNode.getNext());
            return removedNode;
        }
        else {
            System.out.println("Node can't deleted");
            return null;
        }
    }

    public void printMyNode(){
        System.out.println("My nodes" +start);
        System.out.println("Size of linked list" +size);
    }
}


