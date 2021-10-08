package com.ust.java;

import java.util.Scanner;

public class Sumofpos {

	public static void main(String[] args) {
		int[] arr2=new int[10];
		int sum=0;
		System.out.println("Enter five numbers");
		Scanner input= new Scanner(System.in);
		for (int i = 0; i < 5; i += 1){
			arr2[i]= input.nextInt();}
		input.close();
	for(int j=0;j<5;j++)
	{
		if(arr2[j]>0)
			sum=sum+arr2[j];
		else
			continue;
	}
	System.out.println("sum of positive numbers are "+sum);
	}

}
