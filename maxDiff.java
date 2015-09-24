/*
Find the maximum difference between two elements in an array 
s.t larger element appears after the smaller element in the array.
For e.g, consider the array { 3, 2, 6, 9, 5 } .
Maximum difference between 2 elements in the array is 7 ( 9 - 2 ) & 
9 appears after 2 in the array. 
*/

public int maxDiff(arr[]){
	int maxDiff=arr[1]-arr[0];
	int minElement=arr[0];
	for (int i=1;i<arr.length;i++){
		if (arr[i]-minElement>maxDiff){
			maxDiff = arr[i]-minElement;			
		}
		if(arr[i]<minElement){
			minElement=arr[i];
		}
	}
	return maxDiff;
}