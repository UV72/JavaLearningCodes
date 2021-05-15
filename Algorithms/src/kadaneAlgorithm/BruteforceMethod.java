//Find a contiguous sub array with the largest sum in an array
package kadaneAlgorithm;
import java.util.Scanner;

public class BruteforceMethod {

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
			for(int j=i; j<n; j++) {
				for(int k=i; k<=j; k++) {
					currentSum+=arr[k];
				}
				if(currentSum>maxSum)maxSum=currentSum;
			}
		}
		System.out.println("The maximum sum is: "+maxSum);
	}

}
//O(n^3) Time complexity