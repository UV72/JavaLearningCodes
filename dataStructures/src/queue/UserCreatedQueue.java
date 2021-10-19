package queue;
import linkedLists.UserCreatedLL.Node;

public class UserCreatedQueue <E>{
	private Node<E> head, rear;
	
	public void enqueue(E e) {
		Node<E> toAdd= new Node<>(e);
		if(head==null) {
			head=rear=toAdd;
			return;
		}
		
		rear.next=toAdd;
		rear=rear.next;
	}
	
	public E dequeue() {
		if(head==null) {
			return null;
		}
		Node<E> removed= new Node<>(null);
		removed=head;
		head=head.next;
		if(head==null) rear=null;//because rear would still be holding value if there is a single element in queue
		
		return removed.data;
	}
	
	public E element() {
		return head.data;//peak without removal
	}
}
