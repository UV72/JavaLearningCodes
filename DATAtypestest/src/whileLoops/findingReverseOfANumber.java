package whileLoops;
import java.util.Scanner;

public class findingReverseOfANumber {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int number=sc.nextInt();
		int reverse=0;
		int temp=number;
		sc.close();
		
		while(temp>0) {
			int remainder=temp%10;
			reverse=reverse*10+ remainder;
			temp/=10;
		}
		System.out.println("the reverse of the given number is: "+reverse);
	}

}
