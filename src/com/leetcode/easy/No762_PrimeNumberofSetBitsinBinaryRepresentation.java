package com.leetcode.easy;

public class No762_PrimeNumberofSetBitsinBinaryRepresentation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s = Integer.toBinaryString(3);
//		System.out.println(s);
//		String s1[] = s.split("1");
//		System.out.println(s.split("1").length);
//		System.out.println(s.length()-s.split("1").length);
		No762_PrimeNumberofSetBitsinBinaryRepresentation test = new No762_PrimeNumberofSetBitsinBinaryRepresentation();
		System.out.println(test.countPrimeSetBits(6,10));
	}
	public int countPrimeSetBits(int L, int R) {
		int res = 0;
        for(int i = L; i<=R;i++) {
        	if(isPrime(countBit(i)))
        		res++;
        }
        return res;
    }
	private int countBit(int n) {
		int res = 0;
		while(n > 0) {
			if(n % 2 == 1)
				res++;
			n /=2;
		}
		return res;
	}
	private boolean isPrime(int n) {
		if(n <= 1)
			return false;
		int middle = (int)Math.sqrt(n);
		for(int i = 2; i <= middle;i++) {
			if(n % i == 0)
				return false;
		}
		return true;
	}

}
