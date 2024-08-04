class Solution {
	void quickSort (int[] arr) {
		// add your logic here
		quicksort( arr, 0 , arr.length-1);
	}
	void quicksort(int[] arr, int left, int right) {
        while (left < right) {
            int pivotIndex = partition(arr, left, right);
            // Recurse on the smaller subarray to reduce stack depth
            if (pivotIndex - left < right - pivotIndex) {
                quicksort(arr, left, pivotIndex - 1);
                left = pivotIndex + 1;
            } else {
                quicksort(arr, pivotIndex + 1, right);
                right = pivotIndex - 1;
            }
        }
    }

    int partition(int[] arr, int left, int right) {
        Random rand = new Random();
        int pivotIndex = left + rand.nextInt(right - left + 1);
        int pivot = arr[pivotIndex];
        swap(arr, pivotIndex, right); // Move pivot to the end

        int i = left;
        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, right);
        return i;
    }

    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}