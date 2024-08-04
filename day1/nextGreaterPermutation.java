import java.util.Arrays;

// Next Greater Permutation

// Given an array, rearrange it to its next greater permutation. 
// Do it in-place with extra constant memory only. Do not use any library 
// function for the next permutation.

public class nextGreaterPermutation {
    void nextGreaterPermutation (int[] arr) {
		int ind = -1;
		int n = arr.length ;
		for(int i = n-2 ; i >= 0;i--){
			if(arr[i] >= arr[i+1]){
				continue ;
			}
			ind = i ;
			break ;
		}
		if(ind == -1){
			Arrays.sort(arr);
			return ;
		}
		for(int i = n-1 ; i > ind ; i--){
			if(arr[i] > arr[ind]){
				int temp = arr[i];
				arr[i] = arr[ind];
				arr[ind] = temp;
				break ;
			}
		}
		 reverse(arr, ind + 1, n - 1);
	}
	void reverse(int[] arr , int start , int last){
		while(start < last){
			int temp = arr[start];
			arr[start] = arr[last];
			arr[last] = temp;
			start++;
			last--;
		}
	}
}
