/*

All DNA is composed of a series of nucleotides abbreviated as A, C, G, and T, for example: "ACGAATTCCG". When studying DNA, it is sometimes useful to identify repeated sequences within the DNA.

Write a function to find all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule.

For example,

Given s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT",

Return:
["AAAAACCCCC", "CCCCCAAAAA"].
*/
public List<String> findRepeatedDnaSequences(String s) {
        
        List<String> result = new ArrayList<String>();
        if(s==null || s.length()==0) return result;
        
        //store ACGT into 2-bit for each character, so total 20-bit for substring
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('A',0);
        map.put('C',1);
        map.put('G',2);
        map.put('T',3);
        
        Set<Integer> temp = new HashSet<Integer>();
        Set<Integer> added = new HashSet<Integer>();//store added substring, th avoid calculating same substring appears 3 or more times
        int hash=0;
        for (int i=0;i<s.length();i++){
            if (i<9){
                hash = (hash<<2) + map.get(s.charAt(i));
            }else{
                hash = (hash<<2) + map.get(s.charAt(i));
                
                //if hash length>20, only grab 20-bit length into temp
                hash = hash & ((1<<20)-1);
                if (temp.contains(hash) && !added.contains(hash)){
                    result.add(s.substring(i-9,i+1));
                    added.add(hash);
                }else{
                    temp.add(hash);
                }
            }
        }
        return result;
    }