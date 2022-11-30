package com.javaexample.assessment4;

public class BookMyMovieTest {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		double totalCost =0.0;
		
		BookMyMovie bookMyMovie1 = new BookMyMovie(101, 5);
		totalCost = bookMyMovie1.caluculateTicketAmount();
		System.out.println("Total amount for booking :"+totalCost);
		BookMyMovie bookMyMovie2 = new BookMyMovie(102, 4);
		totalCost = bookMyMovie2.caluculateTicketAmount();
		System.out.println("Total amount for booking :"+totalCost);
		BookMyMovie bookMyMovie3 = new BookMyMovie(103, 8);
		totalCost = bookMyMovie3.caluculateTicketAmount();
		System.out.println("Total amount for booking :"+totalCost);
		

	}

}
