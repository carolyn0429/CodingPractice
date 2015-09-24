public String countAndSay2(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if ( n == 1)
            return "1";
        String s = "1";
        for (int k = 2; k <= n; k++) {
            String temp  = "";
            
            int count = 1;
            char num = s.charAt(0);
            int size = s.length();
            for (int i = 0; i<size - 1; i++) {
                if (s.charAt(i) == s.charAt(i+1)) {
                  count++;  
                } else{
                    temp += count + "" + num;
                    count = 1;
                    num = s.charAt(i+1);
                }
                
            }
            temp += count + "" + num;
            s = temp;
        }
        return s;
    }
