package interviewQuestions;
import java.util.Scanner;

public class AnagramsLoopsPractice {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a pair of Strings");
	String a=sc.nextLine();
	String b=sc.nextLine();
	sc.close();
	boolean isAnagram=false;
	boolean visited[]= new boolean[b.length()];
	
	if(a.length()==b.length()) {
		
	for(int i=0; i<a.length(); i++) {
		isAnagram=false;
		char c= a.charAt(i);
		
		for(int j=0; j<b.length(); j++) {
			if(b.charAt(j)==c && !visited[j]) {
				visited[j]=true;
				isAnagram=true;
				break;
			}
		}
		
		if(!isAnagram) break;
	}
	}
	
	if(isAnagram) System.out.println("they are anagrams");
	else System.out.println("they are not anagrams");
	}

}
