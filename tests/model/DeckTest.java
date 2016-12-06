package model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DeckTest {
	
	Deck sut = null;
	Card card = null;
	
	@Before
	public void setUp() throws Exception {
		sut = new Deck();
	}
	
	@Test
	public void firstCardUnshuffledDeckShouldBeTwoOfHearts() {		
		assertEquals("First card should have value Two", Card.Value.Two, ( sut.getCard()).getValue());
		assertEquals("First card should have suite Hearts", Card.Suite.Hearts, sut.getCard().getSuite());
	}
	
	@Test
	public void newDeckShouldHave52Cards() {		
		sut = new Deck();
		assertEquals("New deck doesn't contain 52 cards", 52, sut.cardsLeft());
	}
	
	@Test
	public void lastCardUnshuffledDeckShouldBeAceOfClubs() {		
		assertEquals("Last card should have value Ace", Card.Value.Ace, ( sut.getCard()).getValue());
		assertEquals("Last card should have suite Clubs", Card.Suite.Clubs, sut.getCard().getSuite());
	}

}
