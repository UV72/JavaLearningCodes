package whileLoops;
import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int number=scan.nextInt();
		int binary=0;
		int remainder=0;
		int multiplier=1;
		
		 while(number>0){
			 remainder=number%2;
			 remainder*=multiplier;
			 binary+=remainder;
			 number/=2;
			 multiplier*=10;
		 }
		 scan.close();
		 System.out.println("the binary of the number is: "+binary);
	}

}
