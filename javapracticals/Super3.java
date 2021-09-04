package com.javapracticals;
/* superclass Person */
class Person1
{
	Person1()
	{
		System.out.println("Person class Constructor");
	}
}

/* subclass Student extending the Person class */
class Student2 extends Person
{
	Student2()
	{
		// invoke or call parent class constructor
		super();

		System.out.println("Student class Constructor");
	}
}

/* Driver program to test*/
class Super3
{
	public static void main(String[] args)
	{
		Student2 s = new Student2();
	}
}
