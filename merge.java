public void merge(int A[], int m, int B[], int n) {
	int len = m+n;
        int i=m-1;
        int j=n-1;
        int k=0;
       while(k<len){
                while(i>=0 && j>=0){
                    if (B[j] >= A[i]){
                        A[len-1-k] = B[j];
                        j--;k++;
                    }else{
                        A[len-1-k] = A[i];
                        i--;k++;
                    }
                }//while i,j
                if(i>=0){
                    A[len-1-k] = A[i];
                    i--;k++;
                }else{
                    A[len-1-k] = B[j];
                    j--;k++;
                }
        }   //while k        
}