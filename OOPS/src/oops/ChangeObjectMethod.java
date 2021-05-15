package oops;

class Dog{
	int legs;
}

public class ChangeObjectMethod {

	public static void main(String[] args) {
		Dog a= new Dog();
		a.legs=4;
		
		changeDog(a);
		System.out.println("the new legs of dog a is " +a.legs);
		
		doubleLegs(a);
		System.out.println("Doubling the legs of a gives "+ a.legs);
	}
	
	static void changeDog(Dog b) {
		b.legs=6;
	}
	
	static void doubleLegs(Dog c) {
		c.legs*=2;
	}

}
