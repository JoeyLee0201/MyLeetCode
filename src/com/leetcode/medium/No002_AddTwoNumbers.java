package com.leetcode.medium;

import com.leetcode.bean.ListNode;

public class No002_AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	  
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		 if(l1 == null) {
			 return l2;
		 }
		 if(l2 == null) {
			 return l1;
		 }
		l2.val += l1.val;
		if(l2.val > 9) {
			l2.val %= 10;
			if(l2.next !=null)
				l2.next =plusOne(l2.next);
			else if(l1.next !=null)
				l1.next = plusOne(l1.next);
			else
				l2.next = plusOne(l2.next);
		}
		l2.next = addTwoNumbers(l1.next,l2.next);
		return l2;    
	 }
	 
	 private ListNode plusOne(ListNode node) {
		 if(node ==null)
			 return new ListNode(1);
		 node.val +=1;
		 if(node.val >9) {
			 node.val %= 10;
			 node.next = plusOne(node.next); 
		 }
		 return node;
	 }

}
