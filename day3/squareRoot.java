// Square Root

// Given a non-negative integer 'n', compute and return the square root of 'n'. If n is not a perfect square, return the floor of the result.
// Note: Do not use the in-built methods to calculate square root or power.
// Expected Time Complexity: O(log n)

public class squareRoot {
    int searchRoot (int num) {
		// add your logic here
		if(num == 0 || num == 1 ){
			return num ;
		}
		int l = 1 ;
		int r = num +1 ;
		while(l < r){
			int mid = l + (r-l)/2;
			if(mid > num/mid){
				r = mid ;
			}
			else{
				l = mid + 1 ;
			}
		}
		return l-1 ;
	}
}
