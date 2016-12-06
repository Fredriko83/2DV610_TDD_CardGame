package model;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.LinkedList;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;
import org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class DeckTest {
		
	@Mock private ArrayList<Card> cards;
    @Mock private Card card = new Card(Card.Value.Two, Card.Suite.Hearts);
    @InjectMocks private Deck sut;
    
	@Test	
	public void getCardIsCalled() {		
		sut.getCard();
		Mockito.verify(cards).remove(0);		
	}
	
	@Test	
	public void cardsLeftIsCalled() {		
		sut.cardsLeft();
		Mockito.verify(cards).size();		
	}
	
	@Test	
	public void getLastCardIsCalled() {		
		sut.getLastCard();
		Mockito.verify(cards).size();		
	}	
}
