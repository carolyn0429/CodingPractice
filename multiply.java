/*
Given two numbers represented as strings, 
return multiplication of the numbers as a string.
*/
public String multiply(String num1, String num2) {

	 if (num1 == null || num1.length() == 0) {
            return "0";
        } else if (num2 == null || num2.length() == 0) {
            return "0";
        }
        int len1 = num1.length();
        int len2 = num2.length();
        int len = len1 + len2;
        // eg. 99 * 999 = 98901
        int[] digits = new int[len];

        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                // multiply the (i)th number from the end of num1
                // with the (j)th number from the end of num2
                int product = (num1.charAt(len1 - i) - '0') * (num2.charAt(len2 - j) - '0');
                // this produce saves to the (i+j-1)th position in array
                int ansPos = len + 1 - i - j;
                digits[ansPos] += product;
            }
        }
        // answer is got and saved in digits array, but we
        // need to handle the carry numbers
        for (int i = len - 1; i > 0; i--) {
            digits[i - 1] += digits[i] / 10;
            digits[i] %= 10;
        }
        // last step is the print the answer, but mind the prefix 0s
        int p = 0;
        while (p < len && digits[p] == 0) {
            p++;
        }
        if (p == len) {
            return "0";
        } else {
            StringBuilder sb = new StringBuilder();
            while (p < len) {
                sb.append(String.valueOf(digits[p++]));
            }
            return sb.toString();
        }

	
}