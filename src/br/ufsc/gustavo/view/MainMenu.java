package br.ufsc.gustavo.view;

import javax.swing.JOptionPane;

import br.ufsc.gustavo.model.flight.Flight;
import br.ufsc.gustavo.model.passenger.Passenger;

public class MainMenu {

	public int displayMainMenu() {
		StringBuilder b = new StringBuilder();
		b.append("Menu (Escolha uma Opção):");
		b.append("\n");
		b.append("1. Cadastrar voo.");
		b.append("\n");
		b.append("2. Cancelar voo.");
		b.append("\n");
		b.append("3. Reserva de assentos.");
		b.append("\n");
		b.append("4. Finish");
		return Integer.valueOf(JOptionPane.showInputDialog(b.toString()));
	}

	public int displayClassMenu() {
		StringBuilder b = new StringBuilder();
		b.append("1. Primeira classe.");
		b.append("\n");
		b.append("2. Classe economica.");
		return Integer.valueOf(JOptionPane.showInputDialog(b.toString()));
	}

	public Passenger displayPassenger() {
		String nome = JOptionPane.showInputDialog("Digite o nome do passageiro:");
		String cpf = JOptionPane.showInputDialog("Digite o CPF do passageiro:");
		return new Passenger(nome, cpf);
	}

	public void displayWrongOption() {
		// TODO Auto-generated method stub
		
	}

	public void displayFinish() {
		// TODO Auto-generated method stub
		
	}

	public int displaySelectFlight() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void displayCancelSuccess() {
		// TODO Auto-generated method stub
		
	}

	public void displayFlightNotValid() {
		// TODO Auto-generated method stub
		
	}

	public int displayFlightType() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void displayNoSlotAvailable() {
		// TODO Auto-generated method stub
		
	}

	public void displayFlightRegisterSuccess(int i) {
		// TODO Auto-generated method stub
		
	}
	
	// Flight Creeation

	public Flight createTransportFlight() {
		// TODO Auto-generated method stub
		return null;
	}

	public Flight createCharteredFlight() {
		// TODO Auto-generated method stub
		return null;
	}

	public Flight createCommercialFlight() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
