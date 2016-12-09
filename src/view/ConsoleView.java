package view;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

import model.Card;

public class ConsoleView {

	static final String MENU = "Welcome to BlackJack\n(p)lay or (q)uit";
	static final String QUIT = "Welcome back";
	public boolean quits = false;

	private PrintStream output;

	public ConsoleView(PrintStream output) {
		this.output = output;
	}

	public boolean showMenu() {
		String quitOrPlay;
		output.println(MENU);
		Scanner scan = new Scanner(System.in);
		quitOrPlay = scan.next();
		if (quitOrPlay.equals("q")) {
			return true;
		} else {
			return false;
		}

	}

	public void showQuit() {
		output.println(QUIT);
	}

	public boolean userQuits() {
		// TODO Auto-generated method stub
		return false;
	}

	public void showFirstDeal(ArrayList<Card> dealerCards, int dealerScore, ArrayList<Card> playerCards,
			int playerScore) {
		System.out.println("Dealer: " + dealerCards.toString());
		System.out.println("DealerScore: " + Integer.toString(dealerScore));
		System.out.println("Player: " + playerCards.toString());
		System.out.println("PlayerScore: " + Integer.toString(playerScore));
	}

	public String showGameMenu() {
		Scanner scan = new Scanner(System.in);
		String gameMenuAnswer;
		System.out.println("Press (h)it or (s)tand");
		gameMenuAnswer = scan.next();
		return gameMenuAnswer;
	}

	public void showWinner(String dealerWins) {
		if (dealerWins == "Push") {
			System.out.println("It's a push...");
		} else {
			System.out.println(dealerWins + " Wins!!!");
		}
	}

}
