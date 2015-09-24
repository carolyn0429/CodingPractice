/*
Reverse digits of an integer.
Example1: x = 123, return 321
Example2: x = -123, return -321
*/

public int reverseInteger(int x) {
	//check if x is negative
	boolean flag=false;
	if (x<0) {
		flag=true;
		x=0-x;
	}

	//use mod and /10 to get each digit
	int res=0;
	int p=x;
	while(p>0){
		int lastDigit = p % 10;
		res = res*10+lastDigit;
		p/=10;
	}
	if (flag==true){
		return 0-res;
	}
		return res;
}