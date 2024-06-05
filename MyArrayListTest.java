import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

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

        Exception exception = assertThrows(IndexOutOfBoundsException.class, () -> {
            list2.get(3);
        });

        String expectedMessage = "Index: 3, Size: 3";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
