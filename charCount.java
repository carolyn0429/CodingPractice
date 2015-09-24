public static String charCount(String s){
		StringBuilder sb = new StringBuilder();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		if (s==null || s.length()==0) return null;
		for (int i=0;i<s.length(); i++){
			if (map.containsKey(s.charAt(i))){
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}else{
				map.put(s.charAt(i), 1);
			}
		}//end for
		Iterator<Entry<Character, Integer>> itr = map.entrySet().iterator();
		while(itr.hasNext()){
			Entry entry = (Entry)itr.next();
			sb.append(entry.getKey());
			sb.append(entry.getValue());
		}
		return sb.toString();
	}