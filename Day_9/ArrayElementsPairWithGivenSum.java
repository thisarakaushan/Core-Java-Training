/*
Check if pair with given Sum exists in Array

Given an array A[] of n numbers and another number x, the task is to check whether or not there exist two elements in A[] whose sum is exactly x.  

Input: arr[] = {0, -1, 2, -3, 1}, 
x= -2 
Output: Yes 

Explanation:  If we calculate the sum of the output,1 + (-3) = -2

*/

package com.highradius.day.nine;

import java.util.HashSet;
import java.util.Set;

public class ArrayElementsPairWithGivenSum {
	
	/**
	 * The method to pair the given sum with array elements
	 * @param arr
	 * @param x
	 * @return
	 */
	 public static boolean hasPairWithSum(int[] arr, int x) {
	        Set<Integer> set = new HashSet<>();

	        for (int num : arr) {
	            int target = x - num;
	            if (set.contains(target)) {
	                return true;
	            }
	            set.add(num);
	        }

	        return false;
	    }

	public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        int x = -2;

        if (hasPairWithSum(arr, x)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
