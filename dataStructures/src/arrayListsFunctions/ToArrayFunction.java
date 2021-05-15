package arrayListsFunctions;
import java.util.List;
import java.util.ArrayList;

public class ToArrayFunction {

	public static void main(String[] args) {
		List<String> fruits= new ArrayList<>();
		fruits.add("Apple");
		fruits.add("banana");
		fruits.add("Orange");
		System.out.println("");
		String [] temp= new String[fruits.size()];
		fruits.toArray(temp);
		for(String e : temp) {
			System.out.println(e);
		}
	}

}
