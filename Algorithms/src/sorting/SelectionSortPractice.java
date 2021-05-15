package sorting;
import java.util.Scanner;

public class SelectionSortPractice {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of the array:");
		int length=sc.nextInt();
		int a[]= new int[length];
		System.out.println("enter the array now:");
		for(int i=0; i<length; i++) {
			a[i]=sc.nextInt();
		}
		sc.close();
		
		for(int i=0; i<length; i++) {
			int minIndex=i;
			for(int j=i; j<length; j++) {
				if(a[j]<a[minIndex]) {
					minIndex=j;
				}
			}
			
			int temp=a[i];
			a[i]=a[minIndex];
			a[minIndex]=temp;
		}
		
		for(int arr: a) {
			System.out.print(arr+ " ");
		}
	}

}
