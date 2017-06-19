package br.ufsc.gustavo.model.flight;

import br.ufsc.gustavo.model.passenger.Passenger;

public class Commercial extends Chartered {

	private Passenger[] economicClass;
	
	public Commercial(int id, String destiny, String origin, int seats) {
		super(id, destiny, origin, (int) (seats * 0.2));
		this.economicClass = new Passenger[(int) (seats * 0.8)];
	}
	
	public Passenger[] getEconomicClass() {
		return economicClass;
	}
	
	public int getCurrentEconomic() {
		int current = 0;
		for (int i = 0; i < economicClass.length; i++)
			if (economicClass[i] != null)
				++current;
		return current;
	}

}
