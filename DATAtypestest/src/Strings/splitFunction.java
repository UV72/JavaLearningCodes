package Strings;

public class splitFunction {

	public static void main(String[] args) {
		String cars="Hyundai,Maruti,Swift,Wagonr,Ferrari,Lamborghini";
		String allCars[]=cars.split(",");
		
		for(String car: allCars) {
			System.out.println(car);
		}
	}

}
