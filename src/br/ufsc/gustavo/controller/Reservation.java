package br.ufsc.gustavo.controller;

import br.ufsc.gustavo.model.flight.Chartered;
import br.ufsc.gustavo.model.flight.Commercial;
import br.ufsc.gustavo.model.flight.Flight;
import br.ufsc.gustavo.model.flight.Transport;
import br.ufsc.gustavo.model.passenger.Passenger;
import br.ufsc.gustavo.view.ReservationMenu;

public class Reservation {

	private ReservationMenu menu;
	private Flight flight;

	public Reservation(ReservationMenu menu, Flight flight) {
		this.menu = menu;
		this.flight = flight;
	}

	public void init() {
		boolean back = false;
		while (!back) {
			switch (menu.displayPassengerMenu()) {
			case 1: // CADASTRAR
				registerReservation();
				break;
			case 2: // CONSULTAR
				checkReservation();
				break;
			case 3: // REMOVER
				removeReservation();
				break;
			case 4: // VOLTAR
				back = true;
				break;
			default:
				menu.displayWrongOption();
				break;
			}
		}
	}

	private void registerReservation() {
		if (flight instanceof Transport) {

		} else if (flight instanceof Commercial) {
			Commercial commercial = (Commercial) flight;
			switch (menu.displayClassMenu()) {
			case 1:
				displayReservation(commercial.getSeats(), commercial.getEconomicClass());
				break;
			case 2:
				displayReservation(commercial.getEconomicClass(), commercial.getSeats());
				break;
			default:
				menu.displayWrongOption();
				break;
			}
		} else {
			Chartered chartered = (Chartered) flight;
			chooseSeat(chartered.getSeats());
		}
	}

	public void displayReservation(Passenger[] seats1, Passenger[] seats2) {
		if (!checkIfFull(seats1)) {
			chooseSeat(seats1);
		} else {
			if (menu.displayTryAnotherClass()) {
				if (!checkIfFull(seats2))
					chooseSeat(seats2);
				else
					menu.displayFlightFull();
			}
		}
	}

	private void chooseSeat(Passenger[] seats1) {
		// TODO Auto-generated method stub

	}

	private boolean checkIfFull(Passenger[] seats1) {
		// TODO Auto-generated method stub
		return false;
	}

	private void checkReservation() {
		if (flight instanceof Transport) {

		} else if (flight instanceof Commercial) {

		} else {

		}
	}

	private void removeReservation() {
		if (flight instanceof Transport) {

		} else if (flight instanceof Commercial) {

		} else {

		}
	}

}
