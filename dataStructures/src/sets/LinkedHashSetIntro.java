package sets;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetIntro {

	public static void main(String[] args) {
		Set<String> fruits = new LinkedHashSet<>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Kiwi");
		//As opposed to HashSet, LinkedHashSet retains the order of the elements. The principle remains same.
		//LinkedHashSet uses Linked List internally so it's operations are done in linear time. This is the tradeOff.
		System.out.println(fruits);
		
	}

}
