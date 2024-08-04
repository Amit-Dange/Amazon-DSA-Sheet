// Given a number n, find the nth row of pascal’s triangle.

public class pascalsTriangle {
    int[] pascalTriangleRow(int rowNo) {
		// int n = 
		int []lastr = new int[rowNo];
		lastr[0] = 1 ;
		lastr[rowNo-1] = 1;
		for(int i = 1 ; i < rowNo-1 ; i++){
			int prev = lastr[i-1];
			lastr[i] = prev*(rowNo -i)/i;
		}
		return lastr ;
	}
}
