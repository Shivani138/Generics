package com.javapracticals;
//Java program to illustrate
//the usage of this keyword

class This4 {
	int first = 22;
	int second = 33;

	void garcia(int a, int b)
	{
		a = this.first;
		b = this.second;
		System.out.println(first);
		System.out.println(second);
		System.out.println(a);
		System.out.println(b);
	}

	void louis(int m, int n)
	{
		this.first = m;
		this.second = n;
		System.out.println(first);
		System.out.println(second);
		System.out.println(m);
		System.out.println(n);
	}

	public static void main(String[] args)
	{
		new This4().garcia(100, 200);
		new This4().louis(1, 2);
	}
}

