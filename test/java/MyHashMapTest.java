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
        Assert.assertEquals(2, frequency);
    }

    @Test
    public void provideLargeSentence_WhenWordAddedToHasMap_ShouldReturnParanoidFrequency()
    {
        String sentence = "paranoid are not paranoid because they are paranoid but " +
                "because they keep putting themselves deliberately into paranoid " +
                "avoidable situations";
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
        int frequency = myHashMap.get("paranoid");
        Assert.assertEquals(4, frequency);
    }

    @Test
    public void provideWord_WhenRemovedFromHashMap_TestCaseShouldPass()
    {
        String sentence = "paranoid are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situation";
        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
        String [] words = sentence.toLowerCase().split(" ");
        for (String word : words) {
            Integer value = myHashMap.get(word);
            if (value == null) {
                value = 1;
            } else {
                value = value + 1;
            }
            myHashMap.add(word, value);
        }
        int isValueRemoved = myHashMap.delete("avoidable");
        Assert.assertEquals(1, isValueRemoved);
    }

}
