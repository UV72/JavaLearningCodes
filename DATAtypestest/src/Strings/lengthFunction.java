package Strings;
import java.util.Scanner;

class lengthFunction {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("please enter a name");
		String name=sc.nextLine();
		
		int length=name.length();
		System.out.println("the length of this name is "+ length+ " characters");
		sc.close();
	}
}
