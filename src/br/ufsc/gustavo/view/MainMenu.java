package br.ufsc.gustavo.view;

import javax.swing.JOptionPane;

import br.ufsc.gustavo.model.flight.Chartered;
import br.ufsc.gustavo.model.flight.Commercial;
import br.ufsc.gustavo.model.flight.Flight;
import br.ufsc.gustavo.model.flight.Transport;

public class MainMenu {

	public int displayMainMenu() {
		StringBuilder b = new StringBuilder();
		b.append("Menu (Escolha uma Opção):");
		b.append("\n");
		b.append("1. Cadastrar voo.");
		b.append("\n");
		b.append("2. Visualizar voo.");
		b.append("\n");
		b.append("3. Cancelar voo.");
		b.append("\n");
		b.append("4. Reservas.");
		b.append("\n");
		b.append("5. Finish.");
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

	public Flight createTransportFlight(int flightId) {
		String origin = JOptionPane.showInputDialog("Digite a origem do voo:");
		String destiny = JOptionPane.showInputDialog("Digite o destino do voo:");
		int slots = Integer.valueOf(JOptionPane.showInputDialog("Digite o numero de slots de carga:"));
		double weight = Double.parseDouble(JOptionPane.showInputDialog("Digite a carga máxima suportada:"));
		return new Transport(flightId, destiny, origin, weight, slots);
	}

	public Flight createCharteredFlight(int flightId) {
		String origin = JOptionPane.showInputDialog("Digite a origem do voo:");
		String destiny = JOptionPane.showInputDialog("Digite o destino do voo:");
		int seats = Integer.valueOf(JOptionPane.showInputDialog("Digite o numero de assentos:"));
		return new Chartered(flightId, destiny, origin, seats);
	}

	public Flight createCommercialFlight(int flightId) {
		String origin = JOptionPane.showInputDialog("Digite a origem do voo:");
		String destiny = JOptionPane.showInputDialog("Digite o destino do voo:");
		int seats = Integer.valueOf(JOptionPane.showInputDialog("Digite o numero de assentos:"));
		return new Commercial(flightId, destiny, origin, seats);
	}

	public void displayFlight(Flight flight) {
		StringBuilder b = new StringBuilder();
		b.append("Numero do voo: " + flight.getId());
		b.append("\n");
		b.append("Origem: " + flight.getOrigin());
		b.append("\n");
		b.append("Destino: " + flight.getDestiny());
		b.append("\n");
		if(flight instanceof Transport) {
			Transport transport = (Transport) flight;
			b.append("Carga: (" + transport.getCurrentWeight() + "/" + transport.getMaxWeight() + ")");
			b.append("\n");
			b.append("Slot: (" + transport.getCurrentLoad() + "/" + transport.getLoads().length + ")");
		} else if(flight instanceof Commercial) {
			Commercial commercial = (Commercial) flight;
			b.append("Reservas de Primeira Classe: (" + commercial.getCurrentSeats() + "/" + commercial.getSeats().length + ")");
			b.append("\n");
			b.append("Reservas de Classe Economica: (" + commercial.getCurrentEconomic() + "/" + commercial.getEconomicClass().length + ")");
		} else if(flight instanceof Chartered) {
			Chartered chartered = (Chartered) flight;
			b.append("Reservas: (" + chartered.getCurrentSeats() + "/" + chartered.getSeats().length + ")");
		}
		JOptionPane.showMessageDialog(null, b.toString());
	}

}
