package com.leetcode.easy;

public class No231_PowerofTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(2&1);
	}
	public boolean isPowerOfTwo(int n) {
		if(n<=0)
			return false;
		if(n==1)
			return true;
		while(n>1) {
			if((n&1) == 1)
				return false;
			n/=2;
		}
        return true;
    }

}
