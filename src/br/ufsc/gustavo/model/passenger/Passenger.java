package br.ufsc.gustavo.model.passenger;

public class Passenger {

	private String name;
	private String cpf;
	
	public Passenger(String name, String cpf) {
		this.name = name;
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}

	public String getCpf() {
		return cpf;
	}
	
}
