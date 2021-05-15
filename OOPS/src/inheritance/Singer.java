package inheritance;

public class Singer extends Person{
	public Singer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void sing() {
		System.out.println("Singer "+ name+ " is singing");
	}
}
