import java.util.ArrayList;

public class MyArrayList {
    private ArrayList<Integer> list;

    public MyArrayList() {
        list = new ArrayList<>();
    }

    // Method to add an element to the ArrayList
    public void add(int data) {
        list.add(data);
    }

    // Method to get an element from the ArrayList
    public int get(int index) {
        return list.get(index);
    }

    // Method to print elements of the ArrayList
    public static void printList(ArrayList<Integer> list) {
        for (int i = 0; i <= list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();

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

        // Correctly printing elements of the ArrayList
        myArrayList.printList();
    }
}

