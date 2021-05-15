package interviewQuestions;
import java.util.Scanner;

public class AnagramOfStringLoopsMethod {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a pair of Strings");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		sc.close();
		boolean isAnagram=false;
		boolean visited[]=new boolean[s2.length()];
		
		if(s1.length()==s2.length()) {
			
			for(int i=0; i<s1.length(); i++) {
				char c=s1.charAt(i);
				isAnagram=false;
				for(int j=0; j<s2.length(); j++) {
					if(s2.charAt(j)==c && !visited[j]) {
						visited[j]=true;
						isAnagram=true;
						break;
					}
				}
				
				if(!isAnagram) {
					break;
				}
				}
			
			System.out.println("anagrams: "+ isAnagram);
		}
		else {
			System.out.println("they are not anagrams");
		}
	}

}
