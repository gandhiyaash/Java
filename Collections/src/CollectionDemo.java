import java.util.Hashtable;
import java.util.Vector;

public class CollectionDemo {

    public static void main(String[] args) {
        // Creating Instance of the array
        //Vector and Hash Table
        int arr[] = new int[] {1, 2, 3, 4, 5};
        Vector<Integer> v = new Vector<>();
        Hashtable<Integer, String> h = new Hashtable<>();

        // Adding the elements to the vector
        v.addElement(1);
        v.addElement(2);

        // Adding instance creation requires [],
        // While Vector and hashtable require()
        // Vector element insertion requires addElement(),
        // but hashtable element insertion requires addElement(),
        // but hashtable element insertion requires put()

        // Accessing the first elements of the
        // array vector and hashtable
        System.out.println(arr[0]);
        System.out.println(v.elementAt(0));
        System.out.println(h.get(1));

        //Array elements are accessed using [],
        // vector elements using elementAt()
        // and hashtable elements using get()

    }
}
