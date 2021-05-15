package interfacesPackage;

public class Person implements Student, YouTuber{

	public static void main(String[] args) {
		Person p1= new Person();
		p1.makeVideo();
		p1.study();
	}

	@Override
	public void makeVideo() {
		System.out.println("Person is making a good video");
	}

	@Override
	public void study() {
		System.out.println("Person is Studying");
	}

}
