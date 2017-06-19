package br.ufsc.gustavo.model.flight;

import br.ufsc.gustavo.model.passenger.Load;

public class Transport extends Flight {

	private double maxWeight;
	private double currentWeight;
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
		return currentWeight;
	}

	public Load[] getLoads() {
		return loads;
	}

}
