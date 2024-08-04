// Row Column Zero

// Given a matrix, if any of the cells in the matrix is 0, set all the elements in its row and column to 0.


import java.util.ArrayList;
import java.util.List;

public class RowColZero {
    void makeZero(int r , int c , int [][] matrix){
		for(int i = 0 ; i < matrix.length ; i++){
			matrix[i][c] = 0 ;
		}
		for(int i = 0 ; i < matrix[0].length ; i++){
			matrix[r][i] = 0 ;
		}
	}
	void setRowColumnZeroes(int[][] matrix){
	    List<List<Integer>> list = new ArrayList<>();
		int r = matrix.length ;
		int c = matrix[0].length ;
		for(int i = 0 ; i < r ; i++){
			for(int j = 0 ; j < c ; j++){
				if(matrix[i][j] == 0){
					List<Integer>arr = new ArrayList<>();
					arr.add(i);
					arr.add(j);
					list.add(arr);
				}
			}
		}
		for(int i = 0 ; i < list.size() ; i++){
			int rz = list.get(i).get(0);
			int cz = list.get(i).get(1);
			makeZero(rz , cz , matrix);
		}
	}
}
