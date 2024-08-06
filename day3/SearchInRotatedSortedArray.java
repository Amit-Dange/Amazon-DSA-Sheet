// Search Rotated Sorted Array

// You are given a list of unique integers which are sorted but rotated at some pivot. You are also given a target value and you have to find its index in the list. If it is not present in the list, return -1.


public class SearchInRotatedSortedArray {
    int getElementIndex(int[] nums, int target) {
	    int left = 0 ;
        int right = nums.length -1 ;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(nums[mid] == target){
                return mid ;
            }
            if(nums[left] <= nums[mid]){
                // lefthalf is sorted
                if(nums[left] <= target && target < nums[mid]){
                    right = mid -1;
                }
                else{
                    left = mid + 1 ;
                }

            }
            else{
                // righthalf is sorted
                if(nums[mid] < target && target <= nums[right]){
                    left = mid +1;
                }
                else{
                    right = mid - 1 ;
                }
            }
        }
        return -1 ;
	}
}
