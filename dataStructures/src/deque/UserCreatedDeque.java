package deque;

public class UserCreatedDeque <e>{
	Node<e> head, tail;
	//Add to the front function
	public void addFirst(e data) {
		Node<e> toAdd= new Node<e>(data);
		if(head==null) {
			head=tail=toAdd;
			return;
		}
		head.next=toAdd;
		toAdd.prev=head;
		head=toAdd;
	}
	
	//remove from the end function
	public e removeLast() throws Exception{
		if(head==null) throw new Exception("The Deque is empty");
		e removedData= tail.data;
		tail=tail.next;
		tail.prev=null;
		if(tail==null) head=null;
		return removedData;
	}
	
	
	//Static double ended node class
	public static class Node<e>{
		e data;
		Node<e> next, prev;
		
		public Node(e data){
			this.data=data;
			this.next=this.prev=null;
		}
	}
	
	
}
