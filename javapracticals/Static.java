package com.javapracticals;
//Java program to demonstrate that a static member can be accessed before instantiating a class
class Static
{
	// static method
	static void m1()
	{
		System.out.println("from m1");
	}

	public static void main(String[] args)
	{
		m1();
	}
}

