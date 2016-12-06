package model;

import java.util.ArrayList;

public class Deck {
	
	private ArrayList<Card> deck;
	
	public Deck(){
		deck = new ArrayList<Card>();
		for(int i = 0; i < 52; i++){
			deck.add(new Card(Card.Value.Two, Card.Suite.Hearts));
		}
	}

	public Card getCard() {		
		return deck.remove(0);
	}

	public int cardsLeft() {		
		return deck.size();
	}

}
