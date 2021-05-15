package whileLoops;
import java.util.Scanner;
import java.lang.Math;

public class addDigitsForLoops {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int numberOfDigits= (int) Math.log10(n)+1;
		int sum=0;
		int temp=n;
		sc.close();
		
		for(int i=0; i<numberOfDigits; i++) {
			int remainder=temp%10;
			sum=sum+remainder;
			temp=temp/10;
		}
		System.out.println("the sum of digits of "+n+" is "+sum);
	}
	

}
