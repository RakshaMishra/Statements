package com.kodnest.ifs;

import java.util.Scanner;

public class if_statement {
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		if(a==0)
		{
			System.out.println("number is zero");
		}
		else
		{
			System.out.println("number is not zero");
		}
	}
	

}
