package stacks;
import java.util.Stack;

public class StackPushPopIntro {

	public static void main(String[] args) {
		Stack<Integer> myStack=new Stack<Integer>();
		myStack.push(15);
		myStack.push(20);
		myStack.push(109);
		myStack.push(475);
		int popped=myStack.pop();
		
		System.out.println(popped+ " popped");
		System.out.println("Stack is: " +myStack);
		System.out.println("The top head is: "+ myStack.peek());
		System.out.println("15 is present at: "+ myStack.search(15)+" position from top");
	}

}
