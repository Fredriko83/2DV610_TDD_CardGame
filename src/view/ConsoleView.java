package view;

import java.io.PrintStream;

public class ConsoleView {

	private PrintStream output;

	public ConsoleView(PrintStream output) {
		this.output = output;
	}

	public void showMenu() {
		output.println("Welcome to BlackJack\n(p)lay or (q)uit");		
	}

}
