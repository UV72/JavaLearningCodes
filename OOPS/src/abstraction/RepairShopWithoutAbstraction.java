package abstraction;

public class RepairShopWithoutAbstraction {

	public static void main(String[] args) {
		WagonR w1= new WagonR();
		Audi a1= new Audi();
		
		repairCar(w1);
		repairCar(a1);
	}
	
	public static void repairCar(WagonR car) {
		System.out.println("The car has been repaired");
	}
	public static void repairCar(Audi car) {
		System.out.println("The car has been repaired");
	}
//Notice how we had to write two different methods for two different cars
//It could have been more if there were more cars
}
class WagonR{
	public void accelerate() {
		System.out.println("WagonR is accelerating");
	}
	public void brake() {
		System.out.println("WagonR is braking");
	}
}

class Audi{
	public void accelerate() {
		System.out.println("Audi is accelerating");
	}
	public void brake() {
		System.out.println("Audi is braking");
	}
}
