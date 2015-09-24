public List<String> restoreIpAddresses(String s) {
	List<String> res = new ArrayList<String>();
	if (s==null || s.length<4 || s.length>12) return res;
	StringBuilder sb = new StringBuilder();
	helper(0, s, 1, sb, res);
	return res;
}

public void helper(int start, String s, int section, StringBuilder sb, List<String> res){
	if (section>4) {
		if (start>=s.length()) res.add(sb.toString());
		return;
	}

	if (start>=s.lentgh()) return;
	int maxnum = (s.charAt(start)=='0')?1:3;
	for (int i=start; i<s.length && i<start+maxnum; i++){
		if (Integer.parseInt(s.substring(start, i+1))<=255){
			if (section>1) sb.append('.');
			sb.append(s.substring(start, i+1));
			helper(i+1, s, section+1, sb, res);
			sb.delete(s.length-(i+1-start), sb.length);
			if (section>1) sb.delete(sb.length-1);//delete dot
		}
	}
}