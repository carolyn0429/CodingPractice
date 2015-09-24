/*Write a function that takes an array and a number and rotate the array right by that number.  
*/

public class RotateArray {

	public void rorateArray(int[] input, int n){
		n= n % (input.length);
		int[] copyInput = new int[input.length];
		int pos = 0;
		for (int i=0;i<input.length;i++){
			
			if (i+n<input.length){
				pos = i+n;
			}else{
				pos = Math.abs(input.length-(i+n));
			}
			 copyInput[i]=input[pos];
			System.out.println(copyInput[i]);
		}
		
	}

	public static void main(String[] args){
		
		int[] input = {1,2,3,4,5};
		int n=2;
		RotateArray ra = new RotateArray();
		ra.rorateArray(input, n);
	}
}
