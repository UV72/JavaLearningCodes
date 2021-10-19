package sets;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetIntro {

	public static void main(String[] args) {
		Set<String> fruits = new TreeSet<>();
		//TreeSet stores elements in sorted for (Like a dictionary for Strings)
		//It uses TreeMap for internal working
		//Some of the operations of the treeSet are done in log(n) time complexity
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Kiwi");
		System.out.println(fruits);
	}

}
