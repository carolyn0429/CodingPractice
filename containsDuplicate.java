public boolean containsDuplicate(int[] nums) {

	if (nums==null || nums.length==0) return false;
	HashSet<Integer> set = new HashSet<Integer>();
	for (int i: nums){
		if (!set.add(i)) return true;
	}

	// set.add return true if added, return false if the element is contained.
	return false;
}


/*
Given an array of integers and an integer k, 
return true if and only if there are two distinct indices i and j 
in the array such that nums[i] = nums[j] and 
the difference between i and j is at most k.
*/

public boolean containsNearbyDuplicate(int[] nums, int k) {
        
	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    //int gap = Integer.MAX_VALUE;

	for (int i=0;i<nums.length;i++){
	 
		if (map.containsKey(nums[i])){
		    int prev_idx = map.get(nums[i]);
		    if (i-prev_idx <=k) return true;
		    
			
		}
		map.put(nums[i],i);
	}
	return false;
    }


/*
Given an array of integers, find out whether there are two distinct indices 
i and j in the array such that the difference 
between nums[i] and nums[j] 
is at most t and the difference between i and j is at most k.
*/
/*refer to http://pisxw.com/algorithm/Contains-Duplicate-III.html*/
import java.util.SortedSet;  
public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
	if(k<1 || t<0 || nums==null) return false;  
          
        SortedSet<Long> set = new TreeSet<Long>();  
          
        for(int j=0; j<nums.length; j++) {  
            SortedSet<Long> subSet =  set.subSet((long)nums[j]-t, (long)nums[j]+t+1);  
            if(!subSet.isEmpty()) return true;  
              
            if(j>=k) {  
                set.remove((long)nums[j-k]);  
            }  
            set.add((long)nums[j]);  
        }  
        return false;  

}