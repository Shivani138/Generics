package Practical;
//Convert an Array into Collection in Java
import java.util.*;
public class AtoC1 {
	public static void main(String args[])
	{
		// array input
		String playersArray[]
			= { "Virat", "Sachin", "Rohit", "Bumrah" };
		System.out.println("Array input: " + Arrays.toString(playersArray));
		
		// converting array into Collection
		// with asList() function
		List playersList = Arrays.asList(playersArray);
		
		// print converted elements
		System.out.println("Converted elements: "
						+ playersList);
	}
}

