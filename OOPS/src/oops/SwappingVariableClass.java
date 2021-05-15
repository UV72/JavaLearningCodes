package oops;
import java.util.Scanner;

public class SwappingVariableClass {
	
	static void swap(int c, int d) {
		int temp=0;
		c=temp;
		c=d;
		d=temp;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		sc.close();
		
		swap(a, b);//This would not be able to swap the values because java is always pass by value
		System.out.println("the value of a is "+ a+ "and b is "+ b);
	}

}
