package com.javapracticals;
//A Java program to show that a parent object is not an instance of Child

class Parent1 { }
class Child2 extends Parent1 { }

class Instanceof2
{
	public static void main(String[] args)
	{
		Parent1 pobj = new Parent1();
		if (pobj instanceof Child2)
		System.out.println("pobj is instance of Child");
		else
		System.out.println("pobj is NOT instance of Child");
	}
}

