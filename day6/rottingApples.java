package day6;

import java.util.LinkedList;
import java.util.Queue;

public class rottingApples {
    int getDaysToRot(int[][] grid) {
	    int n = grid.length ;
		int m = grid[0].length;
		int freshapp = 0 ;
		// int rottapp = 0 ;
		Queue <int[]> queue = new LinkedList<>();
		
		for(int i = 0 ; i < n ; i++){
			for(int j = 0 ; j < m ; j++){
				if(grid[i][j] == 1){
					freshapp++;
				}
				if(grid[i][j] == 2){
					queue.offer(new int[]{i , j});
				}
			}
		}
		int time = 0;
		int dir[][] = { {-1,0} , {1,0} , {0,-1} , {0,1} } ;
		
		while(!queue.isEmpty() && freshapp > 0){
			int size = queue.size();
			
			for(int i = 0 ; i < size ; i++){
				int[] curr = queue.poll();
				for(int []direction : dir ){
					
					int newr = curr[0] + direction[0];
					int newc = curr[1] + direction[1];
					if(newr >=0 && newc >=0 && newr < n && newc < m &&  grid[newr][newc] == 1){
						grid[newr][newc] = 2;
						queue.offer(new int[]{newr , newc});
						freshapp--;
					}
				}
				
			}
			time++;
			
		}
		return freshapp == 0 ? time : -1 ;
		
	}
}
