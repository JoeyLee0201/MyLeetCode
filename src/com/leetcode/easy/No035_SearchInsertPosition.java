package com.leetcode.easy;

public class No035_SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(target<=nums[i])
            return i;
        }
        return nums.length;
    }

}
