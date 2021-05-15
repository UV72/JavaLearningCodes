package polymorphism;

public class MainClass {

	public static void main(String[] args) {
		Dog d1= new Dog();
		Pet p1=d1;
		//Animal a1=d1; Used below in the comment
		
		d1.walk();
		p1.walk();
		//a1.walk(); This is undefined because we have not declared walk method in Animal class
	}

}
//the output is two times "Dog is walking" because of runtime polymorphism
//compiler does not know which method to call until it's run, hence it's runtime polymorphism
//the walk() in Dog class is overriding the walk in it's parent class . Hence runtime polymorphism is also called overloading
//also known as dynamic binding or late binding