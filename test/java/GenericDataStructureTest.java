import org.junit.Assert;
import org.junit.Test;

public class GenericDataStructureTest {

    @Test
    public void provideThreeNumber_WhenLinked_shouldTestCasePassed() {
        MyNode<Integer> newFNode = new MyNode<>(56);
        MyNode<Integer> newSNode = new MyNode<>(30);
        MyNode<Integer> newTNode = new MyNode<>(70);
        newFNode.setNext(newSNode);
        newSNode.setNext(newTNode);
        boolean result = newFNode.getNext().equals(newSNode) &&
                newSNode.getNext().equals(newTNode);

        Assert.assertTrue(result);
    }

    @Test
    public void provideThreeNumber_WhenAddedToTop_ShouldTestCasePassed()
    {
        MyNode<Integer> newFNode = new MyNode<>(30);
        MyNode<Integer> newSNode = new MyNode<>(56);
        MyNode<Integer> newTNode = new MyNode<>(70);
        CreatedLinkedList myCreatedLinkList = new CreatedLinkedList();
        myCreatedLinkList.addAtStart(newFNode);
        myCreatedLinkList.addAtStart(newSNode);
        myCreatedLinkList.addAtStart(newTNode);

        boolean isLinkedListCreated = myCreatedLinkList.start.equals(newTNode) &&
                myCreatedLinkList.start.getNext().equals(newSNode) &&
                myCreatedLinkList.last.equals(newFNode);
        Assert.assertTrue(isLinkedListCreated);
    }


    @Test
    public void provideThreeNumber_WhenNotAddedToTop_ShouldReturnFalse()
    {
        MyNode<Integer> newFNode = new MyNode<>(30);
        MyNode<Integer> newSNode = new MyNode<>(56);
        MyNode<Integer> newTNode = new MyNode<>(70);
        CreatedLinkedList myCreatedLinkList = new CreatedLinkedList();
        myCreatedLinkList.addAtStart(newFNode);
        myCreatedLinkList.addAtStart(newSNode);
        myCreatedLinkList.addAtStart(newTNode);

        boolean isLinkedListCreated = myCreatedLinkList.start.equals(newTNode) &&
                myCreatedLinkList.start.getNext().equals(newSNode) &&
                myCreatedLinkList.last.equals(newSNode);
        Assert.assertFalse(isLinkedListCreated);
    }

    @Test
    public void provideThreeNumber_WhenAddedToLast_ShouldReturnTrue()
    {
        MyNode<Integer> newFNode = new MyNode<>(56);
        MyNode<Integer> newSNode = new MyNode<>(30);
        MyNode<Integer> newTNode = new MyNode<>(70);
        CreatedLinkedList myCreatedLinkList = new CreatedLinkedList();
        myCreatedLinkList.addAtLast(newFNode);
        myCreatedLinkList.addAtLast(newSNode);
        myCreatedLinkList.addAtLast(newTNode);

        boolean isLinkedListCreated = myCreatedLinkList.start.equals(newFNode) &&
                myCreatedLinkList.start.getNext().equals(newSNode) &&
                myCreatedLinkList.last.equals(newTNode);
        Assert.assertTrue(isLinkedListCreated);
    }

    @Test
    public void provideThreeNumber_WhenNotAddedToLast_ShouldReturnFalse()
    {
        MyNode<Integer> newFNode = new MyNode<>(56);
        MyNode<Integer> newSNode = new MyNode<>(30);
        MyNode<Integer> newTNode = new MyNode<>(70);
        CreatedLinkedList myCreatedLinkList = new CreatedLinkedList();
        myCreatedLinkList.addAtLast(newFNode);
        myCreatedLinkList.addAtLast(newSNode);
        myCreatedLinkList.addAtLast(newTNode);

        boolean isLinkedListCreated = myCreatedLinkList.start.equals(newTNode) &&
                myCreatedLinkList.start.getNext().equals(newSNode) &&
                myCreatedLinkList.last.equals(newFNode);
        Assert.assertFalse(isLinkedListCreated);
    }

