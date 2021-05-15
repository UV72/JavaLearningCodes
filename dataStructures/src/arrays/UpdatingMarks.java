package arrays;
import java.util.Scanner;

public class UpdatingMarks {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number of students: ");
		int students=sc.nextInt();
		int marks[]= new int[students];

		for(int i=0; i<students; i++) {
			
			System.out.println("enter the marks of roll number "+ (i+1));
			int obtained=sc.nextInt();
			marks[i]= obtained;
			System.out.println();
			
		}
		
		sc.close();
		for(int i=0; i<students; i++) {
			
			System.out.println("the marks of roll number "+ (i+1)+ " is "+ marks[i]);
		
		}
	}

}
