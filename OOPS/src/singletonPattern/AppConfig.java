package singletonPattern;

public class AppConfig {
	private AppConfig() {
		//here we have made this constructor private as we do not want another object of this class to be created
		
	}
	private static AppConfig obj= null;//This is assigned null here because we do not want an object to be created if its not necessary or not called
	
	public static AppConfig getInstance() { //here the return type is AppConfig as this method will return an object of type AppConfig
		if(obj==null) obj=new AppConfig();
		return obj;
	}
}

/*
 Here, we could have also used a cleaner approach which is not very optimized to declare an object
 
 private static AppConfig obj=new AppConfig();
 public static AppConfig getInstance(){
 	return obj;
 }
 
 //This allocates memory to the object even if it's not required in a particular program, so is not recommended.
*/