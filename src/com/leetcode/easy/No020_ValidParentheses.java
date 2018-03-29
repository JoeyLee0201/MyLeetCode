package com.leetcode.easy;

import java.util.Stack;

public class No020_ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean isValid(String s) {
		if(s.length()%2==1)
			return false;
		Stack<Character> stack = new Stack<Character>();
		for(char c : s.toCharArray()){
			if(c=='{'||c=='['||c=='('){
				stack.push(c);
				continue;
			}
			if(stack.size()>0){
				char peek = stack.peek();
				if(c=='}' && peek=='{')
					stack.pop();
				else if(c==']' && peek=='[')
					stack.pop();
				else if(c==')' && peek=='(')
					stack.pop();
				else
					stack.push(c);
			}
			else
				return false;
		}
		if(stack.isEmpty())
			return true;
		else 
			return false;
    }

}
