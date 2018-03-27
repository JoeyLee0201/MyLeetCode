package com.leetcode.easy;

public class No796_RotateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean rotateString2(String A, String B) {
		if(A.length() != B.length())
			return false;
		if(A.equals(B))
			return true;
		for(char c:A.toCharArray()) {
			A = A.substring(1)+c;
			if(A.equals(B))
				return true;
		}
		return false;
    }
	public boolean rotateString(String A, String B) {
		if(A.length() != B.length())
			return false;
		return (A+A).contains(B);
    }

}
