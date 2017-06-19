package br.ufsc.gustavo.model.flight;

import br.ufsc.gustavo.model.passenger.Load;

public class Transport extends Flight {

	private double maxWeight;
	private Load[] loads;

	public Transport(int id, String destiny, String origin, double maxWeight, int maxSlot) {
		super(id, destiny, origin);
		this.maxWeight = maxWeight;
		this.loads = new Load[maxSlot];
	}

	public double getMaxWeight() {
		return maxWeight;
	}

	public double getCurrentWeight() {
		double d = 0;
		for (int i = 0; i < loads.length; i++) {
			if (loads[i] != null)
				d += loads[i].getWeight();
		}
		return d;
	}

	public int getCurrentLoad() {
		int current = 0;
		for (int i = 0; i < loads.length; i++)
			if (loads[i] != null)
				++current;
		return current;
	}

	public Load[] getLoads() {
		return loads;
	}

}
