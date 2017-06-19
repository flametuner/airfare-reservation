package br.ufsc.gustavo.view;

import javax.swing.JOptionPane;

import br.ufsc.gustavo.model.passenger.Passenger;

public class ReservationMenu {

	public int displayPassengerMenu() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void displayWrongOption() {
		// TODO Auto-generated method stub

	}

	public int displayClassMenu() {
		StringBuilder b = new StringBuilder();
		b.append("1. Primeira classe.");
		b.append("\n");
		b.append("2. Classe economica.");
		return Integer.valueOf(JOptionPane.showInputDialog(b.toString()));
	}

	public boolean displayTryAnotherClass() {
		// TODO Auto-generated method stub
		return false;
	}

	public void displayFlightFull() {
		// TODO Auto-generated method stub

	}
	
	public Passenger displayPassenger() {
		String nome = JOptionPane.showInputDialog("Digite o nome do passageiro:");
		String cpf = JOptionPane.showInputDialog("Digite o CPF do passageiro:");
		return new Passenger(nome, cpf);
	}

	public int displayChooseSeat(String s) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void displaySeatNotAvailable() {
		// TODO Auto-generated method stub
		
	}

	public void displaySeatSuccess(int assento) {
		// TODO Auto-generated method stub
		
	}

	public void displaySeatNotValid() {
		// TODO Auto-generated method stub
		
	}

	public int displayTypeSeatId() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void displayPassengerNull() {
		// TODO Auto-generated method stub
		
	}

	public void displayPassengerInfo(Passenger passenger) {
		// TODO Auto-generated method stub
		
	}

	public void displayRemovedSuccess() {
		// TODO Auto-generated method stub
		
	}

}
