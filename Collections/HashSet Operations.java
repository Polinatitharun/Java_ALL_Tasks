import java.util.HashSet;
import java.util.Iterator;

class HashSetOperations {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Add 10 elements
        set.add("Red");
        set.add("Blue");
        set.add("Green");
        set.add("Yellow");
        set.add("Orange");
        set.add("Purple");
        set.add("Black");
        set.add("White");
        set.add("Pink");
        set.add("Brown");

        // Add an element
        set.add("Gray");

        // Remove an element
        set.remove("Pink");

        // Check if element exists
        System.out.println("Contains 'Blue': " + set.contains("Blue"));

        // Get size
        System.out.println("Size: " + set.size());

        // Iterate through the HashSet
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Clear HashSet
        set.clear();
        System.out.println("Set after clearing: " + set);
    }
}
