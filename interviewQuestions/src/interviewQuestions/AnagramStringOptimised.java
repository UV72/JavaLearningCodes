package interviewQuestions;
import java.util.Scanner;

public class AnagramStringOptimised {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		sc.close();
		
		int arr[]= new int[256];
        boolean isAnagram=true;
        
        for(char c: a.toCharArray()){
            int index=(int) c;
            arr[index]++;
        }
        
        for(char c: b.toCharArray()){
            int index=(int) c;
            arr[index]--;
        }
        
        for(int i=0; i<256; i++){
            if(arr[i]!=0){
                isAnagram=false;
                break;
            }
        }
        if(isAnagram) System.out.println("are anagrams");
        else System.out.println("are not anagrams");
        
	}

}
