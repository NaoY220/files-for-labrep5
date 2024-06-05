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

    public String getTheLastElem() {
        System.out.println("Element at the last index: " + list.get(list.size()));
    }
}

