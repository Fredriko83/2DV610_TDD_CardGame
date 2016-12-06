package model;

import java.util.ArrayList;

public class Deck {
	
	private ArrayList<Card> cards;
	private Card card;
	
	public Deck(){
		System.out.println(card);	
		this.cards = new ArrayList<Card>();		
		for (int i=0; i<13; i++){	 
			for (int j=0; j<4; j++){
				card = new Card(Card.Value.values()[i], Card.Suite.values()[j]);
				this.cards.add(card);				
			}		
	    }
		System.out.println(cards);
	}

	public Card getCard() {		
		return cards.remove(0);
	}

	public int cardsLeft() {		
		return cards.size();
	}	

	public Card getLastCard() {
		return cards.remove(cards.size()-1);
	}
}
