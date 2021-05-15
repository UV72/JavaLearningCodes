package arrays;
import java.util.Scanner;

public class AverageMarks {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the number of students ");
		int students=sc.nextInt();
		int marks[]= new int[students];
		
		for(int i=0; i<marks.length; i++) {
			
			System.out.println("Please enter the marks of Roll no "+(i+1));
			marks[i]=sc.nextInt();
			
		}
		
		double sum=0;
		for(int i=0; i<marks.length; i++) {
			
			sum=sum+marks[i];
			
		}
		sc.close();
		double average=sum/marks.length;
		System.out.println("The average marks are :" +average);
	}

}
