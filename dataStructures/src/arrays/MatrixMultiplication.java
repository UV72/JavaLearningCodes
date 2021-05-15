package arrays;
import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the rows and columns in first matrix:");
		int rows1= sc.nextInt();
		int columns1= sc.nextInt();
		sc.nextLine();
		System.out.println("enter the rows and columns in second matrix:");
		int rows2= sc.nextInt();
		int columns2= sc.nextInt();
		
		
	if(columns1==rows2) {
		int matrix1[][]= new int[rows1][columns1];
		int matrix2[][]= new int[rows2][columns2];
		int matrix3[][]= new int[rows1][columns2];
		
		System.out.println("please enter the first matrix");
		for(int i=0; i<rows1; i++) {
			for(int j=0; j<columns1; j++) {
				matrix1[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("please enter the second matrix");
		for(int i=0; i<rows2; i++) {
			for(int j=0; j<columns2; j++) {
				matrix2[i][j]= sc.nextInt();
			}
		}
		
		//calculation of the product
		for(int i=0; i<rows1; i++) {
			for(int j=0; j<columns2; j++) {
				for(int k=0; k<(columns1); k++) {
					matrix3[i][j]+= ( matrix1[i][k]* matrix2[k][j] );
				}
			}
		}
		
		System.out.println("the product is");
		for(int i=0; i<rows1; i++) {
			for(int j=0; j<columns2; j++) {
				System.out.print(matrix3[i][j]+" ");
			}
			System.out.println();
		}
	}
	else {
		System.out.println("multiplication of these two matrices is not possible");
	}
	sc.close();
	}

}
