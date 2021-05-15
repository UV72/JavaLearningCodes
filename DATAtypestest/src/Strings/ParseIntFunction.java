package Strings;
import java.util.Scanner;
public class ParseIntFunction {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter a number");
		String num=sc.nextLine();
		sc.close();
		
		int number= Integer.parseInt(num);
		System.out.println("the number you have entered is "+ number);
	}

}
