package arraylists;

public class PairsDemo {

	public static void main(String[] args) {
		Pairs<Boolean, String> p1= new Pairs<Boolean, String>(true, "Yuvraj");
		Pairs<String, Integer> p2= new Pairs<String, Integer>("Marks", 457);
		p1.getDescription();
		p2.getDescription();
	}

}
