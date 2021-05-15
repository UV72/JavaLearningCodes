package oops.packages;
//import oops.packages.models.Student; ==>>here we have accessed the Student class from the models package
//import oops.packages.models.Teacher; ==>>similar to above statement this imports the teacher class
import oops.packages.models.*; //This line import all the contents of the models package
import java.util.*; //This line imports all the contents of the util package in JDK including Scanner

public class MainClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		sc.close();
		Student obj= new Student("Tom"); //here we have created an object of the imported student class
		System.out.println(obj.getName()); // This line prints the name of the student
		
		Teacher teacher= new Teacher("Sharma");
		String teacherName= teacher.getName();
		System.out.println("the teacher's name is "+ teacherName);
	}

}
