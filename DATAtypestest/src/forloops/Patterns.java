package forloops;
import java.util.Scanner;
public class Patterns {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter the number of rows");
		int n=sc.nextInt();
		sc.close();
		int rows=2*n-1;
		for(int j=1; j<=rows; j++) {
			if(j<=n) {
				for(int i=0; i<j; i++) {
					System.out.print("* ");
				}
			}
			else {
				for(int i=0; i<=rows-j; i++) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		}

}