    @Test
    public void provideThreeNumber_WhenAddedToUserPosition_ShouldReturnTrue()
    {
        MyNode<Integer> newFNode = new MyNode<>(56);
        MyNode<Integer> newSNode = new MyNode<>(70);
        MyNode<Integer> nodeToInsert = new MyNode<>(30);
        CreatedLinkedList myCreatedLinkList = new CreatedLinkedList();
        myCreatedLinkList.addAtStart(newFNode);
        myCreatedLinkList.addAtLast(newSNode);

        myCreatedLinkList.addAtSelectedPosition(newFNode, nodeToInsert);

        boolean isLinkedListCreated = myCreatedLinkList.start.equals(newFNode) &&
                myCreatedLinkList.start.getNext().equals(nodeToInsert) &&
                myCreatedLinkList.last.equals(newSNode);
        Assert.assertTrue(isLinkedListCreated);
    }

    @Test
    public void deleteStartNumber_WhenStartWillBeDeleted_TestCaseShouldPass()
    {
        MyNode<Integer> newFNode = new MyNode<>(56);
        MyNode<Integer> newSNode = new MyNode<>(30);
        MyNode<Integer> newTNode = new MyNode<>(70);
        CreatedLinkedList myCreatedLinkList = new CreatedLinkedList();
        myCreatedLinkList.addAtLast(newFNode);
        myCreatedLinkList.addAtLast(newSNode);
        myCreatedLinkList.addAtLast(newTNode);

        myCreatedLinkList.RemoveAtStart();

        boolean isLinkedListCreated =myCreatedLinkList.start.equals(newSNode) &&
                myCreatedLinkList.last.equals(newTNode);
        Assert.assertTrue(isLinkedListCreated);
    }

    @Test
    public void deleteStartNumber_WhenStartWillNotBeDeleted_TestShouldReturnFalse()
    {
        MyNode<Integer> newFNode = new MyNode<>(56);
        MyNode<Integer> newSNode = new MyNode<>(30);
        MyNode<Integer> newTNode = new MyNode<>(70);
        CreatedLinkedList myCreatedLinkList = new CreatedLinkedList();
        myCreatedLinkList.addAtLast(newFNode);
        myCreatedLinkList.addAtLast(newSNode);
        myCreatedLinkList.addAtLast(newTNode);

        myCreatedLinkList.RemoveAtStart();

        boolean isLinkedListCreated =myCreatedLinkList.start.equals(newFNode) &&
                myCreatedLinkList.start.getNext().equals(newSNode) &&
                myCreatedLinkList.last.equals(newSNode);
        Assert.assertFalse(isLinkedListCreated);
    }

    @Test
    public void deleteLastNumber_WhenLastWillBeDeleted_TestCaseShouldPass()
    {
        MyNode<Integer> newFNode = new MyNode<>(56);
        MyNode<Integer> newSNode = new MyNode<>(30);
        MyNode<Integer> newTNode = new MyNode<>(70);
        CreatedLinkedList myCreatedLinkList = new CreatedLinkedList();
        myCreatedLinkList.addAtLast(newFNode);
        myCreatedLinkList.addAtLast(newSNode);
        myCreatedLinkList.addAtLast(newTNode);

        myCreatedLinkList.RemoveAtLast();

        boolean isLinkedListCreated =myCreatedLinkList.start.equals(newFNode) &&
                myCreatedLinkList.last.equals(newSNode);
        Assert.assertTrue(isLinkedListCreated);
    }

    @Test
    public void provideNode_whenSearchNumber_ShouldReturnTrue()
    {
        MyNode<Integer> newFNode = new MyNode<>(56);
        MyNode<Integer> newSNode = new MyNode<>(30);
        MyNode<Integer> newTNode = new MyNode<>(70);
        CreatedLinkedList myCreatedLinkList = new CreatedLinkedList();
        myCreatedLinkList.addAtLast(newFNode);
        myCreatedLinkList.addAtLast(newSNode);
        myCreatedLinkList.addAtLast(newTNode);

        INode isNodeFound = myCreatedLinkList.findNode(30);

        myCreatedLinkList.printMyNode();
        System.out.println(isNodeFound);
        Assert.assertEquals(newSNode, isNodeFound);
    }

