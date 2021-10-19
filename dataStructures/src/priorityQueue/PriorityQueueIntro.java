package priorityQueue;
import java.util.PriorityQueue;

public class PriorityQueueIntro {

	public static void main(String[] args) {
		PriorityQueue<String> pq= new PriorityQueue<>();
		pq.add("Kiwi");
		pq.add("Apple");
		pq.add("Mango");
		pq.add("Banana");
		//some added elements maybe sorted others maybe not
		//but the removal is always in sorted form
		System.out.println(pq);
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
	}

}
