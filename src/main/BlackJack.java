package main;

import view.ConsoleView;

public class BlackJack {

	private ConsoleView view;

	public BlackJack(ConsoleView view) {
		this.view = view;
	}

	public static void main(String[] args) {
		BlackJack BJ = new BlackJack(new ConsoleView(System.out));
		BJ.run();
	}

	void run() {
		view.showMenu();
		
		if(view.userQuits() == false){
			view.showBetting();
		}
		
		view.showQuit();
	}

}
