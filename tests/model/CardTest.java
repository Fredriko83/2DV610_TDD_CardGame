package model;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class CardTest {
	
	@Test
	public void CardHasValueSeven(){
		Card card = new Card(Card.Value.Seven, Card.Suite.Hearts);
		assertEquals("Wrong value of card", Card.Value.Seven, card.getValue());
	}
		
	@Test(expected=Exception.class)
	public void nullForCardValueShouldThrowException() throws Exception {
		new Card(null, Card.Suite.Hearts);
	}	
}
