package br.ufsc.gustavo;

import br.ufsc.gustavo.controller.Main;
import br.ufsc.gustavo.model.Controller;
import br.ufsc.gustavo.view.MainMenu;

public class Start {

	public static void main(String[] args) {
		Controller control = new Controller(3);
		MainMenu menu = new MainMenu();
		Main main = new Main(menu, control);
		main.init();
		menu.displayFinish();
	}
}
