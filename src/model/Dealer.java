package model;

import java.util.ArrayList;

public class Dealer extends Player {

	private Deck deck;
	String winner;
	
	public String dealerWins(Player player) {
		if (this.calcHandValue() == player.calcHandValue()) {
			winner = "Push";
		} else if (this.calcHandValue() > 21 && player.calcHandValue() <= 21) {
			winner = "Player";
		} else if (player.calcHandValue() > 21 && this.calcHandValue() <= 21) {
			winner = "Dealer";
		} else if (this.calcHandValue() > player.calcHandValue()) {
			winner = "Dealer";
		} else {
			winner = "Player";
		}
		return winner;
	}

	public void startGame(Player player) {
		deck = new Deck();		
		this.addDealtCard(deck.getCard());
		player.addDealtCard(deck.getCard());
		player.addDealtCard(deck.getCard());	
	}
}
