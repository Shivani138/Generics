package com.javapracticals;
//for-each statement in final keyword
class Final2
{
	public static void main(String[] args)
	{
		int arr[] = {1, 2, 3};
		
		// final with for-each statement
		for (final int i : arr)
			System.out.print(i + " ");
	}	
}

