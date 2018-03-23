package com.leetcode.easy;

public class No476_NumberComplement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		No476_NumberComplement test = new No476_NumberComplement();
		System.out.println(Integer.toBinaryString(2147483647));
		System.out.println(test.findComplement(2147483647));
	}
	public int findComplement(int num) {
        int n = 0;
        int tmp = num;
        while(tmp >0) {
        	n++;
        	tmp/=2;
        }
        return (int)(Math.pow(2,n)-1)^num;
    }

}
