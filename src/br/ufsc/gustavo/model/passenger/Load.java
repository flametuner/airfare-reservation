package br.ufsc.gustavo.model.passenger;

public class Load {
	private double weight;
	private String description;

	public Load(double weight, String description) {
		this.weight = weight;
		this.description = description;
	}

	public double getWeight() {
		return weight;
	}

	public String getDescription() {
		return description;
	}

}
