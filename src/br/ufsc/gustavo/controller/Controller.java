package br.ufsc.gustavo.controller;

import br.ufsc.gustavo.model.flight.Flight;

public class Controller {

	private Flight[] flights;
	
	public Controller() {
		flights = new Flight[3];
	}
	
	public Flight getFlight(int i) {
		return flights[i];
	}
	
	public boolean containsFlightSlot() {
		for(int i = 0; i < flights.length; i++) {
			if(flights[i] == null){
				return true;
			}
		}
		return false;
	}
	
	public int addFlight(Flight flight) {
		for(int i = 0; i < flights.length; i++) {
			if(flights[i] == null){
				flights[i] = flight;
				return i;
			}
		}
		return -1;
	}
	
	public boolean cancelFlight(int i) {
		if(flights[i] == null)
			return false;
		flights[i] = null;
		return true;
	}
	
}
