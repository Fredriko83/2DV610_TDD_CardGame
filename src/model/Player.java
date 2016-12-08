package model;

import java.util.ArrayList;

public class Player {
	private ArrayList<Card> m_hand;
	private Deck m_deck;

	public Player() {
		m_hand = new ArrayList<Card>();

	}

	public ArrayList<Card> getHand() {
		return m_hand;
	}

	public void addDealtCard(Card card) {
		m_hand.add(card);
	}

	public int calcHandValue() {

		int totalValue = 0;
		int value;
		for (int i = 0; i < m_hand.size(); i++) {
			switch ((String) m_hand.get(i).getValue()) {
			case "Ace":
				value = 1;
				break;
			case "Two":
				value = 2;
				break;
			case "Three":
				value = 3;
				break;
			case "Four":
				value = 4;
				break;
			case "Five":
				value = 5;
				break;
			case "Six":
				value = 6;
				break;
			case "Seven":
				value = 7;
				break;
			case "Eight":
				value = 8;
				break;
			case "Nine":
				value = 9;
				break;

			default:
				value = 10;
				break;
			}
			totalValue += value;
		}
		return totalValue;
	}

}
