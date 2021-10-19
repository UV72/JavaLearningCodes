package interviewQuestions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter desired sum");
		int req = sc.nextInt();
		System.out.println("Enter length of array");
		int length = sc.nextInt();
		System.out.println("Now enter the array");
		int arr[] = new int[length];
		for(int i=0; i<length; i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		if(sumArray(req, length, arr)) System.out.println("The subArray is present");
		else System.out.println("The subArray is not present");
	}
	
	public static boolean sumArray(int k, int n, int[] arr) {
		boolean found = false;
		int sum=0;
		Set<Integer> x = new HashSet<>();
		for(int element: arr) {
			x.add(sum);
			sum+=element;
			if(x.contains(sum-k)) {
				found=true;
				break;
			}
		}
		return found;
	}
}
