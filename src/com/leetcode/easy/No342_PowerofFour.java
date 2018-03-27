package com.leetcode.easy;

public class No342_PowerofFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean isPowerOfFour(int num) {
        if(num<=0)
			return false;
		if(num==1)
			return true;
		while(num>1) {
			if(num%4 != 0)
				return false;
			num/=4;
		}
        return true; 
    }

}
