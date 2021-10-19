package linkedLists;

public class UserCreatedLL <E>{
	
	public static class Node<E>{
		public E data;	//data stored in node
		public Node<E> next;	//stores the next node (reference)
		
		public Node(E data) {
			this.data=data;	//sets the current node's data to the passed value
			next=null;	//a new node will not have any next element unless added
		}
	}
	
	Node<E> head;	//the first node
	
	public boolean isEmpty(){
		//this checks if the list is empty
		if(head==null) return true;
		else return false;
	}
	public void add(E data) {
		//this function adds a node to the LL
		Node<E> toAdd= new Node<>(data);
		if(head==null) {
			//If the head is null, no next element can be accessed or it will throw null poEer exception
			head=toAdd;	//Hence, in this case toAdd becomes our head
			return;
		}
		
		Node<E> temp=head;
		while(temp.next!=null) {
			temp=temp.next; //This makes the address of temp the same as the next node, After the complete iteration 
							//we would have arrived at the final node
		}
		
		temp.next=toAdd;	//This gives reference of the toAdd node to the last node and thus
							//toAdd will be considered linked successfully to the list.
	}
	public void print() {
		if(head==null) System.out.println("The list is empty");
		else {
			Node<E> temp=head;
			while(temp!=null) {
				//Runs until temp is null not temp.next meaning the last node has also been crossed
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
		}
	}
	public E removeLast() throws Exception{
		//this function removes the last element of list
		Node<E> temp=head;
		Node<E> removed=null;
		
		if(temp==null)throw new Exception("The list is empty");
		if(temp.next==null) {
			//Only one element is present which will be removed
			removed=temp;
			temp=null;
			return removed.data;
		}
		while(temp.next.next!= null) {
			temp=temp.next;
		}
		removed=temp.next;
		temp.next=null;
		return removed.data;
	}
	public E getLast() throws Exception{
		if(head==null) throw new Exception("The list is empty");
		Node<E> temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		return temp.data;
	}
}
