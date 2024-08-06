// Kth Largest Element

// Given a list of numbers below:
// 4, 3, 6, 4, 1
// What is the largest element in the list? → 6
// What is the 3rd largest element in the list? → 4
// Given a list of numbers, find the kth largest element in the list.


import java.util.*;

class KthGreatestEle {
	int getKthLargestElement(int[] list, int k) {
	    // add your logic here
		Queue<Integer> pq = new PriorityQueue<>();
		for(int num : list){
			pq.offer(num);
			if(pq.size() > k){
				pq.poll();
			}
		}
		return pq.poll();
	}
}