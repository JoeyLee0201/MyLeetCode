package com.leetcode.easy;

public class No088_MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		No088_MergeSortedArray test = new No088_MergeSortedArray();
		test.merge2(new int[]{2,0},1, new int[]{1}, 1);
	}
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0)
            return;
        for(int i = 0;i<n;i++)
            nums1[m+i] = nums2[i];
        if(m == 0)
            return;
        for(int i = 0;i<m+n-1;i++ ){
        	for(int j = 0;j<m+n-1-i;j++){
        		if(nums1[j]>nums1[j+1]){
        			int tmp = nums1[j];
        			nums1[j] = nums1[j+1];
        			nums1[j+1] = tmp;
        		}
        	}
        }
        return;
    }
	public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int[] nums = new int[m+n];
        int i=0,j=0,k=0;
        while(i!=m&&j!=n){
            if(nums1[i]<nums2[j]){
                nums[k] = nums1[i];
                k++;i++;
            }
            else{
                nums[k] = nums2[j];
                k++;j++;
            }
        }
        while(i==m&&j!=n){
            nums[k] = nums2[j];
            k++;j++;
        }
        while(i!=m&&j==n){
            nums[k] = nums1[i];
            k++;i++;
        }
        for(i = 0;i<m+n;i++){
            nums1[i] = nums[i];
        }
        return;
    }


}
