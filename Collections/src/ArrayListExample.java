import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> list = new ArrayList<>();

        // Add elements to the ArrayList
        list.add("apple");
        list.add("banana");
        list.add("cherry");

        // Access elements in the ArrayList
        System.out.println("Element at index 0: " + list.get(0));

        // Update an element in the ArrayList
        list.set(1, "berry");

        // Remove an element from the ArrayList
        list.remove("cherry");

        // Check if an element exists in the ArrayList
        System.out.println("Contains 'banana'? " + list.contains("banana"));

        // Iterate through the ArrayList
        for (String element : list) {
            System.out.println(element);
        }

        // Get the size of the ArrayList
        System.out.println("Size: " + list.size());
    }
}
