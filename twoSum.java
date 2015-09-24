public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i=0;i<nums.length;i++){
            if (!map.containsKey(nums[i])){
                map.put(target-nums[i],i+1);
            }else{
                res[0] = map.get(nums[i]);
                res[1]=i+1;
            }
            
        }
        return res;
    }


public void sortColors(int[] nums) {
    int red=0;
    int blue = nums.length-1;
    int white = red;
    for (int i=0;i<nums.length;i++){
        if (nums[white]==0){
            swap(nums, white, red);
            white++;
            red++;
        }else if (nums[white]==2){
            swap(nums, white, blue);
            blue--;
        }else{
            white++;
        }
    }
}

public void swap(int[] nums, int a, int b){
    int temp=nums[a];
    nums[a] = nums[b];
    nums[b] = temp;
}