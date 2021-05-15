package Strings;

public class newKeyword {

	public static void main(String[] args) {
		String name="Yuvraj"; //this is stored in String pool
		String namenew= new String("Yuvraj"); //this is stored in heap memory
		System.out.println(name==namenew);
		//output is false
	}

}
