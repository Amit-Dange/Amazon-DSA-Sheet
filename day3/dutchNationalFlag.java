// Dutch National Flag

// Sort an array A where each of the elements belong to the set: {0, 1, 2}.
// Expected Time Complexity: O(n)

// Try to solve it without storing the count of 0s, 1s and 2s.

class dutchNationalFlag {
	void swap(int []A , int ind1 , int ind2 ){
		int temp = A[ind1];
		A[ind1] = A[ind2];
		A[ind2] = temp ;
	}
	void sortTheArray (int[] A) {
	    // add your logic here
		int start = 0 ;
		int end = A.length-1;
		int ind = 0 ;
		while(ind <= end){
			if(A[ind] == 0){
				swap(A , ind , start);
				ind++;
				start++;
			}
			else if(A[ind] == 2){
				swap(A, ind , end);
				end--;
			}else{
				ind++;
			}
		}
	}
}