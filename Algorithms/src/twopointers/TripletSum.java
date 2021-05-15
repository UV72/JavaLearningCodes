/*QUESTION: Find if there is a triplet in the given array whose sum is equal to
  a given number X*/
package twopointers;
import java.util.*;

public class TripletSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int n=sc.nextInt();
		int arr[]= new int[n];
		System.out.print("Now enter the array: ");
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the desired sum: ");
		int x=sc.nextInt();
		System.out.println("processing... ");
		boolean answer=findTriplet(arr, x);
		if(answer) System.out.println("There is a triple present");
		else System.out.println("No triplets present");
		sc.close();
		
	}
	public static boolean findTriplet(int a[], int sum) {
		for(int i=0; i<a.length-2; i++) {
			int required=sum-i;
			boolean isPresent=twoSum(a, required, i+1);
			if(isPresent) return true;
		}
		return false;
	}
	
	public static boolean twoSum(int a[], int requiredSum, int j) {
		int k=a.length-1;
		while(j<k) {
			if(a[j]+a[k]>requiredSum) k--;
			else if(a[j]+a[k]<requiredSum)j++;
			else return true;
		}
		return false;
	}

}
