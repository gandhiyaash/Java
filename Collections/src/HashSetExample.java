import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet of Strings
        HashSet<String> set = new HashSet<>();

        // Add elements to the HashSet
        set.add("apple");
        set.add("banana");
        set.add("cherry");

        // Check if an element exists in the HashSet
        System.out.println("Contains 'banana'? " + set.contains("banana"));

        // Remove an element from the HashSet
        set.remove("cherry");

        // Iterate through the HashSet
        for (String element : set) {
            System.out.println(element);
        }

        // Get the size of the HashSet
        System.out.println("Size: " + set.size());
    }
}
