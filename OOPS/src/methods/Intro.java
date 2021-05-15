package methods;
import java.util.Scanner;

public class Intro {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		sayHi();
		
		System.out.println("enter a number: ");
		int a= sc.nextInt();
		
		System.out.println("enter the next number: ");
		int b=sc.nextInt();
		sc.close();
		
		int result= maxOf( a, b);
		System.out.println("the larger of the numbers is: " +result);
	}
	
	static void sayHi() {
		System.out.println("Hello, hope you're doing well");
	}
	
	static int maxOf(int a, int b) {
		return (a>b)? a: b;
	}

}
