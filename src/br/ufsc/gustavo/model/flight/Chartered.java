package br.ufsc.gustavo.model.flight;

public class Chartered extends Flight {

	private int[] seats;

	public Chartered(int id, String destiny, String origin, int[] seats) {
		super(id, destiny, origin);
		this.seats = seats;
	}
	
	public int[] getSeats() {
		return seats;
	}
	
}
