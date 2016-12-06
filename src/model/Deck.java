package model;

import java.util.ArrayList;

public class Deck {
	
	ArrayList<Card> deck;

	public Card getCard() {
		// TODO Auto-generated method stub
		return new Card(Card.Value.Two, Card.Suite.Hearts);
	}

	public Object cardsLeft() {
		// TODO Auto-generated method stub
		return null;
	}

}
