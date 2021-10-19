package interviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class FindKLargestElementsFromList {
	public static ArrayList<Integer> kLargest(int arr[], int n, int k)
    {
        PriorityQueue<Integer> pq= new PriorityQueue<Integer>();
        ArrayList<Integer> ans= new ArrayList<>();
        for(int i=0; i<k; i++){
            pq.add(arr[i]);
        }
        for(int i=k; i<n; i++){
            if(arr[i]>pq.element()){
                pq.remove();
                pq.add(arr[i]);
            }
        }
        while(!pq.isEmpty()){
            ans.add(pq.remove());
        }
        Collections.reverse(ans);
        return ans;
    }
}
