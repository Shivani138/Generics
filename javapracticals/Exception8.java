package com.javapracticals;
//use-defined expception
class MyException extends Exception
{

}
public class Exception8
{
	// Driver Program
	public static void main(String args[])
	{
		try
		{
			throw new MyException();
		}
		catch (MyException ex)
		{
			System.out.println("Caught");
			System.out.println(ex.getMessage());
		}
	}
}



