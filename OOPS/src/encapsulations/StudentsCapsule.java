package encapsulations;

public class StudentsCapsule {
	private int age;
	private String name;
	
	public void setName(String name) {
		this.name= name;
	}
	public void setAge(int age) {
		if(age>20 || age<0) System.out.println("This is not a valid age");
		else this.age=age;
	}
	
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
}
