package com.leetcode.easy;

public class No278_FirstBadVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		No278_FirstBadVersion test = new No278_FirstBadVersion();
		System.out.println(test.firstBadVersion(3));
	}
	public int firstBadVersion2(int n) {
        int left = 1,right = n;
        while(left<right){
            if(isBadVersion(left))
                return left;
            int mid = (left+right)/2;
            if(isBadVersion(mid)){
                right = mid;
                n=mid;
                left++;
            }  
            else{
                left = mid+1;
            }
        }
        return n;
    }
    public int firstBadVersion(int n) {
        int left = 1,right = n;
        while(left<right){
            int mid = left+(right-left)/2;
            if(isBadVersion(mid)){
                right = mid;
            }  
            else{
                left = mid+1;
            }
        }
        return left;
    }
	boolean isBadVersion(int version){
		int i = 2;
		if(version>=i)
			return true;
		return false;
	}

}
