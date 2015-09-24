public int[] plusOne(int[] digits) {
    int len = digits.length;
    boolean flag = true;//track the digit needs change

    for (int i=len-1;i>=0;i--){
    	if (flag){
    		if (digits[i]==9){
    			digits[i]=0;
    		}else{
    			digits[i] = digits[i]+1;
    			flag=false;
    		}//end if

    		if (i==0 && digits[i]==0){
    			int[] y = new int[len+1];
    			y[0]=1;
    			for (int j=1;j<=len;j++){
    				y[j]=digits[j-1];
    			}//end for
    			digits = y;
    		}
    	}
    }//end for
    return digits;    
}	