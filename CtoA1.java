package Practical;
//Java program to change Collection to an array

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class CtoA1 {
	public static void main(String[] args)
	{

		// Creating arrayList list dynamically
		List<String> list = new ArrayList<String>();
		list.add("Shivani ");
		list.add("is ");
		list.add("a ");
		list.add("Java ");
		list.add("Developer ");

		// Converting list to an array
		String[] str = list.toArray(new String[0]);

		for (int i = 0; i < str.length; i++) {
			String data = str[i];
			System.out.print(data);
		}
	}
}

