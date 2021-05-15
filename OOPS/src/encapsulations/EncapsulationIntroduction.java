package encapsulations;
import encapsulations.StudentsCapsule;
import java.util.Scanner;

public class EncapsulationIntroduction {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		StudentsCapsule student1= new StudentsCapsule();
		
		System.out.println("please enter the name: ");
		student1.setName(sc.nextLine());
		
		System.out.println("Please enter the age: ");
		student1.setAge(sc.nextInt());
		
		System.out.println("the student's name is "+ student1.getName()+ " and the age is "+student1.getAge());
		sc.close();
	}

}
