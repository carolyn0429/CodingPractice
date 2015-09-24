public List<String> anagrams(String[] strs) {
 	List<String> res = new ArrayList<String>();

 	if (strs==null || strs.length==0) return res;

        HashMap<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();
        for (int i=0;i<strs.length;i++){
            char[] charFromString = strs[i].toCharArray();
           	Arrays.sort(charFromString);
            String str = String.valueOf(charFromString);
            if (map.get(str)==null){
                ArrayList<Integer> nonExisted = new ArrayList<Integer>();
                nonExisted.add(i);
                map.put(str,nonExisted);
            }else{
                map.get(str).add(i);
            }
            
        }
        //find out the size of List more than 1
        for (ArrayList<Integer> arr: map.values()){
        	if (arr.size()>1){
        		for (Integer i: arr){
        			res.add(strs[i]);
        		}
        	}
        }
        return res;
}