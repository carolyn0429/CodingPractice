public int singleNumber2(int[] nums) {
        int[] temp = new int[32];
        int ret=0;
        if (nums==null || nums.length==0){
            return 0;
        }
        for (int i=0;i<32;i++){
            for(int j=0;j<nums.length;j++){
                temp[i] += (nums[j]>>i)&1;
            }
        }
        
        for (int i=0;i<32;i++){
            ret += (temp[i]%3)<<i;
        }
        
        return ret;
    }