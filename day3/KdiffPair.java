// k-diff pairs

// Given a sorted array A of size n and a number k, return the number of unique pairs which have a difference of k.
// |arr[i] - arr[j]| = k where i < j

import java.util.*;
class KdiffPair {
	int kDiffPairs (int[] A, int k) {
		// add your logic here
		if(k < 0) return 0;
		Set<Integer>hset1 = new HashSet<>();
		Set<Integer>hset2 = new HashSet<>();

		for(int num : A){
			if(hset1.contains(num-k)){
				hset2.add(num-k);
			}
			hset1.add(num);
		}
		return hset2.size() ;
	}
}
