package tdd.set;

/*
 * Implement a Set of unique elements without using the built-in array or hash data structures, using TDD.
 * Add, Remove, Get, Size, Clear
 * The set interface is an unordered collection of objects in which duplicate values cannot be stored.
 * The Java Set does not provide control over the position of insertion or deletion of elements.
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SetTest {

    Set set;

    @Test
    public void testSetInitialSizeWithDefaultConstructor(){
        set = new Set();
        assertEquals(10, set.maximumSize());
    }

    @Test
    public void testSetInitialSizeWithConstructorSupplyingSize(){
        set = new Set(20);
        assertEquals(20, set.maximumSize());
    }

    @Test
    public void testInitialSetSize(){
        set = new Set();
        assertEquals(0, set.size());
    }

    @Test
    public void testSetSizeAfterAdd(){
        set = new Set();
        set.add("Some Value");
        assertEquals(1, set.size());
    }

    @Test
    public void testGetItemFromSet(){
        set = new Set();
        assertEquals(null, set.get(0));
    }

    @Test
    public void testGetItemFromSetOutOfBoundsCondition(){
        set = new Set();
        assertThrows(ArrayIndexOutOfBoundsException.class, ()->{set.get(20);});
    }

    @Test
    public void testAddStringItemToSet(){
        set = new Set();
        set.add("Hello");
        assertEquals("Hello", set.get(0));
    }

    @Test
    public void testAddIntItemToSet(){
        set = new Set();
        set.add(1);
        assertEquals(1, set.get(0));
    }

    @Test
    public void testAddToArraySizeThreshold(){
        set = new Set(1);
        set.add(1);
        assertEquals(1, set.size());
        set.add(2);
        assertEquals(2, set.size());
    }

    @Test
    public void testAddToArraySizeThresholdB(){
        set = new Set(2);
        set.add(1);
        set.add(2);
        assertEquals(2, set.size());
        set.add(3);
        set.add(4);
        assertEquals(4, set.size());
    }

    @Test
    public void testRemoveEntryInvalidIndex(){
        set = new Set();
        set.add("Some Value");
        set.add("Some Other Value");
        assertThrows(ArrayIndexOutOfBoundsException.class, ()->{set.remove(12);});
    }

    @Test
    public void testRemoveEntry(){
        set = new Set();
        set.add("Some Value");
        set.add("Some Other Value");
        assertEquals("Some Other Value", set.remove(1));
    }

    @Test
    public void testRemoveEntryFromMiddleSet(){
        set = new Set();
        set.add("Some Value");
        set.add("Some Other Value");
        set.add("Some Final Value");
        assertEquals("Some Other Value", set.remove(1));
        assertEquals("Some Final Value", set.get(1));
        assertEquals(2, set.size());
    }

    @Test
    public void testClear(){
        set = new Set();
        set.add("Some Value");
        set.add("Some Other Value");
        set.clear();
        assertEquals(10, set.maximumSize());
        assertEquals(0, set.size());
    }
}
