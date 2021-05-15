package sorting;
import java.util.Scanner;

public class SelectionSortWithInput {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter the length of the array");
		int n=sc.nextInt();
		System.out.println("now, please enter the array to perform sort");
		int a[]= new int[n];
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		sc.close();
		
		for(int i=0; i<n-1; i++) {
			int minIndex=i;
			for(int j=i; j<n; j++) {
				if(a[j]<a[minIndex]) {
					minIndex=j;
				}
			}
			int temp=a[i];
			a[i]=a[minIndex];
			a[minIndex]=temp;
		}
		
		
		for(int e:a) {
			System.out.print(e+ " ");
		}
	}

}
