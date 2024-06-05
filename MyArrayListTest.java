import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MyArrayListTest {

    @Test
    public void testAddAndGet() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);

        assertEquals(1, myArrayList.get(0));
        assertEquals(2, myArrayList.get(1));
        assertEquals(3, myArrayList.get(2));
    }

    @Test
    public void testIndexOutOfBounds() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);

        Exception exception = assertThrows(IndexOutOfBoundsException.class, () -> {
            myArrayList.get(3);
        });

        String expectedMessage = "Index: 3, Size: 3";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
