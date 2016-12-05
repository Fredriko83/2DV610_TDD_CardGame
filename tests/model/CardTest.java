package model;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class CardTest {
	
	Card sut = null;
	
	@Test
	public void CardHasValueSeven(){
		sut = new Card(Card.Value.Seven, Card.Suite.Hearts);
		assertEquals("Wrong value of card", Card.Value.Seven, card.getValue());
	}
		
	@Test(expected=IllegalArgumentException.class)
	public void nullForCardValueShouldThrowException() throws Exception {
		new Card(null, Card.Suite.Hearts);
	}
}
