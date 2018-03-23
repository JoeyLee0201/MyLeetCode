package com.leetcode.easy;

public class No371_SumofTwoIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(5^6);

	}
	/*
	 * 当两个数的二进制是1000与111这种形式时，取亦或操作等于二进制的加法
	 * 因此，核心思路是将十进制运算通过移位符转为二进制运算
	 * ^计算不进位的二进制加法
	 * &计算进位的二进制加法，因此要左移一位，代表进位 
	 * */
	public int getSum(int a, int b) {
        if(b == 0) return a;        // when carry is zero, return  
        int sum = a ^ b;        // calculate sum without carry  
        int carry = (a & b) << 1;       // calculate carry  
        return getSum(sum, carry); 
    }

}
