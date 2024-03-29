package arrayListsFunctions;

import java.util.ArrayList;
import java.util.List;

public class addAllElements {

	public static void main(String[] args) {

		List<String> fruits= new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Watermelon");
		List<String> vegetables= new ArrayList<>();
		vegetables.add("Carrot");
		vegetables.add("Potato");
		fruits.addAll(vegetables);
		
		System.out.println(fruits);
		System.out.println(fruits.get(3));
		
		fruits.set(1, "Banana");
		System.out.println(fruits.get(3));
		System.out.println("The current size is: "+ fruits.size());
		fruits.remove(4);
		System.out.println("Size after removing index 4 is: "+ fruits.size());
		
		fruits.removeAll(vegetables);
		System.out.println(fruits);
		System.out.println("The size after removing all vegetables is: "+ fruits.size());
		
		System.out.println("does the list contain apple?: "+ fruits.contains("Apple"));
		System.out.println(fruits);
		System.out.println("Is the fruit list empty?: "+ fruits.isEmpty());
		System.out.println("Now clearing it");
		fruits.clear();
		System.out.println(fruits.isEmpty());
	}

}
