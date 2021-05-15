package interviewQuestions;
import java.util.Scanner;

public class ReverseStringWordByWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a sentence");
		String s=sc.nextLine();
		String arr[]=s.split(" ");
		sc.close();
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=arr[i].trim();
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[arr.length-i-1]+" ");
		}
	}

}
