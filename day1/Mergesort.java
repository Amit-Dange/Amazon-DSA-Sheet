// Merge Sort Algo

class Solution {
	void mergeSort (int[] arr) {
		// add your logic here
		int n = arr.length ;
		int left = 0 ;
		int right = n-1;
		
		mergesort(arr , left , right);
	}
	
	void mergesort(int[] arr , int left , int right){
		if(left < right){
			int mid = (left + right)/2;
			mergesort(arr , left , mid);
			mergesort(arr , mid+ 1 , right);
			merge(arr , left , mid , right);
		}
	}
	void merge(int []arr , int start , int mid, int end){
		int s1 = mid - start + 1 ;
		int s2 = end - mid ;
		int []left = new int[s1];
		int []right = new int[s2];
		System.arraycopy(arr , start , left , 0 , s1);
		System.arraycopy(arr , mid+1 , right , 0 , s2);
		int i = 0 , j = 0 , k = start ;
		while(i < s1 && j < s2){
			if(left[i] <= right[j]){
				arr[k] = left[i];
				i++;
			}else{
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		while(i < s1){
			arr[k]=left[i];
			i++;
			k++;
		}
		while(j < s2){
			arr[k] = right[j];
			j++;
			k++;
		}
	}
}
