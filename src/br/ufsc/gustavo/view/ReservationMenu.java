package br.ufsc.gustavo.view;

import javax.swing.JOptionPane;

import br.ufsc.gustavo.model.passenger.Load;
import br.ufsc.gustavo.model.passenger.Passenger;

public class ReservationMenu {

	public int displayPassengerMenu() {
		StringBuilder b = new StringBuilder();
		b.append("Menu (Escolha uma Opção):");
		b.append("\n");
		b.append("1. Cadastrar reserva.");
		b.append("\n");
		b.append("2. Checkar reserva.");
		b.append("\n");
		b.append("3. Cancelar reserva.");
		b.append("\n");
		b.append("4. Voltar ao menu principal");
		return Integer.valueOf(JOptionPane.showInputDialog(b.toString()));
	}

	public void displayWrongOption() {
		JOptionPane.showMessageDialog(null, "Esta opção não é válida");
	}

	public int displayClassMenu() {
		StringBuilder b = new StringBuilder();
		b.append("1. Primeira classe.");
		b.append("\n");
		b.append("2. Classe economica.");
		return Integer.valueOf(JOptionPane.showInputDialog(b.toString()));
	}

	public boolean displayTryAnotherClass() {
		int i = JOptionPane.showConfirmDialog(null, "Essa classe esta lotada. Voce deseja tentar outra classe?");
		return i == 1;
	}

	public void displayFlightFull() {
		JOptionPane.showMessageDialog(null, "O voo esta lotado");
	}
	
	public Passenger displayPassenger() {
		String nome = JOptionPane.showInputDialog("Digite o nome do passageiro:");
		String cpf = JOptionPane.showInputDialog("Digite o CPF do passageiro:");
		return new Passenger(nome, cpf);
	}

	public int displayChooseSeat(String s) {
		return Integer.valueOf(JOptionPane.showInputDialog("Digite o numero do assento: \n" + s));
	}

	public void displaySeatNotAvailable() {
		JOptionPane.showMessageDialog(null, "Assento nao disponível");
	}

	public void displaySeatSuccess(int assento) {
		JOptionPane.showMessageDialog(null, "Assento " + assento + " selecionado com sucesso");
	}

	public void displaySeatNotValid() {
		JOptionPane.showMessageDialog(null, "Assento invalido");
	}

	public int displayTypeSeatId() {
		return Integer.valueOf(JOptionPane.showInputDialog("Digite o numero do assento:"));
	}

	public void displayPassengerNull() {
		JOptionPane.showMessageDialog(null, "Passageiro nao existe");
	}

	public void displayPassengerInfo(Passenger passenger) {
		StringBuilder b = new StringBuilder();
		b.append("Nome do passageiro: " + passenger.getName());
		b.append("\n");
		b.append("CPF do passageiro: " + passenger.getCpf());
		JOptionPane.showMessageDialog(null, b.toString());
	}

	public void displayRemovedSuccess() {
		JOptionPane.showMessageDialog(null, "Passageiro removido com sucesso");
	}

	public Load registerLoadInfo() {
		String nome = JOptionPane.showInputDialog("Digite o nome do Dono da carga:");
		String cpf = JOptionPane.showInputDialog("Digite o CPF do Dono da carga:");
		double weight = Double.parseDouble(JOptionPane.showInputDialog("Digite o tamanho da carga (KG):"));
		return new Load(nome, cpf, weight);
	}

	public void displayTransportFlightFull() {
		JOptionPane.showMessageDialog(null, "O Voo de carga está cheio");
	}

	public void displayLoadSuccess(int i) {
		JOptionPane.showMessageDialog(null, "A carga de numero " + i + " foi registrada com sucesso");
	}

	public void displayLoadTooLarge() {
		JOptionPane.showMessageDialog(null, "A carga é muito pesada");
	}

	public int displayTypeLoadId() {
		return Integer.valueOf(JOptionPane.showInputDialog("Digite o numero da carga:"));
	}

	public void displayLoadNotValid() {
		JOptionPane.showMessageDialog(null, "Carga invalida");
	}

	public void displayLoadNull() {
		JOptionPane.showMessageDialog(null, "Carga nao existe");
	}

	public void displayLoadInfo(Load load) {
		StringBuilder b = new StringBuilder();
		b.append("Nome do Dono: " + load.getName());
		b.append("\n");
		b.append("CPF do Dono: " + load.getCpf());
		b.append("\n");
		b.append("Peso da carga: " + load.getWeight());
		JOptionPane.showMessageDialog(null, b.toString());
	}

}
