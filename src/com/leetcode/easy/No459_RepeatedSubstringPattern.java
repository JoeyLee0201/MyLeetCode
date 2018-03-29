package com.leetcode.easy;

public class No459_RepeatedSubstringPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean repeatedSubstringPattern(String s) {
		int n = s.length();
        if(n==1)
        	return false;
        for(int i=0;i<n/2;i++){
        	if(!s.contains(s.substring(0, i+1)))
        		return false;
        	String s2 = s.replaceAll(s.substring(0, i+1), "");
        	if(s2.equals(""))
        		return true;
        }        
        return false;
    }

}
