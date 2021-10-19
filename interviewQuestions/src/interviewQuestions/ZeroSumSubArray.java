package interviewQuestions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Given an array, find if there exists a sub-array with sum equals to zero. n<10^5
public class ZeroSumSubArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array");
		int length = sc.nextInt();
		System.out.println("Now enter the array");
		int arr[] = new int[length];
		for(int i=0; i<length; i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		if(zeroArray(length, arr)) System.out.println("The zero sum subArray is present");
		else System.out.println("Zero sum subArray not present");
	}
	
	public static boolean zeroArray(int n, int[] arr) {
		boolean found = false;
		int currentSum = 0;
		Set<Integer> x = new HashSet<>();
		for(int i=0; i<n; i++) {
			if(!x.add(currentSum)) {
				found = true;
				break;
			}
			currentSum+=arr[i];
		}
		return found;
	}
}
//Another variation of this question might be to find a sub-array with the given sum