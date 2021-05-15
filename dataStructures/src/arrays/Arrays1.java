package arrays;
import java.util.Scanner;

public class Arrays1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int marks []= {10,20,30,40,50};
		System.out.println("the current status of marks is as follows: ");
		
		for(int i=0; i<marks.length; i++) {
			System.out.println("the marks of "+(i+1)+" roll number is: "+ marks[i]);
		}
		
		System.out.println("please enter the Roll number that you would like to change: ");
		int n=sc.nextInt();
		System.out.println("now, what should be the new value? ");
		int newval=sc.nextInt();
		marks[n-1]= newval;
		sc.close();
		
		for(int i=0; i<marks.length; i++) {
			System.out.println("the marks of "+(i+1)+" roll number is: "+ marks[i]);
		}
	}

}
