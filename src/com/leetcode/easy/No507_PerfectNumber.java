package com.leetcode.easy;


public class No507_PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		No507_PerfectNumber test = new No507_PerfectNumber();
		test.checkPerfectNumber2(28);

	}
	public boolean checkPerfectNumber(int num) {
		if(num <= 0 || num % 2 != 0)
			return false;
		int tmp = num;
		for(int i =1;i <= num/2 && tmp > 0;i++) {
			if(num % i == 0)
				tmp -= i;
		}
		return tmp == 0;
    }
	public boolean checkPerfectNumber2(int num) {
        if (num == 1) {
            return false;
        }
        int sum = 1, sqrt = (int)Math.sqrt(num);
        for (int i = 2; i <= sqrt; i ++) {
            if (num % i == 0) {
                sum += i + (i * i == num? 0: num / i);
            }
        }
        return sum == num;
    }

}
