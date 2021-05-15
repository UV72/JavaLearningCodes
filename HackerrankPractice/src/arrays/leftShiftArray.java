package arrays;
import java.util.Scanner;

public class leftShiftArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of the array");
		int length=sc.nextInt();
		int arr[]= new int[length];
		System.out.println("enter the elements of the array");
		
		for(int i=0; i<length; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("how many rotations do you want?: ");
		int rotations=sc.nextInt();
		
		int temp=0;
		for(int i=0; i<rotations; i++) {
			temp=arr[0];
			for(int j=0; j<length-1; j++) {
				arr[j]=arr[j+1];
			}
			arr[length-1]=temp;
		}
		
		for(int i=0; i<length; i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
		
	}

}
