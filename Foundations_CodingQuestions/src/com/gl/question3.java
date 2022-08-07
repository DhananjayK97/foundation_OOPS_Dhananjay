package com.gl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Question 3:
//Given a sorted array of integers “nums” and an integer target, return indices for two numbers such 
//that they add up to the target.  You may assume that each input would have exactly one solution, and 
//you may not use the same element twice. You can return the answer in any order. 



public class question3 {
	public static int[] indicesOfSum(int[] nums, int target){
		Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            } else {
                numMap.put(nums[i], i);
            }
        }
        return new int[] {};
    }
	
	public static void main(String args[]) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nums.Length :");
		n= sc.nextInt();
		int[] nums = new int[n];
		System.out.println("Enter the nums array: "); 
		for(int i=0; i<n; i++)  
			{
			nums[i]=sc.nextInt();  
			}
		System.out.println("Enter your Target value");
		int target = sc.nextInt();
		
		System.out.println(indicesOfSum(nums, target));
		
	}
	
}
