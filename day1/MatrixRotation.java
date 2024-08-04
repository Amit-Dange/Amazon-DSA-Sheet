// Matrix Rotation

// Given a matrix, rotate the matrix 90 degrees clockwise

public class MatrixRotation {
    int[][] rotateMatrix(int[][] matrix){
	    int r = matrix.length ;
		int c = matrix[0].length ;
		int[][]result = new int[c][r];
		for(int i = c-1 ; i >=0  ; i--){
			for(int j = 0 ; j < r ; j++){
				result[i][j] = matrix[r-1-j][i];
			}
		}
		return result ;
	}
}
