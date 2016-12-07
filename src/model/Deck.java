package model;

import java.util.ArrayList;

public class Deck {
	
	private ArrayList<Card> cards = new ArrayList<Card>();	
	private CardFactory CF = new CardFactory();
	
	public Deck(){
		init();
	}
	
	public void init() {		
		for (int i=0; i<13; i++){	 
			for (int j=0; j<4; j++){
				//card = cardFactory.createCard(Card.Value.values()[i], Card.Suite.values()[j]);
				this.cards.add(CF.createCard(Card.Value.values()[i], Card.Suite.values()[j]));			
			}
	    }
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
