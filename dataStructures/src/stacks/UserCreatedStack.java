package stacks;
import linkedLists.UserCreatedLL;

public class UserCreatedStack <E>{
	private UserCreatedLL <E> myStack= new UserCreatedLL<>();
	
	public void push(E toInsert) {
		myStack.add(toInsert);
	}
	public E pop() throws Exception{
		if(myStack.isEmpty()) throw new Exception("The stack is already empty");
		E removed=myStack.removeLast();
		return removed;
	}
	public E peek() throws Exception{
		return myStack.getLast();
	}
}
