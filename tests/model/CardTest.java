package model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CardTest {
	
	Card sut = null;
	
	@Test
	public void CardHasValueSeven(){
		sut = new Card(Card.Value.Seven, Card.Suite.Hearts);
		assertEquals("Wrong value of card", Card.Value.Seven, sut.getValue());
	}
	
	@Test
	public void CardHasSuiteHearts(){
		sut = new Card(Card.Value.Seven, Card.Suite.Hearts);
		assertEquals("Wrong suite of card", Card.Suite.Hearts, sut.getSuite());
	}
		
	@Test(expected=IllegalArgumentException.class)
	public void nullForCardValueShouldThrowException() throws Exception {
		new Card(null, Card.Suite.Hearts);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void nullForSuiteShouldThrowException() throws Exception {
		new Card(Card.Value.Seven, null);
	}
	
	
}
