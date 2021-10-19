package sets;
//Set is an interface. EnumSet, HashSet, LinkedHashSet, TreeSet implement this interface
import java.util.HashSet;
import java.util.Set;
//All operations are performed in constant time in set
public class SetsIntro {

	public static void main(String[] args) {
		Set <String> fruits = new HashSet<>();//HashSet is using HashMap internally
		//Internal working of hash and HashSet is very important in interviews
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Kiwi");
		//The elements in the HashSet are not stored in order
		fruits.add("Banana");//This add method returns boolean (false if element is already present and not added, true otherwise)
		
		//Duplicate elements are not allowed in set and will be discarded
		System.out.println(fruits);
	}
	/*Operations on set
	 * Union = to get union of two sets we use x.addAll(y) function
	 * Intersection = to get intersection of two sets we use x.retainAll(y)
	 * subset = to check if x contains all y we use y.containsAll(x)
	 * 
	 * */

}
