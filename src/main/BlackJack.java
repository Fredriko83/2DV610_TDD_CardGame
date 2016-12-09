package main;

import model.Dealer;
import model.Player;
import view.ConsoleView;

public class BlackJack {

	private ConsoleView view;
	private Dealer dealer;
	private Player player;

	public BlackJack(ConsoleView view, Dealer dealer, Player player) {
		this.view = view;
		this.dealer = dealer;
		this.player = player;
	}

	public static void main(String[] args) {

		ConsoleView V = new ConsoleView(System.out);
		Dealer D = new Dealer();
		Player P = new Player();
		BlackJack BJ = new BlackJack(V, D, P);
		BJ.run();
	}

	void run() {
		String gameMenuAnswer;
		boolean wantsToQuit = false;
		wantsToQuit = view.showMenu();
		//while (!view.userQuits()) {
		while (!wantsToQuit) {
			//wantsToQuit = view.showMenu();
			if (view.userQuits() == false) {

				dealer.startGame(player);
				view.showFirstDeal(dealer.getHand(), dealer.calcHandValue(), player.getHand(), player.calcHandValue());
				gameMenuAnswer = view.showGameMenu();
				while (gameMenuAnswer.equals("h")) {
					dealer.dealCard(player);
					view.showFirstDeal(dealer.getHand(), dealer.calcHandValue(), player.getHand(),
							player.calcHandValue());
					gameMenuAnswer = view.showGameMenu();
				}
				dealer.play(player);
				view.showFirstDeal(dealer.getHand(), dealer.calcHandValue(), player.getHand(), player.calcHandValue());
				view.showWinner(dealer.dealerWins(player));
				dealer.resetGame(player);
				wantsToQuit = view.showMenu();
			}
		}
		view.showQuit();
	}

}
