package forloops;

public class ArmstrongLongMethod {

	public static void main(String[] args) {
		int remainder, temp, sum;
		remainder=0;
		temp=0;
		sum=0;
		
		for(int i=0; i<=1000; i++) {
			temp=i;
			
			do{
		        remainder=temp%10;
		        sum=sum+(remainder*remainder*remainder);
		        temp/=10;
		    }while(temp>0);
			
			if(sum==i) System.out.println(i);
			
		}
	}

}
