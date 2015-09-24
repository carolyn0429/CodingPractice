public String countAndSay(int n) {
        
        //convert int to string
	String s = String.valueOf(n);
	//convert string into char array to count each char
	char[] ch = s.toCharArray();

	//start iterating the loop and count each char
	//count for tracking each char
	int count=1;
	//cursor to go through the char array
	int i=0;
	//record the output 
	StringBuilder sb = new StringBuilder();

	//return result
	String result=null;
	// if input is null return null string
	if (ch.length==0 || ch==null){
		return null;
	}
	//if input is not empty
	if (ch.length==1){
		 
		 sb.append(count);
		 sb.append(ch[0]);
		 result = sb.toString();
		 break;
	}else{
		while(i+1<ch.length){

			//check next char is same as current char or not
			//if the same
			if (ch[i+1]==ch[i]){
				count++;
			}else{
				sb.append(count);
				sb.append(ch[i]);
				count=1;
				if (i+1==ch.length){
					sb.append(1);
					sb.append(ch[i+1]);
					break;
				}
			}
			i++;
		}//end while
		result = sb.toString;
	}//end else
	return result;
	
}