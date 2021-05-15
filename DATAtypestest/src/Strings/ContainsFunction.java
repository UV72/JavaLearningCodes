package Strings;
import java.util.Scanner;

public class ContainsFunction {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter a string");
		String string=sc.nextLine();
		sc.close();
		if(string.contains("a")||string.contains("e")||string.contains("i")||string.contains("o")||string.contains("u")) {

			System.out.println("The string contains a lowercase vowel");
		}
		else System.out.println("the string does not contain a lowercase vowel");
	}

}
