import java.util.ArrayList;
import java.util.Iterator;

class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        
        // Add 10 elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");
        list.add("Fig");
        list.add("Grape");
        list.add("Honeydew");
        list.add("Indian Fig");
        list.add("Jackfruit");

        // Add an element
        list.add("Kiwi");
        
        // Iterate using Iterator
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Add an element at specific index
        list.add(2, "Blueberry");

        // Remove an element
        list.remove("Fig");

        // Remove at index
        list.remove(3);

        // Update element at specific index
        list.set(5, "Guava");

        // Check element at index
        System.out.println("Element at index 4: " + list.get(4));

        // Get element at index
        System.out.println("Element at index 2: " + list.get(2));

        // Find size
        System.out.println("Size of list: " + list.size());

        // Check if element 'is present
        System.out.println("Contains 'Apple': " + list.contains("Apple"));

        // Remove all elements
        list.clear();
        System.out.println("List after clear: " + list);
    }
}
