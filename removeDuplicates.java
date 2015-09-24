public int removeDuplicates(int[] nums) {
        if(nums.length == 0 || nums.length == 1) return nums.length;
        int pos=0;
        int i=1;
       
        while(i<nums.length){

			if (nums[pos]==nums[i]){
        		i++;
        	}else{
        	    pos++;
        	    nums[pos]=nums[i];
        	    i++;
        	}
        

        }
   		return ++pos;
}