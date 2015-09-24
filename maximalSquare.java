public int maximalSquare(char[][] matrix) {
	
	int currentMaxSize=1;
	int n=matrix[0].length;
	int m=matrix.length;
	for (int i=0;i<m-1;i++){
		for (int j=0;j<n-1;n++){
			while(i<m){
				int k=1;
				if (matrix[i+1][j] ==1 && matrix[i][j+1]==1 && matrix[i+1][j+1]==1){
					k++;
					currentMaxSize = Math.max(currentMaxSize, k*k);
				}
				i++;
			}

		}
	}
	return currentMaxSize;

}