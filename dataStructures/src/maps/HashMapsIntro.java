package maps;

//HashMaps store key and value as pair unlike the previous arrays queues or lists which store only values
//internal working of hashMaps is very important in interviews

//map interface does not extend the collection interface but is a part of collection framework
/* all maps store keys and values
 * keys are unique values associated with individual values
 * a map cannot contain duplicate keys and each key is associated with a single value
 * we can access and modify values using keys associated with them
 */

//map interface is implemented by classes: HashMap, TreeMap, EnumMap, LinkedHashMap and WeakHashMap

import java.util.HashMap;
import java.util.Map;

public class HashMapsIntro {
	public static void main(String[] args) {
		Map<String, Integer> numbers = new HashMap<>();
		//we will have to specify the type of key and value as Map<keyType, ValueType> while creating an object
		//null key is also supported
		numbers.put("one", 1);
		numbers.put("two", 2);
		numbers.put("five", 5);
		numbers.put("ten", 10);
		numbers.put("twenty", 20);
		System.out.println(numbers);
		
		numbers.put("one", 50);
		//This will check if the key "one" has a value associated, if it is; then the value will be updated
		System.out.println(numbers + " After put(one, 10)");
		numbers.putIfAbsent("two", 20);
		//This function adds a value to the specified key only if it is not already present
		System.out.println(numbers + " After putIfAbsent(two, 20)");
		System.out.println(numbers.get("twenty") + " is the value present at twenty key");//returns null if value is not present
		System.out.println();
		
		System.out.println("Is the key four present? " + numbers.containsKey("four"));
		System.out.println("Is there a value '5' present? " + numbers.containsValue(5));
	}
}
