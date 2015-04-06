
public class LeapYear {

	public static void main(String[] args) {
/*	
 Is commented method is correct  ?
      int year = 2010;
//		if ((year%4 == 0)||(year%400 ==0) )
//			System.out.println("Year is leap year");
//		else
//			System.out.println ("Year is not leap year");
//			} */
	
	int year = 2010;
	
	if (year %100 == 0)
	{
		if(year %400 == 0)
			System.out.println("This is a leap year");
	}
	
	else if (year%4 ==0)
		System.out.println("This is a leap year");
	else
		System.out.println("This is not a leap year");
		
}
}