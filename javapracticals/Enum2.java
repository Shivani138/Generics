package com.javapracticals;
//Enum in switch statement
enum Day
{
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}
public class Enum2
{
	Day day;
	public Enum2(Day day)
	{
		this.day = day;
	}

	public void dayIsLike()
	{
		switch (day)
		{
		case MONDAY:
			System.out.println("Monday.");
			break;
		case TUESDAY:
			System.out.println("Tuesday.");
			break;
		case WEDNESDAY:
			System.out.println("Wednesday.");
			break;
		case THURSDAY:
			System.out.println("Thrusday.");
			break;
		case FRIDAY:
			System.out.println("Friday.");
			break;
		case SATURDAY:
		case SUNDAY:
			System.out.println("Weekends are best.");
			break;
		default:
			System.out.println("Midweek days are so-so.");
			break;
		}
	}

	public static void main(String[] args)
	{
		String str = "MONDAY";
		Enum2 t1 = new Enum2(Day.valueOf(str));
		t1.dayIsLike();
	}
}
