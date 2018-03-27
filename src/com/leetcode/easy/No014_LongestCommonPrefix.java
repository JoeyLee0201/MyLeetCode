package com.leetcode.easy;

public class No014_LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
            return "";
        if(strs.length == 1)
            return strs[0];
        String res = findCommon(strs[0],strs[1]);
        for(int i=2;i<strs.length;i++){
            res = findCommon(res,strs[i]);
        }
        return res;
    }
	public String findCommon(String s1,String s2){
        int l1 = s1.length();
        int l2 = s2.length();
        if(l1<l2){
            for(int i = 0;i<l1;i++){
                String prefix = s1.substring(0,l1-i);
                if(s2.startsWith(prefix, 0))
                    return prefix;
            }
        }
            for(int i = 0;i<l2;i++){
                String prefix = s2.substring(0,l2-i);
                if(s1.startsWith(prefix,0))
                    return prefix;
            }
        return "";
    }

}
