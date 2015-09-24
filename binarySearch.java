public static int binarySearch(int A[] int l, int u, int x){
	while(l<=u){
		int m=(l+u)/2;
		if (x==A[m]) return m;
		else if (A[l]<=A[m]){
			if (x>=A[l]) u=m-1;
			else if (x>A[m])l=m+1;
		}
	}
}

//using DP
public int maxSubArray(int[] A) {
	int newSum=A[0];
	int maxSum = A[0];
	for (int i=1;i<A.length;i++){
		newSum = Math.max(newSum+A[i], A[i]);
		maxSum = Math.max(newSum, maxSum);
		
	}
	return maxSum;
}