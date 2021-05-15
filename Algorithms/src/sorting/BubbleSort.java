package sorting;
import java.util.Scanner;

public class BubbleSort {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("please enter the length of the array");
	int length= sc.nextInt();
	int a[]= new int[length];
	
	System.out.println("please enter the array");
	for(int i=0; i<a.length; i++) {
		a[i]=sc.nextInt();
	}
	int n=length;
	
	for(int i=0; i<n-1; i++) {
		
		boolean sorted= true;
		for(int j=0; j<n-1-i; j++) {
			if(a[j]>a[j+1]) {
				int temp=0;
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				sorted=false;
			}
		}
		if(sorted) break;
	}
	for(int item: a) {
		System.out.print(item+" ");
	}
	sc.close();
}
}
