public void insertionSort(int[] a){
	for (int i=1; i<a.length;i++){
	int temp=a[i];
		for (int j=i;j>=0 && temp<=a[j];j--){
			if (a[j-1]>a[j]){
				int temp = a[j-1];
				a[j-1] = a[i];
				a[i] = temp;
			}
		}
}