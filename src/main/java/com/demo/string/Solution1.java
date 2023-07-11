package com.demo.string;

public class Solution1 {
	
    public int lengthOfLastWord(String s) {
        
    	 s=s.trim();
       
        String[]words  = s.split("\\s+");

        if(words.length ==0)
         return 0;
         //retrive The last word and return to its length
         String lastWord = words[words.length -1];

         return lastWord.length();
    }
    
    public static void main(String[] args) {
		
    	String s =" fly me   to   the moon ";
    	
    	Solution1 sol=new Solution1();
    	
    	System.out.println(sol.lengthOfLastWord(s));
	}
}

