/*
Given a sorted integer array without duplicates, return the summary of its ranges.

For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].
*/

public List<String> summaryRanges(int[] nums) {

	List<String> res = new ArrayList<String>();
	
	int i=0;
    while(i<nums.length){
    	String s="";
    	s+=nums[i];
    	if (i<nums.length-1 && nums[i]+1==nums[i+1]){
    		s+="->";
    		while(i<nums.length-1 && nums[i]+1==nums[i+1]){
    			i++;
    		}
    		s+=nums[i];
    	}
    	res.add(s);
    	s = new String();
    	i++;
    }
    return res;	
    
}