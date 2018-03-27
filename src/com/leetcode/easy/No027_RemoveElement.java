package com.leetcode.easy;

public class No027_RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int removeElement(int[] nums, int val) {
        int length = nums.length;
        int head = 0;
        for(int i =0;i<length;i++){
            if(nums[i]!=val){
                nums[head] = nums[i];
                head++;
            }    
        }
        return head;
    }

}
