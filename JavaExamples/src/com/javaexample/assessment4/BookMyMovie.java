package com.javaexample.assessment4;

public class BookMyMovie {
	private int movieId;
	private int noOfTickets;
	private double discount;
	private double totalAmount;
	
	public BookMyMovie(int movieId, int noOfTickets) {
		super();
		this.movieId = movieId;
		this.noOfTickets = noOfTickets;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public int getNoOfTickets() {
		return noOfTickets;
	}

	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public void caluculateDiscount() {
		
		if(movieId == 101 && noOfTickets <=5 ) {
			discount = 5;
		}else if(movieId == 102 && noOfTickets < 5) {
			discount = 5;
		}else if(movieId == 103 && noOfTickets < 5) {
			discount = 5;
		}else if((movieId == 101 || movieId == 103) && (noOfTickets <5 && noOfTickets >= 10)) {
			discount = 15;
		}else if((movieId ==101 || movieId ==103) && (noOfTickets >= 10 && noOfTickets <= 10)) {
			discount = 20;
		}else if(movieId ==102 && (noOfTickets<=5 && noOfTickets > 10)) {
			discount = 10;
		}
		
	}
	
public double caluculateTicketAmount() {
	int baseFare = 0;
	if(movieId == 101) {
		baseFare = 120;
	}
	if(movieId == 102) {
		baseFare = 170;
	}
	if(movieId == 103) {
		baseFare = 150;
	}
    caluculateDiscount(); 
	totalAmount =baseFare * noOfTickets - (baseFare * noOfTickets * (discount/100));
	return totalAmount;
	
		
	}
	
	
	
 
}
