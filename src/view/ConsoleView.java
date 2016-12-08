package view;

import java.io.PrintStream;

public class ConsoleView {

	static final String MENU = "Welcome to BlackJack\n(p)lay or (q)uit";
	static final String QUIT = "Welcome back";
	
	private PrintStream output;

	public ConsoleView(PrintStream output) {
		this.output = output;
	}

	public void showMenu() {
		output.println(MENU);		
	}

	public void showQuit() {
		output.println(QUIT);		
	}

	public boolean userQuits() {
		// TODO Auto-generated method stub
		return false;
	}

	public void showBetting() {
		// TODO Auto-generated method stub
		
	}

}
