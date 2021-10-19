package interviewQuestions;
import java.util.*;

public class SlidingWindowMaximum {

	static class Solution{
		public int[] maxSlidingWindow(int [] a, int k) {
			Deque<Integer> dq= new LinkedList<>();
			int i=0;
			int len=a.length;
			int ans[]= new int[len-k+1];
			
			for( ; i<k; i++) {
				while(!dq.isEmpty() && a[dq.peekFirst()]<=a[i]) {
					//remove elements which are smaller than current
					dq.removeLast();
				}
				//filling the first k elements
				dq.addLast(i);
			}
			
			for( ; i<len; i++) {
				ans[i-k]=a[dq.peekFirst()];
				while(!dq.isEmpty() && dq.peekFirst()<=i-k) {
					//removing the elements (indices) which are out of window
					dq.removeFirst();
				}
				
				while(!dq.isEmpty() && a[dq.peekFirst()]<=a[i]) {
					//removing elements which are smaller than current
					dq.removeLast();
				}
				dq.addLast(i);
			}
			ans[i-k]=a[dq.peekFirst()];
			return ans;
		}
	}
}