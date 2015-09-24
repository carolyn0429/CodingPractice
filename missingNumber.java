public int missingNumber(int[] nums) {
        int sum=0;
        int idx=-1;
        
        for (int i=0;i<nums.length;i++){
            if (nums[i]==0) idx=i;
            else{
                sum+=nums[i];
            }
        }
        int total = (1+nums.length)*nums.length/2;
       
        return total-sum;
    }