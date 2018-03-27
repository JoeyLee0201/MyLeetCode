package com.leetcode.easy;

public class No283_MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void moveZeroes(int[] nums) {
        int length = nums.length;
        int head = 0;
        for(int i =0;i<length;i++){
            if(nums[i]!=0){
                nums[head] = nums[i];
                head++;
            }    
        }
        if(head!=0)
            for(int i =head;i<length;i++)
                nums[i] = 0;        
    }

}
