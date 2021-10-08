package com.ust.java;

public class Labelbreak {

	public static void main(String[] args) {
int i=3;
first:
	  if(i>3)
	  {  break first;}
	  else
	second:
	{ System.out.println("Hello");
         break second;}
	}

}
