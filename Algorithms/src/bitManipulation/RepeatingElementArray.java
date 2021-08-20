package bitManipulation;
import java.util.Scanner;

public class RepeatingElementArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("How many element do you want?: ");
		int number=sc.nextInt();
		int arr[]= new int[number];
		System.out.println("Now enter the numbers: ");
		for(int i=0; i<number; i++) {
			arr[i]=sc.nextInt();
		}
		int only=0;
		for(int i=0; i<number; i++) {
			only=only^arr[i];
		}
		System.out.println("The non repeating element is: " +only);
		sc.close();
	}

}
