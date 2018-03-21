package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class No728_SelfDividingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i = left;i<=right;i++) {
			if(isDivisible(i))
				list.add(i);
		}
		return list;
        
    }
    public boolean isDivisible(int num){
        String s = ""+num;
        if(s.contains("0"))
        	return false;
        for(int i = 0;i < s.length();i++) {
        	if(num % Integer.parseInt(s.substring(i, i+1)) != 0)
        		return false;
        }
        return true;
    } 
    public boolean isDivisible2(int num){
    	int tmp = num;
        while(tmp!=0) {
        	int tail = tmp%10;
        	if(tail == 0 || num%tail!=0)
        		return false;
        	tmp/=10;
        }
        return true;
    } 

}
