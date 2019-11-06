//Kacey Wheeler
//AP Computer Science: 3B
//10-31-19
//Boolean Labs 
//Leap Year

package boo;

public class LeapYear {
	
	public String checkLeap(int year) {
		String answer;
		
		//If year divisible by 400, then is leap year
		if (year % 400 == 0) {
			answer = " is a leap year.";
		}
		
		//If year not divisible by 100 and year divisible by 4, then is leap year
		else if (year % 100 != 0 && year % 4 == 0) {
			answer = " is a leap year.";
		}
		
		//If none are true, then is not leap year
		else {
			answer = " is NOT a leap year.";
		}
		
		return answer;
	}

}
