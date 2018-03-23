package com.leetcode.easy;

public class No344_ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String reverseString(String s) {
		StringBuffer sb = new StringBuffer();
		int length = s.length();
		for(int i = length-1; i >=0;i++) {
			sb.insert(0, s.charAt(i));
		}
		return sb.toString();
    }

}
