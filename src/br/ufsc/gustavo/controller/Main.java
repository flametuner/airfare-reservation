package br.ufsc.gustavo.controller;

import br.ufsc.gustavo.model.Controller;
import br.ufsc.gustavo.model.flight.Flight;
import br.ufsc.gustavo.view.MainMenu;
import br.ufsc.gustavo.view.ReservationMenu;

public class Main {

	private MainMenu menu;
	private Controller control;
	private boolean running = true;

	public Main(MainMenu menu, Controller control) {
		this.menu = menu;
		this.control = control;
	}

	public void init() {
		while (running) {
			switch (menu.displayMainMenu()) {
			case 1: // CADASTRO DE VOO
				registerFlight();
				break;
			case 2: // CANCELAMENTO DE VOO
				cancelFlight();
				break;
			case 3: // RESERVA DE ASSENTOS
				reserveSeat();
				break;
			case 4:
				running = false;
				break;
			default:
				menu.displayWrongOption();
				break;
			}
		}
	}

	private void registerFlight() {
		if (!control.containsFlightSlot()) {
			menu.displayNoSlotAvailable();
			return;
		}
		Flight flight = null;
		boolean wrongOp = true;
		int nextFlightId = control.getNextFlightId();
		while (wrongOp) {
			switch (menu.displayFlightType()) {
			case 1: // COMERCIAL
				flight = menu.createCommercialFlight(nextFlightId);
				wrongOp = false;
				break;
			case 2: // FRETADO
				flight = menu.createCharteredFlight(nextFlightId);
				wrongOp = false;
				break;
			case 3: // TRANSPORTE
				flight = menu.createTransportFlight(nextFlightId);
				wrongOp = false;
				break;
			default:
				menu.displayWrongOption();
				break;
			}
		}
		int i = control.addFlight(flight);
		if (i != -1) {
			menu.displayFlightRegisterSuccess(i);
		} else {
			menu.displayFlightError();
		}
	}

	private void cancelFlight() {
		int id;
		while (true) {
			id = menu.displaySelectFlight();
			if (control.cancelFlight(id)) {
				menu.displayFlightCancelSuccess();
				break;
			}
			menu.displayFlightNotValid();
		}
	}

	private void reserveSeat() {
		int flightNumber = menu.displaySelectFlight();
		Flight f = control.getFlight(flightNumber);
		if (f == null) {
			menu.displayFlightNotValid();
			return;
		}
		ReservationMenu menu = new ReservationMenu();
		Reservation reservation = new Reservation(menu, f);
		reservation.init();
	}

}
