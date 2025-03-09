import java.util.HashMap;
import java.util.Map;

class HashMapOperations {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();

        // Add 10 key-value pairs
        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");
        students.put(104, "David");
        students.put(105, "Emma");
        students.put(106, "Frank");
        students.put(107, "Grace");
        students.put(108, "Hannah");
        students.put(109, "Ivy");
        students.put(110, "Jack");

        // Insert a new key-value pair
        students.put(111, "Kevin");

        // Fetch value of a key
        System.out.println("Value of key 104: " + students.get(104));

        // Clone the HashMap
        HashMap<Integer, String> clonedMap = new HashMap<>(students);

        // Check if key exists
        System.out.println("Contains key 105: " + students.containsKey(105));

        // Check if value exists
        System.out.println("Contains value 'Emma': " + students.containsValue("Emma"));

        // Check if map is empty
        System.out.println("Is empty: " + students.isEmpty());

        // Print size of map
        System.out.println("Size of map: " + students.size());

        // Print all keys
        System.out.println("Keys: " + students.keySet());

        // Print all values
        System.out.println("Values: " + students.values());

        // Remove a key-value pair
        students.remove(109);

        // Copy elements to another map
        HashMap<Integer, String> newMap = new HashMap<>();
        newMap.putAll(students);

        System.out.println("New copied map: " + newMap);
    }
}
