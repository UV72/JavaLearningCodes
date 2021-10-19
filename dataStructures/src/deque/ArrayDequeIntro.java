package deque;
import java.util.ArrayDeque;

public class ArrayDequeIntro {

	public static void main(String[] args) {
		ArrayDeque<Integer> ad= new ArrayDeque<>();
		//used as a queue
		ad.addFirst(12);
		ad.addFirst(24);
		ad.pop();
		System.out.println(ad.peek());
		//used as a stack
		System.out.println("Now pushing 23 24 and 34 to existing 12");
		ad.push(23);
		ad.push(24);
		ad.push(34);
		System.out.println("Popping");
		System.out.println(ad.pop());
		System.out.println(ad.pop());
		System.out.println(ad.pop());
		System.out.println(ad.pop());
	}

}