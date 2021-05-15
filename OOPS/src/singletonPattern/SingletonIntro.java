package singletonPattern;

public class SingletonIntro {
	
	public static void main(String[] args) {
		AppConfig obj1= AppConfig.getInstance();
		/*As getInstance is static which means it is a property of the class itself,
		  We can access it directly from the AppConfig class.
		*/
		AppConfig obj2= AppConfig.getInstance();//no matter how many times we make an object it will always be assigned the value of the one static object.
		System.out.println(obj1);
		System.out.println((obj2));
	}
}
