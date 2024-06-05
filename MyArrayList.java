import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Adding elements to the ArrayList
        list.add(args[0]);
        list.add(args[1]);

        // Attempting to access an element beyond the list size
        try {
            System.out.println("Element at the last index: " + list.get(2)); // This will cause an exception
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught an IndexOutOfBoundsException!");
        }
        printList(list);
    }

    // Method to print elements of the ArrayList
    public static void printList(ArrayList<Integer> list) {
        for (int i = 0; i <= list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
