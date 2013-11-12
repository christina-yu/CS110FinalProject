import java.util.Scanner;

public class Test1
{
	enum MonthName {JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY,
				AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER}

	public static void main(String[] args)
	{

		AddressBook b1 = new AddressBook();
		//b1.add(c1);
		//b1.add(c2);
		//b1.add(c3);

		b1.displayAll();

//		String name;
//		int units;
//		double price;
//
//		Scanner kbd = new Scanner(System.in);
//		System.out.print("Item name: ");
//		name = kbd.nextLine();
//
//		System.out.print("Number of units: ");
//		units = kbd.nextInt();
//
//		System.out.print("Price: ");
//		price = kbd.nextDouble();
//
//		RetailItem item1 = new RetailItem(name, units, price);
//
//		System.out.println(item1);
//
//		int i = 2, j = 0;
//
//		j = i++;
//
//		System.out.println(j);


//		System.out.println((MonthName.MAY.toString()).equalsIgnoreCase("May"));
//
//		//System.out.println(MonthName.MAY.toString());
//
//		if(monthStr.equalsIgnoreCase(MonthName.JANUARY.toString()))
//			monthNumber = 1;
//		else if(monthStr.equalsIgnoreCase(MonthName.FEBRUARY.toString()))
//			monthNumber = 2;
//		else if(monthStr.equalsIgnoreCase(MonthName.MARCH.toString()))
//			monthNumber = 3;
//		else if(monthStr.equalsIgnoreCase(MonthName.APRIL.toString()))
//			monthNumber = 4;
//		else if(monthStr.equalsIgnoreCase(MonthName.MAY.toString()))
//			monthNumber = 5;
//		else if(monthStr.equalsIgnoreCase(MonthName.JUNE.toString()))
//			monthNumber = 6;
//		else if(monthStr.equalsIgnoreCase(MonthName.JULY.toString()))
//			monthNumber = 7;
//		else if(monthStr.equalsIgnoreCase(MonthName.AUGUST.toString()))
//			monthNumber = 8;
//		else if(monthStr.equalsIgnoreCase(MonthName.SEPTEMBER.toString()))
//			monthNumber = 9;
//		else if(monthStr.equalsIgnoreCase(MonthName.OCTOBER.toString()))
//			monthNumber = 10;
//		else if(monthStr.equalsIgnoreCase(MonthName.NOVEMBER.toString()))
//			monthNumber = 11;
//		else if(monthStr.equalsIgnoreCase(MonthName.DECEMBER.toString()))
//			monthNumber = 12;
//		else
//			System.out.println("That is not a month name.");
	}
}