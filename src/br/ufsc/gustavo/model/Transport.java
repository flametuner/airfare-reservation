package br.ufsc.gustavo.model;

public class Transport extends Flight{

	private double maxWeight;
	private double currentWeight;
	
	public Transport(int id, String destiny, String origin, double maxWeight) {
		super(id, destiny, origin);
		this.maxWeight = maxWeight;
	}
	
	public double getMaxWeight() {
		return maxWeight;
	}
	
	public double getCurrentWeight() {
		return currentWeight;
	}
	
}
