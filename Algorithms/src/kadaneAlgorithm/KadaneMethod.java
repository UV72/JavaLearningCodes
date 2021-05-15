package kadaneAlgorithm;

import java.util.Scanner;

public class KadaneMethod {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("now enter the elements");
		for(int i=0; i<n; i++)arr[i]=sc.nextInt();
		
		findMaxSum(n, arr);
		sc.close();
	}

	private static void findMaxSum(int n, int[] arr) {
		int maxSum=Integer.MIN_VALUE;
		int currentSum=0;
		for(int i=0; i<n; i++) {
			currentSum+=arr[i];
			if(currentSum>maxSum) maxSum=currentSum;
			if(currentSum<0)currentSum=0;
		}
		System.out.println("The maximum sum is: "+ maxSum);
	}

}
