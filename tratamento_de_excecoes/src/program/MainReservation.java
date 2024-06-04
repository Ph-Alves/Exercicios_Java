package program;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class MainReservation {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Room number: ");
			int roomNumb = sc.nextInt();
			System.out.print("Check-in date (dd/MM/yyyy): ");
			LocalDate checkIn = LocalDate.parse(sc.next(), fmt1);
			System.out.print("Check-out date (dd/MM/yyy): ");
			LocalDate checkOut = LocalDate.parse(sc.next(), fmt1);
			Reservation reservation = new Reservation(roomNumb, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			System.out.println("Enter data to update the reservation: ");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = LocalDate.parse(sc.next(), fmt1);
			System.out.print("Check-out date (dd/MM/yyy): ");
			checkOut = LocalDate.parse(sc.next(), fmt1);
			
			reservation.updateDates(checkIn, checkOut);
			System.out.println(reservation);
		} catch (DomainException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		} catch (DateTimeParseException e){
			System.out.println("Invalid date format");
		} catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}
		sc.close();
	}

}
