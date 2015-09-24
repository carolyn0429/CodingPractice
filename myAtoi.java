public int myAtoi(String str) {
        
    //empty null string
    if (str==null || str.length()<1) return 0;
	
	//white space
	str = str.trim();	
	
	//+/-
	char flag='+';
	int i=0;
	if (str.charAt(0)=='-'){
		flag='-';
		i++;

	}else if (str.charAt(0)=='+'){
		i++;
	}

	

	//calculate real value
	double result=0;
	while(str.length()>i && str.charAt(i)>='0' && str.charAt(i)<='9'){
		result = result * 10 + (str.charAt(i)-'0');
		i++;
	}
	if (flag=='-') result = -result;

	//min & max
	if (result>Integer.MAX_VALUE) return Integer.MAX_VALUE;
	if (result<Integer.MIN_VALUE) return Integer.MIN_VALUE;
	return (int)result;

}