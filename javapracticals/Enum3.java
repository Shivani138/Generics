package com.javapracticals;
//values(), ordinal() and valueOf()
enum Color2
{
	RED, GREEN, BLUE;
}

public class Enum3
{
	public static void main(String[] args)
	{
		Color2 arr[] = Color2.values();
		for (Color2 col : arr)
		{
			System.out.println(col + " at index "+ col.ordinal());
		}
		System.out.println(Color2.valueOf("RED"));
	}
}

