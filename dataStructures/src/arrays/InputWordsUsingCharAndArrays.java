package arrays;
import java.util.Scanner;

public class InputWordsUsingCharAndArrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the number of letters in your name");
		int n=sc.nextInt();
		char name[]= new char[n];
		System.out.println("please enter your name");
		for(int i=0; i<n; i++) {
			System.out.println("enter the character at "+ i+1);
			name[i]=sc.next().charAt(0);
		}
		sc.close();
		
		System.out.print("you have entered: ");
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i]);
		}
	}

}
