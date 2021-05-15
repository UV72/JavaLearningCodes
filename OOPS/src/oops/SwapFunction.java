package oops;
import java.util.Scanner;

class Integers{
	int value;
	
}

public class SwapFunction {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Integers a= new Integers();
		Integers b=new Integers();
		
		System.out.println("Enter the value of a: ");
		a.value=sc.nextInt();
		System.out.println("now enter the value of b: ");
		b.value=sc.nextInt();
		sc.close();
		swap(a, b);
		
		System.out.println("the new value of a is: " + a.value);
		System.out.println("the new value of b is: " +b.value);
		
	}
	
	public static void swap(Integers c, Integers d) {
		int temp=c.value;
		c.value=d.value;
		d.value=temp;
	}

}
