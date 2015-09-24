/*
Check a string for being a palindrome.  
*/

public boolean isPalindromePractice(String s){
	
	boolean res = false;
	int len = s.length;
	for (int i=0;i<s.length;i++){

		if (s.charAt(i)!=s.charAt(len-i)){
			res=false;
		}
	}
	res = true;
	return res;
}