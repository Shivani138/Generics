package com.javapracticals;
//Java Program to illustrate using super many number of times

class Parent5 {
	// instance variable
	int a = 36;

	// static variable
	static float x = 12.2f;
}

class This3 extends Parent5{
	void GFG()
	{
		super.a = 1;
		System.out.println(a);
		super.x = 60.3f;

		System.out.println(x);
	}
	public static void main(String[] args)
	{
		new This3().GFG();
	}
}

