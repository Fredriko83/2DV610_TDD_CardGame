package model;

import java.util.ArrayList;

public class Dealer {
	private ArrayList<Card> hand;

	public Dealer(Deck deck) {
		hand = new ArrayList<Card>();
	}

	public ArrayList<Card> getHand() {
		return hand;
	}

}
