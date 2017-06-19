package br.ufsc.gustavo.model;

import br.ufsc.gustavo.model.flight.Flight;

public class Controller {

	private Flight[] flights;
	
	public Controller(int flightNumber) {
		flights = new Flight[flightNumber];
	}
	
	public Flight getFlight(int i) {
		if(i >= flights.length)
			return null;
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
	
	public int getNextFlightId() {
		for(int i = 0; i < flights.length; i++) {
			if(flights[i] == null){
				return i;
			}
		}
		return -1;
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
		if(getFlight(i) == null)
			return false;
		flights[i] = null;
		return true;
	}
	
}
