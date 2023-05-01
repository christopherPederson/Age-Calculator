//This program is designed to calculate the number of days in between your birthday and the current day
//the program is designed to ignore leap years and requires that the dates be input by the user. your 
//job is to find the three errors in this program using your built in debugger tool. for reference 
//01/08/2004 to 10/01/2023 should result in 6732 days. Good luck!!!
//
// ***ONLY FOR TEACHER***
// Errors on lines 28, 48, 46


import java.util.Scanner;

public class AgeCalculator {

	public static void main(String[] args) {
		
		int[] month_array = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		Scanner scanned_current_year = new Scanner(System.in);
		System.out.println("what year is it today?");
		int current_year = scanned_current_year.nextInt();
		
		Scanner scanned_current_month = new Scanner(System.in);
		System.out.println("what month is it today?");
		int current_month = scanned_current_month.nextInt();
		
		Scanner scanned_current_day = new Scanner(System.in);
		System.out.println("what day is it today?");
		int current_day = scanned_current_day.nextInt();
		
		Scanner scanned_birth_year = new Scanner(System.in);
		System.out.println("what year were you born?");
		int birth_year = scanned_birth_year.nextInt();
		
		Scanner scanned_birth_month = new Scanner(System.in);
		System.out.println("what month were you born?");
		int birth_month = scanned_birth_month.nextInt();
		
		Scanner scanned_birth_day = new Scanner(System.in);
		System.out.println("what day were you born?");
		int birth_day = scanned_birth_day.nextInt();
		
		int total_days = 0; // declaring the sum total variable 
		
		total_days += (month_array[birth_month - 1] - birth_day); //adds to the total the number of days after the the birth month
		
		total_days += (current_day - 1);// adds to the total the number of days in the last month
		
		for (int i = (birth_month + 1); i <= 12; ++i) { // calculates the number of days in all the whole months of the partial first year 
			total_days += month_array[i - 1]; 
		}
		
		for (int i = 1; i < current_month; ++i) { // calculates the number of days in all the whole months of the final year 
			total_days += month_array[i - 1]; 
		}
		
		total_days += (((current_year - birth_year)-1)*365); // calculates the number of days in all the whole years 
		
		System.out.println("You were born " + total_days + " days ago!!!");
	}

}
