package linkedLists;

public class UserCreatedLL <E>{
	
	static class Node<E>{
		E data;	//data stored in node
		Node<E> next;	//stores the next node (reference)
		
		public Node(E data) {
			this.data=data;	//sets the current node's data to the passed value
			next=null;	//a new node will not have any next element unless added
		}
	}
	
	Node<E> head;	//the first node
	
	void add(E data) {//this function adds a node to the LL
		
		Node<E> toAdd= new Node<>(data);
		if(head==null) {//If the head is null, no next element can be accessed or it will throw null poEer exception
			
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
	void print() {
		if(head==null) System.out.println("The list is empty");
		else {
			Node<E> temp=head;
			while(temp!=null) {	//Runs until temp is null not temp.next meaning the last node has also been crossed
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
		}
	}
	
}
