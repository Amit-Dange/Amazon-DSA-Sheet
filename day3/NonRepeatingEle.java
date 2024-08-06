// Non-Repeating Element

// Given a sorted list of numbers in which all elements appear twice except one element that appears only once, find the number that appears only once.


public class NonRepeatingEle {
    int findNonRepeatingElement (int[] arr) {
		// add your logic here
		if(arr.length == 1){
			return arr[0];
		}
		int l = 0 ;
		int r = arr.length -1 ;
		while(l <r){
			int mid = l + (r-l)/2;
			if(mid %2 == 0){
				if(arr[mid] == arr[mid+1]){
					l = mid + 1; 
				}
				else{
					r = mid ;
				}
			}
			else{
				if(arr[mid] == arr[mid+1]){
					r = mid; 
				}
				else{
					l = mid + 1 ;
				}
			}
		}
		return arr[l] ;
	}
}
