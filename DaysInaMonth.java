
public class DaysInaMonth {

	public static void main(String[] args) {
		String EnteredMonth;
		EnteredMonth = "Boom";
		switch (EnteredMonth)
		{
			
			case "Jan" :
			case "Mar" :
			case "May" :
			case "July" :
			case "Aug" :
			case "Oct" :
			case "Dec" :
				System.out.println("31 days");
				break;
			case "Feb" :
				System.out.println("28 days");
				break;
			case "April":
			case "June":
			case "Sept":
			case "Nov":
				System.out.println("30 days");
				break;
			
			default :
				System.out.println("Invalid Input");
		}
		
		}
		
	}

