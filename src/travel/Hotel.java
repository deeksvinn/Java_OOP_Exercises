// This is subclass Hotel.java for Airtravel class which has details about hotels

package travel;

import java.time.LocalDate;

public class Hotel {
	
	private String locationOfHotel;
	private LocalDate dateOfCheckin;
	private LocalDate dateOfCheckout;
	private int numberOfGuests;
	private int bookingReference;
	private double priceForStay;
	private String hotelName;
	private String guestName;
	
	// Constructor
	
	public Hotel(String hotelName,String guestName,String locationOfHotel, LocalDate dateOfCheckin, LocalDate dateOfCheckout, int numberOfGuests, double priceforStay) {
			
		super();
		this.locationOfHotel = locationOfHotel;
		this.dateOfCheckin = dateOfCheckin;
		this.dateOfCheckout = dateOfCheckout;
		this.numberOfGuests = numberOfGuests;
		this.bookingReference = bookingReference;
		this.priceForStay = priceForStay;
		this.hotelName = hotelName;
	}

	// Getters and Setters for location of hotel,date of checkin,date of checkout,number of guests, booking reference,price for the stay and hotel name
	
	public String getlocationOfHotel() {
		return locationOfHotel;
	}

	public void setlocationOfHotel(String locationOfHotel) {
		this.locationOfHotel = locationOfHotel;
	}

	public LocalDate getdateOfCheckin() {
		return dateOfCheckin;
	}

	public void setdateOfCheckin(LocalDate dateOfCheckin) {
		this.dateOfCheckin = dateOfCheckin;
	}

	public LocalDate getdateOfCheckout() {
		return dateOfCheckout;
	}

	public void setdateOfCheckout(LocalDate dateOfCheckout) {
		this.dateOfCheckout = dateOfCheckout;
	}

	public int getNumberOfGuests() {
		return numberOfGuests;
	}

	public void setNumberOfGuests(int numberOfGuests) {
		this.numberOfGuests = numberOfGuests;
	}

	public int getBookingReference() {
		return bookingReference;
	}

	public void setBookingReference(int bookingReference) {
		this.bookingReference = bookingReference;
	}

	public double getPriceForStay() {
		return priceForStay;
	}

	public void setPriceForStay(double priceForStay) {
		this.priceForStay = priceForStay;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
}
