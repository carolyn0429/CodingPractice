public static int longestValidParentheses(String s) {
        
        Stack<Integer> bracketStack = new Stack<Integer>();
        int max_len=0;
        int current_len=0;
        int last = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {

                    bracketStack.push(i);
            }
            else{

                if(!bracketStack.isEmpty())
                {
                    bracketStack.pop();

	                if(!bracketStack.isEmpty())
	                    current_len = i-bracketStack.peek();
	                else
	                    current_len=i-last;
                 max_len = Math.max(max_len,current_len);
                }
                else{

                    last = i;
                }
            }

        }


        return max_len;
}