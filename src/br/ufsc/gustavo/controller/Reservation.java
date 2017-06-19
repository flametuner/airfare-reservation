package br.ufsc.gustavo.controller;

import java.util.Arrays;

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
				displayCommercialReservation(commercial.getSeats(), commercial.getEconomicClass());
				break;
			case 2:
				displayCommercialReservation(commercial.getEconomicClass(), commercial.getSeats());
				break;
			default:
				menu.displayWrongOption();
				break;
			}
		} else {
			Chartered chartered = (Chartered) flight;
			chooseSeat(chartered.getSeats(), 0);
		}
	}

	public void displayCommercialReservation(Passenger[] seats1, Passenger[] seats2) {
		int add = 0;
		if (seats1.length > seats2.length)
			add = seats2.length;
		if (!checkIfFull(seats1)) {
			chooseSeat(seats1, add);
		} else {
			if (menu.displayTryAnotherClass()) {
				if (!checkIfFull(seats2))
					chooseSeat(seats2, add > 0 ? 0 : seats1.length);
				else
					menu.displayFlightFull();
			}
		}
	}

	private void chooseSeat(Passenger[] seats, int add) {
		String s = "{ ";
		for (int i = 0; i < seats.length; i++) {
			if (seats[i] == null) {
				s += (i + add);
				if (i < seats.length - 1)
					s += ", ";
				else
					s += " }";
			}
		}
		while (true) {
			int assento = menu.displayChooseSeat(s) - add;
			if (assento < 0 || assento >= seats.length) {
				menu.displaySeatNotValid();
				continue;
			}
			if (seats[assento] != null) {
				menu.displaySeatNotAvailable();
				continue;
			}
			Passenger passager = menu.displayPassenger();
			seats[assento] = passager;
			menu.displaySeatSuccess(assento + add);
			break;
		}
	}

	private boolean checkIfFull(Passenger[] seats) {
		Passenger[] copy = Arrays.copyOf(seats, seats.length);
		Arrays.sort(copy);
		return Arrays.binarySearch(copy, null) >= 0;
	}

	private void checkReservation() {
		if (flight instanceof Transport) {

		} else if (flight instanceof Commercial) {
			int assento = menu.displayTypeSeatId();
			Commercial commercial = (Commercial) flight;
			Passenger passenger = null;
			if (assento < 0) {
				menu.displaySeatNotValid();
				return;
			}
			if (assento >= commercial.getSeats().length) {
				assento -= commercial.getSeats().length;
			} else {
				passenger = commercial.getSeats()[assento];
			}
			if (passenger == null) {
				if (assento >= commercial.getEconomicClass().length) {
					menu.displaySeatNotValid();
					return;
				}
				passenger = commercial.getEconomicClass()[assento];
			}
			if (passenger == null) {
				menu.displayPassengerNull();
			} else {
				menu.displayPassengerInfo(passenger);
			}
		} else {
			Chartered chartered = (Chartered) flight;
			int assento = menu.displayTypeSeatId();
			if (assento < 0 || assento >= chartered.getSeats().length) {
				menu.displaySeatNotValid();
				return;
			}
			Passenger passenger = chartered.getSeats()[assento];
			if (passenger == null) {
				menu.displayPassengerNull();
				return;
			}
			menu.displayPassengerInfo(passenger);
		}
	}

	private void removeReservation() {
		if (flight instanceof Transport) {

		} else if (flight instanceof Commercial) {
			int assento = menu.displayTypeSeatId();
			Commercial commercial = (Commercial) flight;
			if (assento < 0) {
				menu.displaySeatNotValid();
				return;
			}
			if (assento < commercial.getSeats().length) {
				if(commercial.getSeats()[assento] == null) {
					menu.displayPassengerNull();
					return;
				}
				commercial.getSeats()[assento] = null;
				menu.displayRemovedSuccess();
				return;
			} else {
				assento -= commercial.getSeats().length;
			}
			if (assento >= commercial.getEconomicClass().length) {
				menu.displaySeatNotValid();
				return;
			}
			if(commercial.getEconomicClass()[assento] == null) {
				menu.displayPassengerNull();
				return;
			}
			commercial.getEconomicClass()[assento] = null;
			menu.displayRemovedSuccess();
		} else {
			Chartered chartered = (Chartered) flight;
			int assento = menu.displayTypeSeatId();
			if (assento < 0 || assento >= chartered.getSeats().length) {
				menu.displaySeatNotValid();
				return;
			}
			if (chartered.getSeats()[assento] == null) {
				menu.displayPassengerNull();
				return;
			}
			menu.displayRemovedSuccess();
		}
	}

}
