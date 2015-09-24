public int lengthOfLongestSubstring(String s) {
        
        if(s==null || s.length()==0) return 0;
        int max_len=0;
        int cur_len=0;
        int start=0;
        HashMap<Character, Integer> map =  new HashMap<Character, Integer>();
        
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (map.containsKey(c)){
                if(map.get(c)>=start){
                    start = map.get(c)+1;
                }
            }
            map.put(c,i);
            cur_len = i-start+1;
            max_len = Math.max(max_len,cur_len);
        }
        return max_len;
        
    }