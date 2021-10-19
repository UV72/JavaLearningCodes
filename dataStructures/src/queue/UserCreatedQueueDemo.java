package queue;

public class UserCreatedQueueDemo {

	public static void main(String[] args) {
		UserCreatedQueue<Integer> q= new UserCreatedQueue<Integer>();
		q.enqueue(15);
		q.enqueue(20);
		q.enqueue(25);
		q.enqueue(45);
		
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.element());
	}

}
