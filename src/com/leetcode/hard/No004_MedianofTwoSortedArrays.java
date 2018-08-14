package com.leetcode.hard;

public class No004_MedianofTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		No004_MedianofTwoSortedArrays o = new No004_MedianofTwoSortedArrays();
		int[] nums1={1,2};
		int[] nums2={3,4};
		System.out.println(o.findMedianSortedArrays(nums1, nums2));

	}
	
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		if(nums1.length==0)
			return find(nums2);
		if(nums2.length==0)
			return find(nums1);
		int[] nums = new int[nums1.length+nums2.length];
		int i=0,j=0,k=0;
		while(i<nums1.length&&j<nums2.length){
			if(nums1[i]<=nums2[j]){
				nums[k]=nums1[i];
				i++;
			}
			else{
				nums[k]=nums2[j];
				j++;
			}
			k++;
		}
		if(i==nums1.length){
			while(j<nums2.length){
				nums[k]=nums2[j];
				k++;j++;
			}
		}
		if(j==nums2.length){
			while(i<nums1.length){
				nums[k]=nums1[i];
				k++;i++;
			}
		}
		return find(nums);
    }
	
	public double find(int[] nums){
		int len = nums.length;
		return len%2==0? (nums[len/2]+nums[len/2-1])/2.0:nums[len/2];
	}

}
