package com.leetcode.medium;

import java.util.Arrays;

public class No005_LongestPalindromicSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		No005_LongestPalindromicSubstring o = new No005_LongestPalindromicSubstring();
		System.out.println(o.longestPalindrome2("bppbsooos"));
	}
	
	public String longestPalindrome2(String s) {
		int len = s.length();
		if(isPalindrome(s))
			return s;
		int left = 0,right = 0;
		for(int i=0;i<len-1;i++){
			int offset = 0;
			if(s.charAt(i)==s.charAt(i+1)){
				for(int j = 1;i-j>=0&&i+1+j<len;j++){
					if(s.charAt(i-j)==s.charAt(i+1+j)){
						offset = j;
						continue;
					}
					else
						break;
				}				
				if(offset*2+2>right-left+1){
					left = i-offset;
					right = i+offset+1;
				}
			}
			if(i>0&&s.charAt(i-1)==s.charAt(i+1)){
				for(int j = 1;i-j>=0&&i+j<len;j++){
					if(s.charAt(i-j)==s.charAt(i+j)){
						offset = j;
						continue;
					}
					else
						break;
				}
				if(offset*2+1>right-left+1){
					left = i-offset;
					right = i+offset;
				}
				
			}			
		}
		return s.substring(left, right+1);
    }
	
	public String longestPalindrome(String s) {
		if(isPalindrome(s))
			return s;
		else{
			int len = s.length();
			for(int i = len-1;i > 1; i--){
				for(int j = 0;j <= len - i;j++){
					String sub = s.substring(j, j+i);
					if(isPalindrome(sub))
						return sub;
				}
			}
			return s.charAt(0)+"";
		}
    }
    public boolean isPalindrome(String s){
    	StringBuilder sb = new StringBuilder(s);
    	return s.equals(sb.reverse().toString());
    }

}
