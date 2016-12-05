package model;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class CardTest {
	
	@Test
	public void CardHasValueSeven(){
		Card card = new Card("Seven", "HEART");
		assertEquals("Wrong value of card", "Seven", card.getValue());
	}
	
	
	
}
