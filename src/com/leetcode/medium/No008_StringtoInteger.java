package com.leetcode.medium;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class No008_StringtoInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		No008_StringtoInteger o = new No008_StringtoInteger();
//		System.out.println(o.myAtoi("      -42"));
//		System.out.println(o.myAtoi("      +42"));
//		System.out.println(o.myAtoi("-91283472332"));
//		System.out.println(o.myAtoi("91283472332"));
//		System.out.println(o.myAtoi("+91283472332"));
		System.out.println(o.myAtoi("0-1"));

	}
	int INT_MAX = Integer.MAX_VALUE;
	int INT_MIN = Integer.MIN_VALUE;
	public int myAtoi(String str) {
		if(str.equals(""))
			return 0;
		
		int res = 0;
		if(str.contains(" ")){
			String[] s = str.split(" ");
			String target = "";
			for(String sub:s){
				if(!sub.equals("")){
					target = sub;
					break;
				}
			}
			if(target.equals(""))
				return 0;
			res = trans(target);
		}
		else{
			res = trans(str);
		}
        return res;
    }
	private String abstracDital(String str){
		int count = 0;
		int index=0;
		StringBuffer sb = new StringBuffer("");
		for(char c:str.toCharArray()){
			if(index==0 && (c=='+'||c=='-'))
				if(count==0){
					count++;
					sb.append(c);
					continue;
				}
				else
					break;
			if(c<'0'||c>'9')
				break;
			sb.append(c);
			index++;
		}
		return sb.toString();
	}
	private int trans(String s){
		int res = 0;
		try{
			s = abstracDital(s);
			System.out.println(s);
			res = Integer.parseInt(s);
			
		}catch(Exception e){
			if(s.equals(""))
				return 0;
			char first = s.charAt(0);
			if(first=='-'&&s.length()>1)
				return INT_MIN;
			if((first=='+'&&s.length()>1)||(first>=48&&first<=57))
				return INT_MAX;
			return 0;

//			Pattern p=Pattern.compile("[0-9]"); 
//			Matcher m= p.matcher(s);
//			Matcher m2= p.matcher(s.substring(1));
//			if(m1.matches()&&m1.start()==0)
//				return INT_MIN;
//			if(m2.matches()||m3.matches()&&(m2.start()==0||m3.start()==0))
//				return INT_MAX;
//			return 0;
			
//			String temp = s+"1";
//			String[] array = temp.split("[A-Za-z]");
//			if(array.length==1){
//				if(s.contains("."))
//					return s.lastIndexOf(".")==0? 0:trans(s.substring(0,s.lastIndexOf(".")));
//				if(s.charAt(0)=='-'&&s.length()>1)
//					return INT_MIN;
//				else if(s.length()>1)
//					return INT_MAX;
//				else
//					return 0;
//			}			
//			return 0;
		}
		return res;
	}

}
