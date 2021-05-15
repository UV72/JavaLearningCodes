package polymorphism;

public class CompileTimePolymorphism {

	public static void greeting() {
		System.out.println("Hello There!");
	}
	public static void greeting(String s) {
		System.out.println("The dev wants to say "+ s);
	}
	
	public static void main(String[] args) {
		greeting();
		greeting("Good morning");
	}
	//Here both the greeting methods have the same name but different parameters
	//the compiler judges which of the following method to call during compile time by looking at their parameters
	//as a result compiler knows this during compile time and hence is compile time polymorphism
	//also known as overloading, early binding, static binding
}

	//also, variables do not support polymorphism
