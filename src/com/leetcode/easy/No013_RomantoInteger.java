package com.leetcode.easy;

public class No013_RomantoInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int romanToInt(String s) {
        int tmp1 = convert(s.substring(0,1));
        int res = tmp1;
        for(int i=1;i<s.length();i++){
            int tmp2 = convert(s.substring(i,i+1));
            if(tmp1 < tmp2){
                res = res - tmp1+tmp2-tmp1;
            }
            else{
                res += tmp2;
                tmp1 = tmp2;
            }
                
        }
        return res;
    }

    public int convert(String s){
        int res = 0;
        switch(s){
            case "I":res=1;break;
            case "V":res=5;break;
            case "X":res=10;break;
            case "L":res=50;break;
            case "C":res=100;break;
            case "D":res=500;break;
            case "M":res=1000;break;
            default:break;
        }
        return res;
    }

}
