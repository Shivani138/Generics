package com.javapracticals;
//A Java program to demonstrate that non-method members are accessed according to reference
class Parent3
{
	int value = 1000;
}

class Child3 extends Parent3
{
	int value = 10;
}
class Instanceof4
{
	public static void main(String[] args)
	{
		Parent3 cobj = new Child3();
		Parent3 par = cobj;
		if (par instanceof Child3)
		{
			System.out.println("Value accessed through " +
				"parent reference with typecasting is " +
									((Child3)par).value);
		}
	}
}

