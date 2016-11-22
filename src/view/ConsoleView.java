package view;

import java.io.PrintStream;

public class ConsoleView {

	static final String MENU = "Welcome to BlackJack\n(p)lay or (q)uit";
	private PrintStream output;

	public ConsoleView(PrintStream output) {
		this.output = output;
	}

	public void showMenu() {
		output.println(MENU);		
	}

	public void showQuit() {
		
		
	}

}
