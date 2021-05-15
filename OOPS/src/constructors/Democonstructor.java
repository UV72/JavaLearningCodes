package constructors;

public class Democonstructor {
	
	Democonstructor(){
		System.out.println("A new object has been created");
	}

	public static void main(String[] args) {
		System.out.println("creating a new object after this line");
		Democonstructor d1= new Democonstructor();
		System.out.println("new object "+ d1);
	}

}
