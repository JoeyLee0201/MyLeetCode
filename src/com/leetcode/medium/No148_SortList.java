package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.leetcode.bean.ListNode;

public class No148_SortList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode sortList(ListNode head) {
        if(head==null||head.next==null)//递归出口  当只有一个节点时就不再递归
			 return head;
        ListNode slow=head;
		ListNode fast=head;
		while(fast.next!=null&&fast.next.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		 ListNode next=slow.next;
		 slow.next=null;//把两个链表断开分为左边（包括middle）一半和右边一半
		 return mergeTwoList(sortList(head), sortList(next));
    }
	public ListNode getMiddleOfList(ListNode head)
	{
		ListNode slow=head;
		ListNode fast=head;
		while(fast.next!=null&&fast.next.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	public ListNode mergeTwoList(ListNode headA,ListNode headB)
	{
		
		ListNode fakeNode=new ListNode(-1);
		ListNode cur=fakeNode;
		while(headA!=null&&headB!=null)
		{
			if(headA.val<=headB.val)
			{
				cur.next=headA;
				headA=headA.next;
			}
			else {
				cur.next=headB;
				headB=headB.next;
			}
			cur=cur.next;
			
		}
		cur.next=headA==null?headB:headA;
		return fakeNode.next;
	}

}
