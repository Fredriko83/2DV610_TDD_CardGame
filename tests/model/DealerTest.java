package model;

import static org.junit.Assert.*;
import static org.mockito.MockitoAnnotations.initMocks;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

public class DealerTest {

	
	@Mock
	private Deck testDeck;
	@Mock
	private Card card = new Card(Card.Value.Ace, Card.Suite.Clubs);
	@Mock
	private ArrayList<Card> m_hand = new ArrayList<Card>();
	
	@InjectMocks
	private Dealer sut;

	@Before
	public void setUp() throws Exception {
		//card = mock(Card.class);
		//sut = new Dealer(testDeck);
		initMocks(this);
	}

	@Test
	public void getHandReturnsAnArrayList() {
		assertEquals(true, sut.getHand() instanceof ArrayList);
	}

	// @Test
	// public void checkThatDeckIsInitilized() {
	// sut = new Dealer(testDeck);
	// verify(testDeck, Mockito.times(1)).init();
	// }

	@Test
	public void addDealtCardCallsAddOnHand() {
		sut.addDealtCard(card);
		Mockito.verify(m_hand).add(Mockito.any());
	}

}
