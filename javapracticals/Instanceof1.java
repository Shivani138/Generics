package com.javapracticals;
//Java program to demonstrate that instanceof returns false for null

class Test2 { }

class Instanceof1
{
	public static void main(String[] args)
	{
		Test2 tobj = null;

		// A simple case
		if (tobj instanceof Test2)
		System.out.println("tobj is instance of Test");
		else
		System.out.println("tobj is NOT instance of Test");
	}
}

