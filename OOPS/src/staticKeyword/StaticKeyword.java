package staticKeyword;

public class StaticKeyword {
	
	static class StaticDemo{
		static String breed="Homo Sapiens";
		//here our inner class is static so we are able to declare a static variable in it.
		//if we remove the static from our StaticDemo class, there will be an error because static fields cannot be declared inside non static nested class.
		//however if the class is not nested, we can declare static fields in it,
	}
	public static void main(String[] args) {
		
	}

}
