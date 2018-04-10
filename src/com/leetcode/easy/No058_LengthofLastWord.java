package com.leetcode.easy;

public class No058_LengthofLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        if(words.length==0)
        	return 0;
        return words[words.length-1].length();
    }

}
