package oops;
import java.util.Scanner;

class printer{
	public static void say(String s) {
		System.out.println("you just entered: "+ s);
	}
}

public class CreateClass {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a sentence: ");
		String sentence=sc.nextLine();
		printer.say(sentence);
		sc.close();
	}

}
