package com.ust.java;

import java.util.Scanner;

public class Sumofeven {

	public static void main(String[] args) {
		int[] arr2=new int[10];
		int sum=0;
		System.out.println("Enter ten numbers");
		Scanner input= new Scanner(System.in);
		for (int i = 0; i < 10; i += 1){
			arr2[i]= input.nextInt();}
		input.close();
	for(int j=0;j<10;j++)
	{
		if((arr2[j]%2)==0)
			sum=sum+arr2[j];
		else
			continue;
	}
	System.out.println("sum of Even numbers are "+sum);
	}
	}


