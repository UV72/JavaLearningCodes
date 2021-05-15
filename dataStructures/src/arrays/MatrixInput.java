package arrays;
import java.util.Scanner;

public class MatrixInput {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the rows and columns in first matrix:");
	int rows1= sc.nextInt();
	int columns1= sc.nextInt();
	int matrix1[][]= new int[rows1][columns1];
	System.out.println("please enter the first matrix");
	for(int i=0; i<rows1; i++) {
		for(int j=0; j<columns1; j++) {
			matrix1[i][j]=sc.nextInt();
		}
	}
	sc.close();
	System.out.println("the matrix is");
	for(int i=0; i<rows1; i++) {
		for(int j=0; j<columns1; j++) {
			System.out.print(matrix1[i][j]+" ");
		}
		System.out.println();
	}
}
}
