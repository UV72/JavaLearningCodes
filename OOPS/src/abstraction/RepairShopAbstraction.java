package abstraction;

public class RepairShopAbstraction {

	public static void main(String[] args) {
		Hyundai h1= new Hyundai();
		Kia k1= new Kia();
		
		repairCar(h1);
		repairCar(k1);
	}
	public static void repairCar(Car car) {
		System.out.println("The car is repaired");
	}

}
//Here we only had to define the repairCar method one time for all the cars which extend this Car class
//This would be very useful if there were multiple cars present


abstract class Car{
	public abstract void accelerate();
	public abstract void brake();
}

class Hyundai extends Car{
	public void accelerate() {
		System.out.println("WagonR is accelerating");
	}
	public void brake() {
		System.out.println("WagonR is braking");
	}
}

class Kia extends Car{
	public void accelerate() {
		System.out.println("Audi is accelerating");
	}
	public void brake() {
		System.out.println("Audi is braking");
	}
}