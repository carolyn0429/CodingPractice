import java.io.*;
import java.util.*;
// lu.cheng@airbnb.com
/*
Implement a CSVReader class that will read a comma-separated-values (CSV) file from disk, parse it, and print out the parsed elements with some other separator.
 */

/**
Rules:
1. The input delimiter is the comma, ","
2. If that delimiter is contained within an element, then that element must be quoted
3. If quotes are contained in an element, use double inner quotes (escape character)

*
* John,Smith,john.smith@gmail.com,Los Angeles,1
* Jane,Roberts,janer@msn.com,"San Francisco, CA",0
* "Alexandra ""Alex""",Menendez,alex.menendez@gmail.com,Miami,1
* one,two,,four,"five"
*
* ["John", "Smith", "john.smith@gmail.com", "Los Angeles", "1"]
* ["Jane", "Roberts", "janer@msn.com", "San Francisco, CA", "0"]
* ["Alexandra \"Alex\"", "Menendez", "alex.menendez@gmail.com", "Miami", "1"]
* ["one", "two", "", "four", "five"]
*
*/
class Solution {
  public static String INPUT = "John,Smith,john.smith@gmail.com,Los Angeles,1\nJane,Roberts,janer@msn.com,\"San Francisco, CA\",0\n\"Alexandra \"\"Alex\"\"\",Menendez,alex.menendez@gmail.com,Miami,1\none,two,,four,\"five\"";
  
  public static String parveCSV(String s){
     //String[] temp = s.split(",");
    
    
    
  }
  
  public static String checkQuote(String string){
    
    char[] ch = string.toCharArray();
    StringBuilder sb = new StringBuilder();
    boolean quoteFlag= false;
    ArrayList<Character> list = new ArrayList<Character>();
    int quoteCount=0;
    int start=0;
    for (int i=0;i<ch.length();i++){
      
      if(!quoteFlag){
        
        if (ch[i]==','){
        
           sb.add(string.substring(start, i));
          start=i+1;
        }else if(ch[i]=='\"'){
       
          quoteFlag=true;
          quoteCount++;
          
        }else{
        	continue;
        }
         
        
      }else{

      	//0\n\"Alexandra \"\"Alex\"\"\"
        if(ch[i]==',' && ch[i-1]=='\"'){
        	//extract content
        	String to_be_extracted =string.substring(start, i-1) ;
			StringBuilder sb_extracted= new StringBuilder();
			String[] s_array = to_be_extracted.split("\"\"");
			for (int i=0;i<s_array.length;i++){
				sb_extracted.append(s_array[i]);
			
			}	
        	start=i+1;
        }else{
        	continue;
        }//end if
        
      }//if else quoteFlag
        
      
      
        
    }
    
  }
  
  
  public static void main(String[] args) {
   
  }
}

