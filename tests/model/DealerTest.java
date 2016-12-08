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

	
	@Spy private Deck m_deck;
	@Mock private Card card;
	//@Mock private Card card2;
	//@Mock private Card card3;
	@Mock private ArrayList<Card> m_hand;
	
	
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
	public void sumUpCards() {		
		Card card2 = mock(Card.class);
		Mockito.when(card2.getValue()).thenReturn("Two");
		Mockito.when(card2.getSuite()).thenReturn("Suite");
		sut.addDealtCard(card2);
		System.out.println(sut.calcHandValue());
		assertEquals("Doesn't return right score", "Two", sut.calcHandValue());
	}
}
