package inheritance;

public class Person {

	public Person(String name) {
		this.name=name;
	}
	protected String name;
	public void walk() {
		System.out.println("Person "+ name+ " is walking");
	}
	public void eat() {
		System.out.println("Person"+ name+ " is eating");
	}

}
