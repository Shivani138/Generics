package com.javapracticals;
//@supressed warning
class DeprecatedTest
{
	@Deprecated
	public void Display()
	{
		System.out.println("Deprecatedtest display()");
	}
}

public class Annotation3
{
	@SuppressWarnings({"checked", "deprecation"})
	public static void main(String args[])
	{
		DeprecatedTest d1 = new DeprecatedTest();
		d1.Display();
	}
}

