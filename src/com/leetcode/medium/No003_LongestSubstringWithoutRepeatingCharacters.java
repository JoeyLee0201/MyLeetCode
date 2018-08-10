package com.leetcode.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class No003_LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		No003_LongestSubstringWithoutRepeatingCharacters o = new No003_LongestSubstringWithoutRepeatingCharacters();
//		System.out.println(o.withRepeat(""));
		System.out.println(o.lengthOfLongestSubstring("aabcda"));

	}
	
	public int lengthOfLongestSubstring2(String s){
		int[] m = new int[256];
        Arrays.fill(m, -1);
        int res = 0, left = -1;
        for (int i = 0; i < s.length(); ++i) {
            left = Math.max(left, m[s.charAt(i)]);
            m[s.charAt(i)] = i;
            res = Math.max(res, i - left);
        }
        return res;
	}
	

	public int lengthOfLongestSubstring(String s) {
		int len = s.length();
		if(!withRepeat(s))
			return len;
		else{
			for(int i = len-1;i > 1; i--){
				for(int j = 0;j <= len - i;j++){
					String sub = s.substring(j, j+i);
					if(!withRepeat(sub))
						return i;
				}
			}
			return 1;
		}
    }
	
	public boolean withRepeat(String s){
		int length = s.length();
		for(int i = 0;i < length;i++){
			char c = s.charAt(i);
			if(s.lastIndexOf(c)!=i)
				return true;
		}
		return false;
	}

}
