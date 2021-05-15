package ifElse;
import java.util.Scanner;

public class New {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number for which you would like the multiplication table");
		int n= sc.nextInt();
		sc.close();
		for(int i=1; i<=10; i++) {
			System.out.println(n+ " "+"x"+ " "+ i+ "="+ " "+ n*i);
		}
		
		
		}
}
		
		
		



