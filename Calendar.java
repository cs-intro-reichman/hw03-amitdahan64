/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar {
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
        static int year = 1900;
        static int dayOfWeek = 2;
	static int nDaysInMonth = 31;
	static int specialSundayCounter = 0; // Number of days in January
	


	public static void main(String args[]) {
            int year2 = Integer.parseInt(args[0]);

	    
                while (!(year == year2 + 1)) {
                    if(year == year2){
                        if(dayOfWeek == 1){
                                System.out.println(dayOfMonth + "/" + month + "/" + year + " Sunday");

                        }
                        else{
                                System.out.println(dayOfMonth + "/" + month + "/" + year);
                        }
                        }

	 		advance();

        }



             }
	 private static void advance() {
		int days = nDaysInMonth(month,year);
		if(dayOfMonth == days){ //checks if month changes tomorrow
			dayOfMonth = 1;
			if(dayOfWeek == 1)specialSundayCounter++;

			if(dayOfWeek == 7) //checks if its saturday
			{
				dayOfWeek = 1;
			}
			else{
				dayOfWeek++;
			}

			if(month == 12){ //checks if year changes tomorrow
				year++;
				month = 1;
			}
			else{
				month++;
			}
		}
		else{
			if(dayOfWeek == 7) //checks if its saturday
			{
				dayOfWeek = 1;
			}
			else{
				dayOfWeek++;
			}

			dayOfMonth++;
		}
	 } 
		 

	private static boolean isLeapYear(int year) {
	  if(year % 400 == 0 || ((year % 100 != 0) && (year % 4 == 0))){
	    	return true;
	    }
	    else {
	    	return false;
	    }
		
	}
	 

	private static int nDaysInMonth(int month, int year) {
	int days = 31;
		boolean isYear = isLeapYear(year);
		if(month == 11 || month == 9 || month == 6 || month == 4){
			days = 30;
		}

		if(month == 2)
		{
			if(isYear){

				days = 29;
			}

			else {
				days = 28;
			}
		}
		return days;
	}
}
