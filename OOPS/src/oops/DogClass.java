package oops;

class Dogs{
	int age;
	boolean longfur;
	String name, breed;
	
	public void description() {
		System.out.println("The dog's name is "+ name+ " of the breed "+ breed);
		if(longfur) System.out.println("It has long fur");
		else System.out.println("It has short fur");
		System.out.println("Its age is: "+ age);
	}
	
	public void eat() {
		System.out.println(name+ " is eating");
	}
	public void play() {
		System.out.println(name+ " is playing");
	}
}

public class DogClass {

	public static void main(String[] args) {
		Dogs dog1= new Dogs();
		dog1.name="Tiger";
		dog1.longfur=false;
		dog1.breed="Labrador";
		dog1.age=6;
		
		dog1.description();
		dog1.eat();
	}

}
