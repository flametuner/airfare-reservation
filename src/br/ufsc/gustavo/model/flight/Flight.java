package br.ufsc.gustavo.model.flight;

public class Flight {

	private int id;
	private String origin;
	private String destiny;

	public Flight(int id, String destiny, String origin) {
		this.id = id;
		this.destiny = destiny;
		this.origin = origin;
	}

	public int getId() {
		return id;
	}

	public String getOrigin() {
		return origin;
	}

	public String getDestiny() {
		return destiny;
	}

}
