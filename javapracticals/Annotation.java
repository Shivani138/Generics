package com.javapracticals;
//@override

class Base
{
	public void display()
	{
		System.out.println("Base display()");
	}
}
class Annotation extends Base
{
	@Override
	public void display()
	{
		System.out.println("Derived display(int )");
	}

	public static void main(String args[])
	{
		Annotation obj = new Annotation();
		obj.display();
	}
}
