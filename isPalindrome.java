 public boolean isPalindrome(String s)『
 	if (s="") return true;

 	// replace all special chars to "" and to lowercase
 	s = s.replaceAll("[^a-zA-Z0-9]").toLowerCase();
 	int len = s.length();
 	for(int i=0;i<len; i++){
 		if (s.charAt(i) != s.charAt(len-i-1)){
 			return false;
 		}
 	}
 	return true;
 }