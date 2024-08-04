// Two Sum
// Easy
// Given an array A and an integer target, 
// find the indices of the two numbers in the array whose sum is equal to the given target.
// Example
// A: [1, 3, 3, 4]
// target: 5
// Answer: [0, 3]
class Solution {
	int[] twoSum(int[] A, int target) {
	    // add your logic here
		int n = A.length ;
		Map<Integer , Integer>hmap = new HashMap<>();
		for(int i = 0 ; i < n ; i++){
			int num = target - A[i];
			if(hmap.containsKey(num)){
				int []arr = {i , hmap.get(num)};
				return arr ;
			}
			hmap.put(A[i] , i);
		}
		return null ;
	}
}