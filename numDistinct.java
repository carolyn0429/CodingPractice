/*
Given a string S and a string T, count the number of distinct subsequences of T in S.

A subsequence of a string is a new string which is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (ie, "ACE" is a subsequence of "ABCDE" while "AEC" is not).

Here is an example:
S = "rabbbit", T = "rabbit"

Return 3.
*/

public int numDistinct(String s, String t) {
	  

		if(s==null || t==null) return Math.max(s.length,t.length);
		if(s.length==0 && t.length==0) return 0;
		int max_length = Math.max(s.length(),t.length());
		String max_string =null;
		int count=0;
		if (s.length>=t.length) 
			max_string=s;
		else 
			max_string=t;

		for (int i=0;i<max_length;i++){
			if(s.charAt(i)==t.charAt(i)) continue;
			else{
				if (s.charAt(i)==null || t.charAt(i)==null){
					count+= max_string.length()-i;
					break;
				}else{
					count++;
				}
			}
		}
		return count;
}