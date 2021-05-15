package Strings;
import java.util.Scanner;

public class concat {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a name");
		String name=sc.nextLine();
		sc.close();
		System.out.println("hello " +name.concat(" sir"));
	}

}
