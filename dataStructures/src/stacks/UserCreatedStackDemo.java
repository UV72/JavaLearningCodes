package stacks;

public class UserCreatedStackDemo {

	public static void main(String[] args) throws Exception{
		//this code may throw exception so we have to specify it
		UserCreatedStack<Integer> userStack= new UserCreatedStack<>();
		userStack.push(15);
		userStack.push(20);
		userStack.push(30);
		userStack.push(45);
		
		System.out.println("removing "+ userStack.pop());
		System.out.println("The top element is " + userStack.peek());
	}

}
