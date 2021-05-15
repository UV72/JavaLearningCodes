package twopointers;

public class PairSum {
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
