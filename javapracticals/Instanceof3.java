package com.javapracticals;
//A Java program to show that a parent reference referring to a Child is an instance of Child

class Parent2 { }
class Child1 extends Parent2 { }

class Instanceof3
{
	public static void main(String[] args)
	{
		// Reference is Parent type but object is
		// of child type.
		Parent2 cobj = new Child1();
		if (cobj instanceof Child1)
		System.out.println("cobj is instance of Child");
		else
		System.out.println("cobj is NOT instance of Child");
	}
}

