package com.leetcode.easy;

public class No459_RepeatedSubstringPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean repeatedSubstringPattern(String s) {
		int n = s.length();
        if(n==1)
        	return false;
        int max= n/2+1;
        for(int i=1;i<max;i++){
        	if(n%i !=0)
                continue;
        	String s2 = s.replaceAll(s.substring(0, i), "");
        	if(s2.equals(""))
        		return true;
        }        
        return false;
    }

}
