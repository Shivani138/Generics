package com.javapracticals;
//Java Program to illustrate using this many number of times

class This2 {
	// instance variable
	int a = 10;

	// static variable
	static int b = 20;

	void GFG()
	{
		this.a = 100;

		System.out.println(a);
		this.b = 600;

		System.out.println(b);
		this.a = 9000;

		System.out.println(a);
	}

	public static void main(String[] args)
	{
		new This2().GFG();
	}
}
