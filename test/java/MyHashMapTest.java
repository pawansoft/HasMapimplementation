import org.junit.Assert;
import org.junit.Test;

public class MyHashMapTest {
    @Test
    public void provideSentence_WhenWordAddedToList_ShouldReturnFrequency()
    {
        String sentence = "to be or not to be";
        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
        String [] words = sentence.toLowerCase().split(" ");
        for (String word : words){
            Integer value = myHashMap.get(word);
            if(value == null) {
                value = 1;
            }
            else {
                value = value + 1;
            }
            myHashMap.add(word, value);
        }
        int frequency = myHashMap.get("to");
        myHashMap.printMyMap();
        Assert.assertEquals(2, frequency);
    }
}
