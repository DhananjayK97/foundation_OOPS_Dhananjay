package com.gl;

import java.util.Arrays;
import java.util.Scanner;

public class question5 {
	public static findMaxNum(int arr[], int n){
		int[] hash = new int[arr.length];
		for (int i = 0; i < n; i++)
			hash[arr[i]]++;
		for (int i = arr.length; i >= 0; i--)
			for (int j = 0; j < hash[i]; j++)
				System.out.print(i);
   }


	
	
	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length :");
		n= sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array : "); 
		for(int i=0; i<n; i++)  
			{
			arr[i]=sc.nextInt();  
			}
		
		int N = arr.length;
		
		System.out.println(findMaxNum(arr, N));
	}


	
	
	

}
