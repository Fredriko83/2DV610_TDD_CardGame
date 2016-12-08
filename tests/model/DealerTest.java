package model;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.MockitoAnnotations.initMocks;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;

import view.ConsoleView;

public class DealerTest {

	
	@Mock private Deck m_deck;
	@Mock private Card card;	
	@Spy private ArrayList<Card> m_hand;
	
	
	@InjectMocks private Dealer sut;

	@Before
	public void setUp() throws Exception {
		
		initMocks(this);
	}

	@Test
	public void getHandReturnsAnArrayList() {
		assertEquals(true, sut.getHand() instanceof ArrayList);
	}	

	@Test
	public void addDealtCardCallsAddOnHand() {
		sut.addDealtCard(card);
		Mockito.verify(m_hand, Mockito.times(1)).add(card);
	}
		
	@Test
	public void returnOneCardValue() {		
		Card card2 = mock(Card.class);
		Mockito.when(card2.getValue()).thenReturn("Two");
		Mockito.when(card2.getSuite()).thenReturn("Suite");
		sut.addDealtCard(card2);
		System.out.println(sut.calcHandValue());
		assertEquals("Doesn't return right score", 2, sut.calcHandValue());
	}
	
	@Test
	public void sumUpTwoCardValues() {		
		Card card2 = mock(Card.class);
		Mockito.when(card2.getValue()).thenReturn("Two");
		Card card3 = mock(Card.class);
		Mockito.when(card3.getValue()).thenReturn("Knight");
		
		//Mockito.when(card2.getSuite()).thenReturn("Suite");
		sut.addDealtCard(card2);
		sut.addDealtCard(card3);
		System.out.println(sut.calcHandValue());
		assertEquals("Doesn't return right score", 12, sut.calcHandValue());
	}
	
	@Test
	public void sumUpTwoCardValues2() {		
		Card card2 = mock(Card.class);
		Mockito.when(card2.getValue()).thenReturn("Two");
		Card card3 = mock(Card.class);
		Mockito.when(card3.getValue()).thenReturn("Knight");		
		
		sut.addDealtCard(card2);
		sut.addDealtCard(card3);
		System.out.println(sut.calcHandValue());
		assertEquals("Doesn't return right score", 12, sut.calcHandValue());
	}
	
	@Test
	public void sumUpOneCardOfEachValue() {		
		for (int i=0; i<13; i++){	 
			card = mock(Card.class);
			Mockito.when(card.getValue()).thenReturn(Card.Value.values()[i].toString());
			sut.addDealtCard(card);
			}
		assertEquals("Doesn't return right score", 85 , sut.calcHandValue());
	}
}
