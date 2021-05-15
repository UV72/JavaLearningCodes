package constructors;

class vehicles{
	int wheels, doors;
	
	vehicles(int tires, int noOfDoors){
		wheels=tires;
		doors=noOfDoors;
	}
}

public class ParameterizedConstructors {

	public static void main(String[] args) {
		vehicles car= new vehicles(4, 4);
		vehicles bike= new vehicles(2, 0);
		
		System.out.println("The car has "+ car.wheels+ " Wheels and " + car.doors+" doors");
		System.out.println("The bike has "+ bike.wheels+ " Wheels and "+ bike.doors+" doors");
	}

}
