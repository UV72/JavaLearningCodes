package staticKeyword;

public class PersonCounterDemo {

	public static void main(String[] args) {
		Personmaker p1= new Personmaker();
		Personmaker p2= new Personmaker(20, "Yuvraj");
		System.out.println("Total population is :"+ Personmaker.getPopulation());
		System.out.println("Person1 is :"+ p1.getName()+" Of age: "+ p1.getAge());
		System.out.println("Person2 is :"+ p2.getName()+" Of age: "+ p2.getAge());
		
	}

}

class Personmaker{
	private static int counter;
	private int age;
	private String name;
	public Personmaker(){
		counter++;
	}
	public Personmaker(int age, String name) {
		this.age=age;
		this.name=name;
		counter++;
	}
	public static int getPopulation() {
		return counter;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	
}
