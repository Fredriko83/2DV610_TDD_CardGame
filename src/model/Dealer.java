package model;

import java.util.ArrayList;

public class Dealer {
	private ArrayList<Card> m_hand;
	private Deck m_deck;
	
	public Dealer() {
		m_hand = new ArrayList<Card>();
		
	}

	public ArrayList<Card> getHand() {
		return m_hand;
	}

	public void addDealtCard(Card card) {
		m_hand.add(card);
	}

	public String calcHandValue() {
		System.out.println(m_hand);
		return (String) m_hand.get(0).getValue();
		
	}

}
