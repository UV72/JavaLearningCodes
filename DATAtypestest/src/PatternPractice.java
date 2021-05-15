import java.util.Scanner;public class PatternPractice {public static void main(String[] args) {Scanner a= new Scanner(System.in);   System.out.println("Enter n"); int n=a.nextInt();for(int i=0; i<n; i++) {for(int j=0; j<i; j++) {System.out.print("* ");} System.out.println();}a.close();
	}

}
