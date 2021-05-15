import java.util.Scanner;
public class Starswihtblankspatterncw {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number of rows:");
		int rows= sc.nextInt();
		sc.close();
		int lines=2*rows;
		
		for(int i=1; i<=lines; i++) {
			
			for(int j=0; j<rows-i; j++) {
				System.out.print("  ");
			}
			if(i<lines/2) {
				
				for(int j=0; j<i; j++) {
					System.out.print("* ");
				}
			}
			else {
				for(int j=0; j<i-rows; j++) {
					System.out.print("  ");
				}
				for(int j=0; j<lines-i; j++) {
					System.out.print("* ");
				}
			}
			
			
			System.out.println();
			
		}
	}

}
