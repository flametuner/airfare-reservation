package br.ufsc.gustavo.model.passenger;

public class Load extends Passenger{
	private double weight;

	public Load(String name, String cpf, double weight) {
		super(name, cpf);
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

}
