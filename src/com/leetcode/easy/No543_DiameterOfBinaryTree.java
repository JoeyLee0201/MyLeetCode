package com.leetcode.easy;

public class No543_DiameterOfBinaryTree {
	/** 543
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode(int x) { val = x; }
	 * }
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int diameterOfBinaryTree(TreeNode root) {
        if(root == null)
            return 0;
        root.val = count(root.left)+count(root.right);
        int left = diameterOfBinaryTree(root.left);
        int right = diameterOfBinaryTree(root.right);
        return Math.max(root.val,Math.max(left, right));
    }
    
    private int count(TreeNode root){
        if(root == null)
            return 0;
        return Math.max(count(root.left),count(root.right))+1;
    }
    
	 public class TreeNode {
	     int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	 }
}
