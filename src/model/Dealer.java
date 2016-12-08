package model;

import java.util.ArrayList;

public class Dealer {
	private ArrayList<Card> m_hand;
	private Deck m_deck;
	
	

	public Dealer(Deck deck) {
		m_hand = new ArrayList<Card>();
		m_deck = deck;
	}

	public ArrayList<Card> getHand() {
		return m_hand;
	}

	public void addDealtCard(Card card) {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}

}
