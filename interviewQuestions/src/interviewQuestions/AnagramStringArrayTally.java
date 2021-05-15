package interviewQuestions;
import java.util.Scanner;

public class AnagramStringArrayTally {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		int []s1=new int[256]; //here length is 256 because we are making an array of the full ASCII table which contains 256 numbers and letters
		int []s2=new int[256];// we will update the values of the array and take the indices as the ASCII values of characters
		sc.close();
		
		for(char aChar: a.toCharArray()) {
			//the toCharArray function breaks the string and stores each character in an array
			// here, for each element of "a" array is allocated to variable aChar in each iteration
			int index= (int) aChar;//thus index will be allocated the ASCII value of aChar (which is also the position of it in the array)
			s1[index]++; //here we increase the tally of the given character
		}
		
		for(char bChar: b.toCharArray()) {
			int index= (int) bChar;
			s2[index]++;
		}
		
		boolean isAnagram= true;
		for(int i=0; i<s1.length; i++) {
			if(s1[i]!=s2[i]) {
				isAnagram=false;
				break;
			}
		}
		if(isAnagram) System.out.println("the Strings are anagrams");
		else System.out.println("the Strings are not Anagrams");
	}

}
