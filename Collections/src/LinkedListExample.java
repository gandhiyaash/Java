import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList of Integers
        LinkedList<Integer> list = new LinkedList<>();

        // Add elements to the LinkedList
        list.add(10);
        list.add(20);
        list.add(30);

        // Access elements in the LinkedList
        System.out.println("Element at index 0: " + list.get(0));

        // Update an element in the LinkedList
        list.set(1, 25);

        // Remove an element from the LinkedList
        list.remove(2);

        // Check if an element exists in the LinkedList
        System.out.println("Contains 20? " + list.contains(20));

        // Iterate through the LinkedList
        for (int element : list) {
            System.out.println(element);
        }

        // Get the size of the LinkedList
        System.out.println("Size: " + list.size());
    }
}
