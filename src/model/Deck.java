package model;

import java.util.ArrayList;

public class Deck {
	
	ArrayList<Card> deck = null;

	public Card getCard() {
		// TODO Auto-generated method stub
		return new Card(Card.Value.Two, Card.Suite.Hearts);
	}

}
