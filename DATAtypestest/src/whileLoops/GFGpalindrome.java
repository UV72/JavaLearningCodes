package whileLoops;
import java.util.Scanner;

public class GFGpalindrome {
public static void main(String [] args) {
	
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	int temp=n;
    int palindrome=0;
    
    while(temp>0){
        palindrome=(palindrome*10)+temp%10;
        temp=temp/10;
    }
    if (palindrome==n){
        System.out.println("this is a palindrome");
    }
    else{
         System.out.println("this is not a palindrome");
    }
    sc.close();
}
}
