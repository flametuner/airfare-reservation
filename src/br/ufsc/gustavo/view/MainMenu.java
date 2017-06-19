package br.ufsc.gustavo.view;

import javax.swing.JOptionPane;

import br.ufsc.gustavo.model.flight.Flight;

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

	public void displayWrongOption() {
		JOptionPane.showMessageDialog(null, "Esta opção não é válida");
	}

	public void displayFinish() {
		JOptionPane.showMessageDialog(null, "Fim do programa");
	}

	public int displaySelectFlight() {
		return Integer.valueOf(JOptionPane.showInputDialog("Digite o numero do Voo:"));
	}

	public void displayFlightCancelSuccess() {
		JOptionPane.showMessageDialog(null, "Voo cancelado com sucesso");
	}

	public void displayFlightNotValid() {
		JOptionPane.showMessageDialog(null, "Voo invalido");
	}

	public int displayFlightType() {
		StringBuilder b = new StringBuilder();
		b.append("Escolha o tipo de voo:");
		b.append("\n");
		b.append("1. Comercial.");
		b.append("\n");
		b.append("2. Fretado.");
		b.append("\n");
		b.append("3. Transporte.");
		return Integer.valueOf(JOptionPane.showInputDialog(b.toString()));
	}
	
	public void displayFlightError() {
		JOptionPane.showMessageDialog(null, "Erro ao cadastrar voo");
	}

	public void displayNoSlotAvailable() {
		JOptionPane.showMessageDialog(null, "Não há vagas de voos disponíveis");
	}

	public void displayFlightRegisterSuccess(int i) {
		JOptionPane.showMessageDialog(null, "Voo de numero " + i + " registrado com sucesso!");
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
