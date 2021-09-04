package com.javapracticals;
//Program to illustrate this keyword is used to refer current class
class This {
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
	}

	public static void main(String[] args)
	{
		new This().GFG();
	}
}

