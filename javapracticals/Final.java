package com.javapracticals;
//Java program to demonstrate reference final variable

class Final
{
	public static void main(String[] args)
	{
		final StringBuilder sb = new StringBuilder("Shivani");
		
		System.out.println(sb);
		
		
		sb.append("Thakkar");
		
		System.out.println(sb);
	}	
}


