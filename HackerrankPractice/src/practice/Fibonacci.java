package practice;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number=sc.nextInt();
		int a=1;
		int b=1;
		sc.close();
		System.out.print(a+" ");
		System.out.print(b+" ");
		
		for(int i=0; i<=number; i++) {
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			
		}
		
	}

}
