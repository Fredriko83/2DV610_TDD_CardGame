package model;

import java.util.ArrayList;

public class Deck {
	
	ArrayList<Card> deck;
	
	public Deck(){
		deck = new ArrayList<Card>();
		for(int i = 0; i < 52; i++){
			deck.add(new Card(Card.Value.Two, Card.Suite.Hearts));
		}
	}

	public Card getCard() {		
		return new Card(Card.Value.Two, Card.Suite.Hearts);
	}

	public int cardsLeft() {		
		return deck.size();
	}

}
