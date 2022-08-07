package com.gl;

import java.util.Scanner;
/*Question 1:
Check if a given string is a palindrome and return true or false based on the result, only with the help of recursion. 
You can not use string buffer or inbuilt string features like reverse etc. */
public class question1 {
	public class Main
	{
	    static boolean isPalindrome(String str) 
	    { 
	        if(str.length() == 0 || str.length() == 1)
	            return true; 
	        if(str.charAt(0) == str.charAt(str.length()-1))
	            return isPalindrome(str.substring(1, str.length()-1));
	        return false;
	    }   
	    public static void main(String args[]) 
	    { 
	        try (Scanner sc = new Scanner(System.in)) {
				System.out.println("Enter the String :");
				String str = sc.nextLine();
				if (isPalindrome(str)) 
					System.out.println(true); 
				else
					System.out.println(false);
			} 
	    }     
	}
}
