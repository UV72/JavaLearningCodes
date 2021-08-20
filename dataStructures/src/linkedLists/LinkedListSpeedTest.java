package linkedLists;
import java.util.*;

public class LinkedListSpeedTest {

	public static void main(String[] args) {
		List<Integer> al= new ArrayList<>();
		List<Integer> ll= new LinkedList<>();
		getBackAddTime(al);//Time taken to add an element at the back of list
		getBackAddTime(ll);
		
		System.out.println();
		
		getInsertTime(al);//Time taken to insert an element at the front of list
		getInsertTime(ll);
	}
	static void getBackAddTime(List <Integer> lst) {
		long start=System.currentTimeMillis();//This function returns the time elapsed after January 1 1970, used here to calculate time difference
		for(int i=0; i<1000000; i++) {
			lst.add(i);
		}
		long end=System.currentTimeMillis();
		long timeTaken=end-start;
		System.out.println(lst.getClass().getName()+" Has taken "+ timeTaken+ " miliseconds to append an element at back");
		//This obj.getClass().getName returns the name of the class which is extended by the current object
	}
	
	static void getInsertTime(List <Integer> lst) {
		long start=System.currentTimeMillis();//This function returns the time elapsed after January 1 1970, used here to calculate time difference
		for(int i=0; i<10000; i++) {
			lst.add(0, i); //add i to 0th index
		}
		long end=System.currentTimeMillis();
		long timeTaken=end-start;
		System.out.println(lst.getClass().getName()+" Has taken "+ timeTaken+ " miliseconds to insert an element at the front");
	}

}
