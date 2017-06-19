package br.ufsc.gustavo.model.flight;

import br.ufsc.gustavo.model.passenger.Passenger;

public class Chartered extends Flight {

	private Passenger[] seats;

	public Chartered(int id, String destiny, String origin, int seats) {
		super(id, destiny, origin);
		this.seats = new Passenger[seats];
	}
	
	public Passenger[] getSeats() {
		return seats;
	}
	
	public int getCurrentSeats() {
		int current = 0;
		for (int i = 0; i < seats.length; i++)
			if (seats[i] != null)
				++current;
		return current;
	}
	
}
