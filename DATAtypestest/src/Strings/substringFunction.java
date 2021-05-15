package Strings;
import java.util.Scanner;

public class substringFunction {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter a String");
		String s=sc.nextLine();
		int length= s.length();
		String secondHalf=s.substring(length/2);
		String firstHalf=s.substring(0, length/2);
		sc.close();
		
		System.out.println("the first half is: "+ firstHalf);
		System.out.println("the second half is: "+ secondHalf);
	}

}