    @Test
    public void provideNumber_ShouldAddAfter_WhenAddedTestCaseShouldPassed()
    {
        MyNode<Integer> newFNode = new MyNode<>(56);
        MyNode<Integer> newSNode = new MyNode<>(30);
        MyNode<Integer> newTNode = new MyNode<>(70);
        MyNode<Integer> newNodeToAdd = new MyNode<>(40);
        CreatedLinkedList myCreatedLinkList = new CreatedLinkedList();
        myCreatedLinkList.addAtLast(newFNode);
        myCreatedLinkList.addAtLast(newSNode);
        myCreatedLinkList.addAtLast(newTNode);

        myCreatedLinkList.addAfterSearchedPosition(newSNode, newNodeToAdd);
        boolean isLinkedListCreated =myCreatedLinkList.start.equals(newFNode) &&
                myCreatedLinkList.start.getNext().equals(newSNode) &&
                myCreatedLinkList.start.getNext().getNext().equals(newNodeToAdd) &&
                myCreatedLinkList.last.equals(newTNode);
        Assert.assertTrue(isLinkedListCreated);
    }

    @Test
    public void provideNumber_ShouldNotAddAfter_WhenAddedTestCaseShouldPassed()
    {
        MyNode<Integer> newFNode = new MyNode<>(56);
        MyNode<Integer> newSNode = new MyNode<>(30);
        MyNode<Integer> newTNode = new MyNode<>(70);
        MyNode<Integer> newNodeToAdd = new MyNode<>(40);
        CreatedLinkedList myCreatedLinkList = new CreatedLinkedList();
        myCreatedLinkList.addAtLast(newFNode);
        myCreatedLinkList.addAtLast(newSNode);
        myCreatedLinkList.addAtLast(newTNode);

        myCreatedLinkList.addAfterSearchedPosition(newSNode, newNodeToAdd);

        boolean isLinkedListCreated =myCreatedLinkList.start.equals(newFNode) &&
                myCreatedLinkList.start.getNext().equals(newSNode) &&
                myCreatedLinkList.start.getNext().getNext().equals(newTNode) &&
                myCreatedLinkList.last.equals(newTNode);
        Assert.assertFalse(isLinkedListCreated);
    }

    @Test
    public void provideKey_ShouldDeleteAfter_WhenDeletedTestCaseShouldPassed()
    {
        MyNode<Integer> newFNode = new MyNode<>(56);
        MyNode<Integer> newSNode = new MyNode<>(30);
        MyNode<Integer> newTNode = new MyNode<>(70);
        MyNode<Integer> newNodeToDelete = new MyNode<>(40);
        CreatedLinkedList myCreatedLinkList = new CreatedLinkedList();
        myCreatedLinkList.addAtLast(newFNode);
        myCreatedLinkList.addAtLast(newSNode);
        myCreatedLinkList.addAtLast(newNodeToDelete);
        myCreatedLinkList.addAtLast(newTNode);

        myCreatedLinkList.printMyNode();

        int linkedSize = myCreatedLinkList.deleteAfterSearch(newNodeToDelete);

        myCreatedLinkList.printMyNode();

//        boolean isLinkedListCreated =myCreatedLinkList.start.equals(newFNode) &&
//                myCreatedLinkList.start.getNext().equals(newSNode) &&
//                myCreatedLinkList.start.getNext().getNext().equals(newTNode);
//        Assert.assertTrue(isLinkedListCreated);
        Assert.assertEquals(3, linkedSize);
    }

    @Test
    public void provideInvalidKey_ShouldNotDelete_TestCaseShouldPassed()
    {
        MyNode<Integer> newFNode = new MyNode<>(56);
        MyNode<Integer> newSNode = new MyNode<>(30);
        MyNode<Integer> newTNode = new MyNode<>(70);
        MyNode<Integer> newNodeToDelete = new MyNode<>(40);
        CreatedLinkedList myCreatedLinkList = new CreatedLinkedList();
        myCreatedLinkList.addAtLast(newFNode);
        myCreatedLinkList.addAtLast(newSNode);
        myCreatedLinkList.addAtLast(newNodeToDelete);
        myCreatedLinkList.addAtLast(newTNode);

        myCreatedLinkList.printMyNode();

        int linkedSize = myCreatedLinkList.deleteAfterSearch(newNodeToDelete);

        myCreatedLinkList.printMyNode();

//        boolean isLinkedListCreated =myCreatedLinkList.start.equals(newFNode) &&
//                myCreatedLinkList.start.getNext().equals(newSNode) &&
//                myCreatedLinkList.start.getNext().getNext().equals(newTNode);
//        Assert.assertTrue(isLinkedListCreated);
        Assert.assertNotEquals(4, linkedSize);
    }
}
