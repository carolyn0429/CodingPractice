/*
 we need to check if there's a way to split s i into x and y such that xy = s i and yx = s2. Regardless of where the division between x and y is, we can seethat yx will always beasubstringof xyxy.That is,s2will alwaysbeasubstringof slsl.
	given isSubstring() call
*/
public boolean isRotation(String s1, String s2){
	//check if two length is equal
	int len=s1.length;
	if (len==s.length && len>0){
		String s1s1 = s1+s1;
		return isSubstring(s1s1,s2);
	}

	return false;
}