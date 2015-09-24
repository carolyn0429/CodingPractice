public void sortColors(int[] nums) {
 	
 	//counting sort algorithm + two-pass
 	 if(nums==null||nums.length<2) return;
      int[] counter = new int[3];
      for (int i=0;i<nums.length-1;i++){
      	counter[nums[i]]++;
      }

      int index=0;
      for (int i=0;i<counter.length-1;i++){
      	int count = counter[i];
      	while(count>0){
      		nums[index] = i;
      		index++;
      		count--;
      	}
      } 

      //one-pass + constant space = two pointers (preferred)
      if(nums==null||nums.length<2) return;

      int red = 0;
      int blue = nums.length-1;

      int white = red;
      while(white<=blue){
      	if (nums[white]==0){
      		swap(nums, white, red);
      		red++;
      		white++;
      	}else if(nums[white]==2){
      		swap(nums, white, blue);
      		blue--;
      	}else{
      		white++;
      	}
      }    

}

public void swap(int[] nums, int a, int b){
	int tmp = nums[a];
	nums[a] = nums[b];
	nums[b] = tmp;
}