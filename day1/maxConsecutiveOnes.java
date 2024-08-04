// Max Consecutive Ones

// Given an array A, find the maximum number of consecutive 1s in the array.
class Solution {
	int getMaxConsecutiveOnes(int[] A) {
	    // add your logic here
		int maxcon = 0 ;
		int con = -1 ;
		for(int i = 0 ; i < A.length ; i++){
			if(A[i] == 1){
				maxcon++;
				con = Math.max(con , maxcon);
			}
			else{
				con = Math.max(con , maxcon);
				maxcon = 0 ;
			}
		}
		return con ;
	}
}