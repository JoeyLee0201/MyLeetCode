package com.leetcode.easy;

public class No53_MaximumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int maxSubArray(int[] nums) {
        int sum =nums[0];
        int max =nums[0];
		for(int i=1;i<nums.length;i++) {
			int tmp = sum+nums[i];
			if(tmp<nums[i])
				sum = nums[i];
			else
				sum = tmp;
            max = Math.max(sum,max);
		}
		return max;
    }
	public int maxSubArray2(int[] nums) {
		if(nums==null||nums.length==0)
			return 0;
		int sum =0;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<nums.length;i++) {
			sum =Math.max(sum+nums[i], nums[i]);
			max = Math.max(max, sum);
		}
		return max;
        
    }

}
