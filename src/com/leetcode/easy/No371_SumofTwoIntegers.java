package com.leetcode.easy;

public class No371_SumofTwoIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(5^6);

	}
	/*
	 * ���������Ķ�������1000��111������ʽʱ��ȡ���������ڶ����Ƶļӷ�
	 * ��ˣ�����˼·�ǽ�ʮ��������ͨ����λ��תΪ����������
	 * ^���㲻��λ�Ķ����Ƽӷ�
	 * &�����λ�Ķ����Ƽӷ������Ҫ����һλ�������λ 
	 * */
	public int getSum(int a, int b) {
        if(b == 0) return a;        // when carry is zero, return  
        int sum = a ^ b;        // calculate sum without carry  
        int carry = (a & b) << 1;       // calculate carry  
        return getSum(sum, carry); 
    }

}
