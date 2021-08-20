package linkedLists;

public class UserCreatedLLExample {

	public static void main(String[] args) {
		UserCreatedLL<String> myLL= new UserCreatedLL<>();
		myLL.add("Hello ");
		myLL.add("World ");
		myLL.add("!");
		myLL.print();
	}

}
