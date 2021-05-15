package kadaneAlgorithm;
//Here we will use the preprocessor method to calculate the sum of subArray

import java.util.Scanner;

public class OptimisedBruteForce {
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
		int sumArray[]=new int[n];
		sumArray[0]=arr[0];
		for(int i=1; i<n ; i++) {
			sumArray[i]=sumArray[i-1]+arr[i];
		}
		for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
				currentSum=sumArray[j]-sumArray[i]+arr[i];
				if(currentSum>maxSum)maxSum=currentSum;
			}
		}
		System.out.println("The maximum sum is: "+maxSum);
		
	}
}
//O(n^2) Time complexity
//(n) Space used