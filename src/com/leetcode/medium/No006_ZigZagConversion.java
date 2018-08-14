package com.leetcode.medium;

public class No006_ZigZagConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String convert(String s, int numRows) {
		String res="";
		int len = s.length();
		if(numRows==1)
			return s;
		for(int i=0;i<numRows;i++){
			for(int j=i;j<len;j+=2*(numRows-1)){
				res+=s.charAt(j);
				int distance = (numRows-1-i)*2;
				if(j%(numRows-1)!=0&&j+distance<len)
					res+=s.charAt(j+distance);				
			}
		}
		return res;
    }

}
