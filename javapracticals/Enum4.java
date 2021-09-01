package com.javapracticals;
//Constructors in enum

enum Color4
{
	RED, GREEN, BLUE;
	private Color4()
	{
		System.out.println("Constructor called for : " +
		this.toString());
	}

	public void colorInfo()
	{
		System.out.println("Universal Color");
	}
}

public class Enum4
{	
	public static void main(String[] args)
	{
		Color4 c1 = Color4.RED;
		System.out.println(c1);
		c1.colorInfo();
	}
}
