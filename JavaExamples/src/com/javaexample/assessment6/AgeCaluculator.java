package com.javaexample.assessment6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class AgeCaluculator {

	public static void main(String[] args) {

		LocalDate dateObj = LocalDate.now();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Entered date");

		String date = scanner.next();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
		LocalDate entereddate = LocalDate.parse(date, dateTimeFormatter);
		DateTimeFormatter newDateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println(newDateTimeFormatter.format(entereddate));
		System.out.println("You are " + ChronoUnit.YEARS.between(entereddate, dateObj) + " Years,"
				+ ChronoUnit.MONTHS.between(entereddate, dateObj) + " Months and "
				+ ChronoUnit.DAYS.between(entereddate, dateObj) + " days old");

	}

}
