package com.javapracticals;
/* Base class Person */
class Person
{
	void message()
	{
		System.out.println("This is person class");
	}
}

/* Subclass Student */
class Student1 extends Person
{
	void message()
	{
		System.out.println("This is student class");
	}

	// Note that display() is only in Student class
	void display()
	{
		// will invoke or call current class message() method
		message();

		// will invoke or call parent class message() method
		super.message();
	}
}

/* Driver program to test */
class super2
{
	public static void main(String args[])
	{
		Student1 s = new Student1();

		// calling display() of Student
		s.display();
	}
}
