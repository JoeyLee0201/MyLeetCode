package com.leetcode.easy;

public class No326_PowerofThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean isPowerOfThree(int n) {
		double res = Math.log10(n)/Math.log10(3);
        return (res - (int)res == 0);        
    }

}
