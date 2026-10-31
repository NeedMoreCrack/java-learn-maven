package com.java.learn.leetcode;

import java.util.Arrays;

public class LeetCode26 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,2};
        int[] arr2 = new int[]{0,0,1,1,1,2,2,3,3,4};
        int[] arr3 = new int[]{1,1,2};
        int[] arr4 = new int[]{1};
        int[] arr5 = new int[]{1,2};
        int[] arr6 = new int[]{1,1};
        int[] arr7 = new int[]{1,1,1,2};
        int[] arr8 = new int[]{1,2,3};
        System.out.println(removeDuplicates(arr8));
    }
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 1){
            return 1;
        }
        if(nums.length == 2){
            if(nums[0] == nums[1]){
                return 1;
            }
            return 2;
        }
        int l = 0;
        int r = 1;
        int count = 1;
        int tempNum = nums[l];
        for (int i = 0; i < nums.length; i++) {
            if(Math.max(l,r) > nums.length-1){
                break;
            }
            if(nums[l] != nums[r]){
                if(tempNum < nums[r]){
                    tempNum = nums[r];
                    l++;
                    count++;
                    int temp = nums[l];
                    nums[l] = nums[r];
                    nums[r] = temp;
                }
            }
            r++;
        }
        System.out.println(Arrays.toString(nums));
        return count;
    }
}