package whileLoops;
import java.util.Scanner;
public class addDigits {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		sc.close();
		
		while(n>0) {
			int remainder=n%10;
			sum=sum+remainder;
			n=n/10; //here the division is integer division so the result is floor value
		}
		System.out.println("the sum of all the digits of the given number is: "+sum);
		
	}

}
