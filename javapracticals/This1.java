package com.javapracticals;
//Program to illustrate super keyword refers super-class instance

class Parent4 {
	// instance variable
	int a = 10;

	// static variable
	static int b = 20;
}

class This1 extends Parent4 {
	void rr()
	{
		System.out.println(super.a);
		System.out.println(super.b);
	}

	public static void main(String[] args)
	{
		new This1().rr();
	}
}
