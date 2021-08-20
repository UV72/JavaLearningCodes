package inheritance;
public class MainClass {

	public static void main(String[] args) {
		Singer s1= new Singer("lily");
		s1.eat();
		s1.sing();
		
		Teacher t= new Teacher("Raghav");
		Person p= t;//copies all properties of t to p. Up-casting as t is a child of person and p is of the type person
		System.out.println("p's name is:" +p.name);
		//p.teach();<== This is not possible because p is now a Person
		
		Person p2= p;//copies all properties of p into p2. p has properties of t but still is a person
		System.out.println("p2's name is: "+p2.name);
		
		//Singer t2=(Singer) p; returns runtime error as p is created from teacher not singer
		Teacher t2=(Teacher)p;//Does not cause error because p is made from teacher's properties only
		t2.teach();
		System.out.println("t2's name is:" +t2.name);
		
		System.out.println();
		System.out.println();
		boolean t2Teacher= t2 instanceof Teacher;
		System.out.println("Is t2 a Teacher?: "+ t2Teacher);
		System.out.print("Is t2 a person?: ");
		System.out.println(t2 instanceof Person);
		System.out.print("Is s1 a singer?: ");
		System.out.println(s1 instanceof Singer);
		System.out.println(t2.legs);
	}

}
