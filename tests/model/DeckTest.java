package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class DeckTest {
	
	Deck sut = null;
	Card card = null;
	
	@Test
	public void firstCardUnshuffledDeckShouldBeTwoOfHearts() {
		sut = new Deck();
		assertEquals("First card should have value Two", Card.Value.Two, ( sut.getCard()).getValue());
		assertEquals("First card should have suite Hearts", Card.Suite.Hearts, sut.getCard().getSuite());
	}
	
	@Test
	public void newDeckShouldHave52Cards() {
		sut = new Deck();
		assertEquals("New deck doesn't contain 52 cards", 52, sut.cardsLeft());
	}

}
