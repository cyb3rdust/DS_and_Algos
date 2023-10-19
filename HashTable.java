import java.util.Hashtable;

public class HashTable {
    public static void main(String[] args) {
        // Create a Hashtable with Integer keys and String values
        Hashtable<Integer, String> table = new Hashtable<>();

        // Add key-value pairs to the Hashtable
        table.put(1, "Value 1");
        table.put(2, "Value 2");
        table.put(3, "Value 3");

        // Retrieve values using keys
        String value1 = table.get(1);
        String value2 = table.get(2);

        // Print the values
        System.out.println("Value 1: " + value1);
        System.out.println("Value 2: " + value2);

        // Remove a key-value pair
        table.remove(3);

        // Check if a key exists
        boolean containsKey = table.containsKey(3);

        // Check if a value exists
        boolean containsValue = table.containsValue("Value 3");

        // Print the results
        System.out.println("Contains key 3: " + containsKey);
        System.out.println("Contains value 'Value 3': " + containsValue);


        for (Integer k: table.keySet()){
            System.out.println(table.get(k) + " - " );
        }
    }
}
