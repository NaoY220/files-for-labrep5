import static org.junit.Assert.*;
import org.junit.*;

public class MyArrayListTest {

    @Test
    public void testAddAndGet() {
        MyArrayList list = new MyArrayList();
        list.add(23);
        list.add(0);
        list.add(-14);

        assertEquals(23, list.get(0));
        assertEquals(0, list.get(1));
        assertEquals(-14, list.get(2));
    }

    @Test
    public void testIndexOutOfBounds() {
        MyArrayList list2 = new MyArrayList();
        list2.add(23);
        list2.add(0);
        list2.add(-14);

        String result = list2.getTheLastElem();

        String expectedMessage = "Element at the last index: -14";

        assertTrue(result.contains(expectedMessage));
    }
}
