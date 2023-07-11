package com.demo.string;

public class Solution2 {
	
    public String reverseWords(String s) {
    	
    	s =s.trim();
        String[]words  = s.split("\\s+");
        StringBuffer sb =new StringBuffer();
        
        for(int i=words.length-1;i>=0;i--)
          sb.append(words[i]+" ");

          return sb.toString();
    }
    
    public static void main(String[] args) {
		
    	String s =" the sky is blue ";
    	Solution2 sol = new Solution2();
    	
    	System.out.println(sol.reverseWords(s));
	}
}