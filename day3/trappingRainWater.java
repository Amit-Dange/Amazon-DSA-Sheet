// Trapping Rain Water

// Given an array A where each element denotes a the height of blocks, calculate the total volume of water that can be trapped when it rains.
// Note: one cubic block has a volume of 1 unit.
class trappingRainWater {
	int volumeOfTrappedRainWater(int[] heights) {
	    // add your logic here
		int n = heights.length ;
		int leftmax = 0 ;
		int rightmax = 0 ;
		int l = 0 ;
		int r = n-1 ;
		int ans = 0 ;
		
		while(l < r){
			if(heights[l]>leftmax){
				leftmax = heights[l];
			}
			if(heights[r] > rightmax){
				rightmax = heights[r];
			}
			if(leftmax < rightmax){
				ans += (leftmax - heights[l]);
				l++;
			}
			else{
				ans += (rightmax - heights[r]);
				r--;
			}
		}
		return ans ;
	}
}
