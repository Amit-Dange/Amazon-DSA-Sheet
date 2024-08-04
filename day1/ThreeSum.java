// Three Sum
// Given an array A, find all unique triplets in the array whose sum is equal to zero.

// Example:
// A: [1, 1, 0, -1, -2]
// Triplets: [
//   [-2, 1, 1],
//   [-1, 0, 1]
// ]
class Solution {
	List<List<Integer>> threeSum(int[] A) {
	    // add your logic here
		List<List<Integer>> result = new ArrayList<>();
		int n = A.length ;
		Arrays.sort(A);
		
		for(int i = 0 ; i < n ; i++ ){
			if(i > 0 && A[i]==A[i-1]){
				continue ;
			}
			int left = i+1;
			int right = n-1;
			while(left < right){
				int sum = A[i] + A[left] + A[right];
				if(sum == 0){
					result.add(Arrays.asList(A[i] , A[left] , A[right]));
					while(left <right && A[left]==A[left+1]){
						left++;
					}
					while(left <right && A[right]==A[right-1]){
						right--;
					}
					left++;
					right--;
				}			
				else if(sum < 0){
					left++;
				}
				else{
					right--;
				}
			}
		}
		return result ;
	}
}