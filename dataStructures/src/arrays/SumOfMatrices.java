package arrays;
import java.util.Scanner;

public class SumOfMatrices {
public static void main(String [] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("please specify the nubmer of rows and columns in the matrics: ");
	int rows=sc.nextInt();
	int columns=sc.nextInt();
	
	int matrix1[][]= new int[rows][columns];
	int matrix2[][]=new int[rows][columns];
	int matrix3[][]=new int[rows][columns];
	
	for(int i=0; i<rows; i++){
		for(int j=0; j<columns; j++) {
			System.out.println("enter the element of matrix 1 at: " +(i+1)+","+(j+1));
			matrix1[i][j]=sc.nextInt();
		}
	}
	
	for(int i=0; i<rows; i++){
		for(int j=0; j<columns; j++) {
			System.out.println("enter the element of matrix 2 at: " +(i+1)+","+(j+1));
			matrix2[i][j]=sc.nextInt();
		}
	}
	
	for(int i=0; i<rows; i++){
		for(int j=0; j<columns; j++) {
			matrix3[i][j] =matrix1[i][j]+matrix2[i][j];
		}
	}
	
	System.out.println("the sum of the matrices is");
	System.out.println();
	
	for(int i=0; i<rows; i++) {
		for(int j=0; j<columns; j++) {
			System.out.print(matrix3[i][j]+"  ");
		}
		System.out.println();
	}
	sc.close();
}
	
}

