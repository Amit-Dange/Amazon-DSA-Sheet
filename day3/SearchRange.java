// Search Range

// Given a sorted array and a number key, find the index of the first and last occurrence of the key in the array.
// If the key is not present, return [-1, -1].

// Expected Time Complexity: O(log n)

public class SearchRange {
    int[] searchRange (int[] arr, int key) {
		// add your logic here
		int ans[] = {-1 ,-1};
		int left = 0 ; 
		int right = arr.length-1;
		while(left < right){
			int mid = left + (right-left)/2 ;
			if( key > arr[mid]){
				left = mid + 1 ;
			}
			else{
				right = mid ;
			}
		}
		if(arr[left] != key){
			return ans ;
		}
		ans[0] = left ;
		right = arr.length - 1 ;
		while(left < right){
			int mid = left + (right-left)/2 +1;
			if( key < arr[mid]){
				right = mid - 1 ;
			}
			else{
				left = mid ;
			}
		}
		ans[1] = right ;
		return ans ;
	}
}
