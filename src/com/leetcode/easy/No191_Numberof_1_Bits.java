package com.leetcode.easy;

public class No191_Numberof_1_Bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		No191_Numberof_1_Bits test = new No191_Numberof_1_Bits();
		System.out.println(test.hammingWeight(1));
	}
	public int hammingWeight(int n) {
		int res = 0;
        while(n !=0){
        	if(n%2==1)
                res++;
            n >>>=1;
        }
        return res;
    }
	public int hammingWeight2(int n) {
        int res = 0;
        while(n !=0){
            res += n & 1;
            n >>>=1;
        }
        return res;
    }

}
