package com.javapracticals;
//@deprecated
public class Annotation2
{
	@Deprecated
	public void Display()
	{
		System.out.println("Deprecatedtest display()");
	}

	public static void main(String args[])
	{
		Annotation2 d1 = new Annotation2();
		d1.Display();
	}
}

