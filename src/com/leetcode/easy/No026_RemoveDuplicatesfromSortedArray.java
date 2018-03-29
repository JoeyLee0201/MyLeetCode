package com.leetcode.easy;

public class No026_RemoveDuplicatesfromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int removeDuplicates(int[] nums) {
		int length = nums.length;
		if(length<=1)
			return length;
		int res = 1;
		int tmp = nums[0];
		for(int i =1;i<length;i++){
			if(nums[i]!=tmp){
				tmp = nums[i];
				nums[res] = tmp;
				res++;
			}
		}
		return res;
        
    }

}
