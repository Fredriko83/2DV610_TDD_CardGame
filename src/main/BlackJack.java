package main;

import view.ConsoleView;

public class BlackJack {

	private ConsoleView view;

	public BlackJack(ConsoleView view) {
		this.view = view;
	}

	public static void main(String[] args) {
		BlackJack BJ = new BlackJack(new ConsoleView());
		BJ.run();
	}

	void run() {
		view.showMenu();
		
	}

}
