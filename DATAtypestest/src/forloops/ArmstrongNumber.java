package forloops;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		for(int i=0; i<=9; i++) {
			for(int j=0; j<=9; j++) {
				for(int k=0; k<=9; k++) {
					
					int number=(100*i)+(10*j)+(k);
					if( (i*i*i)+(j*j*j)+(k*k*k) == number ) 
						{
							System.out.println(number);
						}
				}
			}
		}
	}

}
