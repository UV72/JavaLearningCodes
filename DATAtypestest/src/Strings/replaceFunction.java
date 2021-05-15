package Strings;
import java.util.Scanner;

public class replaceFunction {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter a string for replacement");
		String name=sc.nextLine();
		sc.close();
		System.out.println("the a's will be replaces be e's");
		System.out.println(name.replace('a' , ' '));
	}

}
