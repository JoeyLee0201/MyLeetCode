package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class No448_FindAllNumbersDisappearedinanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<Integer> findDisappearedNumbers(int[] nums) {
		int n = nums.length;
		List<Integer> list = new ArrayList<Integer>();
		int[] map = new int[n+1];
		if(n<=1)
			return list;
		for(int i = 0; i < n ;i++){
			map[nums[i]]++;
		}
		for(int i=1;i<n+1;i++){
			if(map[i]==0)
				list.add(i);
		}		
		return list;
        
    }

}
