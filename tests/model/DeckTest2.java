package model;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DeckTest2 {
		
	@Mock private ArrayList<Card> cards;
	@Mock private CardFactory CF;
	@Mock private Card card = new Card(Card.Value.Two, Card.Suite.Hearts);
    	
	//@InjectMocks private Deck sut = new Deck(CF);
	
    
	
	@Test	
	public void cardFactoryCalled52Times() {		
		
		when(CF.createCard(any(), any())).thenReturn(card);
		
	}
	
	
}
