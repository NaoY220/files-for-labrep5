import java.util.ArrayList;

public class MyArrayList {
    private ArrayList<Integer> list;

    public MyArrayList() {
        list = new ArrayList<>();
    }

    //fuction to add element
    public void add(int data) {
        list.add(data);
    }

    // function to get the element at desired index
    public int get(int index) {
        return list.get(index);
    }

    // function to print all elements
    public static void printList(ArrayList<Integer> list) {
        for (int i = 0; i <= list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();

        list.add(args[0]);
        list.add(args[1]);

        try {
            System.out.println("Element at the last index: " + list.get(2));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught an IndexOutOfBoundsException!");
        }
        printList(list);
        
    }
}

