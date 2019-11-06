//Kacey Wheeler
//AP Computer Science: 3B
//10-31-19
//Boolean Labs
//Leap Year Runner

package boo;
import java.util.Scanner;
import boo.LeapYear;

public class LeapYearRunner {

	public static void main(String[] args) {
		
		//Create new scanner
		Scanner keyboard = new Scanner(System.in);
		
		//Get user input for year
		System.out.println("Enter a year: ");
		int year = keyboard.nextInt();
		
		//Create new object
		LeapYear ref = new LeapYear();
		
		//Call method and print result
		System.out.println(year + ref.checkLeap(year));
		
			
		
		
		

	}

}
