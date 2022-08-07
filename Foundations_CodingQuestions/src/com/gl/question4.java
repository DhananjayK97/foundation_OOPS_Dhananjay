package com.gl;

import java.util.Scanner;

public class question4 {
	static int power(int n, int x){
        if(x <= 0) return 1;

        int result = n;
        for (int i = 0; i < x - 1; i++) {
            result *= n;
        }

        return result;
    }
    public static void main(String[] args) {
    	
    	int x,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number X :");
		x= sc.nextInt();
		System.out.println("Enter the Power N :");
		n= sc.nextInt();
        System.out.println(power(x,n));
    }
}
