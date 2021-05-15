package whileLoops;
import java.util.Scanner;

public class checkingPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter a number: ");
		int number=sc.nextInt();
		int temp=number;
		int palindrome=0;
		sc.close();
		
		while(temp>0) {
			int remainder=temp%10;
			palindrome=palindrome*10+remainder;
			temp/=10;
		}
		if(palindrome==number) {
			System.out.println("the number is a palindrome");
		}
		else {
			System.out.println("the number is not a palindrome");
		}
	}
		

}
