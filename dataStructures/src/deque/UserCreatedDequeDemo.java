package deque;

public class UserCreatedDequeDemo {

	public static void main(String[] args) throws Exception{
		UserCreatedDeque<Integer> ud= new UserCreatedDeque<>();
		ud.addFirst(12);
		ud.addFirst(24);
		ud.addFirst(32);
		ud.addFirst(42);
		System.out.println(ud.removeLast());
	}

}
