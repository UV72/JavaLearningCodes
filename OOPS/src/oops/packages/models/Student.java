package oops.packages.models;

public class Student {

	private String name; // This cannot be accessed from outside the class as we have applied private access modifier
	public Student(String name) {
		//constructor class which initializes the name
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPassword() { //here we are protecting the password from access by other classes
		//password is sensitive data so it must be hidden from other classes
		return "ladksh@$3pasd";
	}
	
	
	
	
}
 //This class is used in oops.packages.MainClass