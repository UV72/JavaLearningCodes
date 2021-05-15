package inheritance;

public class SuperDemo extends Person{
	public SuperDemo(String name) {
		super(name);//This calls the constructor from It's super class(Person)
		System.out.println("In super demo constructor");
	}
}
